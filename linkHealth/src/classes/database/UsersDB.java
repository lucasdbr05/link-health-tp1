package classes.database;

import java.io.IOException;
import java.util.ArrayList;

import classes.Distribuidor;
import classes.FormaDePagamento;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import classes.Usuario;
import classes.database.repositories.IUsersDBRepository;

public   class UsersDB extends Database implements IUsersDBRepository {
    static String file = "C:\\Users\\emers\\OneDrive\\Documentos\\projetos\\projeto-tp1\\link-health-tp1\\linkHealth\\src\\classes\\database\\data\\usuarios.txt";

    @Override
    public Usuario  findOne(int id) throws IOException, IOException {
        String[] usersRows = this.splitFileWrite(this.fileReader(file));

        for(String row: usersRows) {
            Usuario user = this.fromStringToUserObject(row);
            if(user.getId() == id) return user;
        }
        throw new UnsupportedOperationException("User not found");
    }
    
    public Usuario  findOne(String inCPF, String inPasw, int tipoLog) throws IOException, IOException {
        String[] usersRows = this.splitFileWrite(this.fileReader(file));
        
        // tipoLog - > define quem está fazendo login 
        // 0 - > define um distribuidor
        // 1 - > define uma pessoa fisica
        // 2 - > define uma pessoa juridica
        // Se a senha for 0 estou checando se existe algum usuario
        // com esse CPF
        
        for(String row: usersRows) {
            Usuario user = this.fromStringToUserObject(row);
            
            System.out.println(user.getNome());
            
            if(tipoLog == 1 && user instanceof PessoaFisica && ((PessoaFisica)user).getCpf().equals(inCPF) && (user.getSenha().equals(inPasw) || inPasw.equals("0"))){
                return user;
            }
            if(tipoLog == 0 && user instanceof Distribuidor && ((Distribuidor)user).getCnpj().equals(inCPF) && (user.getSenha().equals(inPasw) || inPasw.equals("0")))
                return user;
            
            if(tipoLog == 2 && user instanceof PessoaJuridica && ((PessoaJuridica)user).getCnpj().equals(inCPF) && (user.getSenha().equals(inPasw) || inPasw.equals("0")))
                return user;
        }
        throw new UnsupportedOperationException("User not found");
    }

    @Override
    public ArrayList<Usuario> findAll() throws IOException {
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        String[] usersRows = this.splitFileWrite(this.fileReader(file));

        for(String row: usersRows) {
            Usuario user = this.fromStringToUserObject(row);
            users.add(user);
        }

        return users;
    }

    @Override
    public Usuario update(int id, Usuario updatedUsuario) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Usuario create(Usuario usuario) throws IOException {
        String data = "";       
        int id;
        try{
            id = this.getNextId(file, 1);
        }catch(Exception e){
            id = 0;
        }
        usuario.setId(id);
        if(usuario instanceof PessoaFisica){
            data = ((PessoaFisica)usuario).toString();
        } else if (usuario instanceof PessoaJuridica) {
            System.out.println("DD");
            data = ((PessoaJuridica)usuario).toString();
        } else if (usuario instanceof Distribuidor){
            //TODO: HAHAHA
        }

        this.fileWriter(file, data);

        return usuario;
    }

    @Override
    public Usuario deleteUsuario(int id) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUsuario'");
    }

    @Override
    public Usuario fromStringToUserObject(String userSplited2) {
        String[] userSplited = this.splitRowString(userSplited2);
        int id = Integer.parseInt(userSplited[1]);
        String nome = userSplited[2];
        String senha = userSplited[3];
        ArrayList<String> address = new ArrayList<String>();

        for(String s: userSplited[4].split(";")) {
            address.add(s);
        }

        ArrayList<FormaDePagamento> formaDePagamento = new ArrayList<FormaDePagamento>(); // TODO: FIND A WAY TO STORE IT IN DATABASE (userSplited[5])

    
            if(userSplited[0].equals( "PESSOA_FISICA")){
                String cpf = userSplited[6];
                int idade = Integer.parseInt(userSplited[7]);
                boolean receita = userSplited[8].equals("true") ? true: false;
                

                PessoaFisica pf = new PessoaFisica(id, nome, senha, address, formaDePagamento, cpf, idade, receita);
                return pf;
            }
            else if(userSplited[0].equals( "PESSOA_JURIDICA")){

                String cnpj= userSplited[6];
                boolean isHospital = userSplited[7].equals("true") ? true: false;
                
                
                PessoaJuridica pj = new PessoaJuridica(id, nome, senha, address, formaDePagamento, cnpj, isHospital);
                return pj;
                
            }
            else if (userSplited[0].equals( "DISTRIBUIDOR")){
                return new PessoaFisica();

            }
                
            return new PessoaFisica();
        }
    }

