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
    
    // quem for rodar não esquece de colocar a path pro seu arquivo
    // não sei como padronizar isso
    
    @Override
    public Usuario  findOne(int id) throws IOException {
        String[] usersRows = this.splitFileWrite(this.fileReader(file));

        for(String row: usersRows) {
            Usuario user = this.fromStringToUserObject(row);
            if(user.getId() == id) return user;
        }
        throw new UnsupportedOperationException("User not found");
    }
    
    public Usuario  findOne(String inCPF, String inPasw, int tipoLog) throws IOException, IOException {
        
        String[] usersRows = this.splitFileWrite(this.fileReader(file));
        String patCnpj  = "  .   .   /    -  ";
        String patCpf = "   .   .   -  ";
        
        // tipoLog - > define quem está fazendo login 
        // 0 - > define um distribuidor
        // 1 - > define uma pessoa fisica
        // 2 - > define uma pessoa juridica
        // Se a senha for 0 estou checando se existe algum usuario
        // Se o CPF ou CNPJ for o pattern estou checando se essa senha existe
        // com esse CPF
        
        System.out.println("Achei aqui!!");

        for(String row: usersRows) {

            System.out.println(row);

            Usuario user = this.fromStringToUserObject(row);
            
            System.out.println(user.getNome());
            if(tipoLog == 1 && user instanceof PessoaFisica && (patCpf.equals(inCPF)) && (user.getSenha().equals(inPasw))){
                return user;
            }
            if(tipoLog == 0 && user instanceof Distribuidor && (patCnpj.equals(inCPF) && (user.getSenha().equals(inPasw))))
                return user;
            
            if(tipoLog == 2 && user instanceof PessoaJuridica && patCnpj.equals(inCPF) && (user.getSenha().equals(inPasw)))
                return user;
            
            if(tipoLog == 1 && user instanceof PessoaFisica && ((PessoaFisica)user).getCpf().equals(inCPF) && (user.getSenha().equals(inPasw) || inPasw.equals("0"))){
                return user;
            }
            if(tipoLog == 0 && user instanceof Distribuidor && ((Distribuidor)user).getCnpj().equals(inCPF) && (user.getSenha().equals(inPasw) || inPasw.equals("0")))
                return user;
            
            if(tipoLog == 2 && user instanceof PessoaJuridica && ((PessoaJuridica)user).getCnpj().equals(inCPF) && (user.getSenha().equals(inPasw) || inPasw.equals("0")))
                return user;
        }
        
        return null;
        // throw new UnsupportedOperationException("User not found");
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
    public Usuario create(Usuario usuario) throws IOException {
        String data = "";       
        int id;
        try{
            id = this.getNextId(file, 1);

        }catch(Exception e){
            id = 1;
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
        
        this.fileClear(file);
        String[] usersRows = this.splitFileWrite(this.fileReader(file));
        
        Usuario removedUser = null;
        
        if(usersRows.length == 0) {
            return null;
        }
        
        String[] newRows = new String[usersRows.length -1];
       
        for(int i=0, j=0; i< usersRows.length; i++) {
            Usuario user = this.fromStringToUserObject(usersRows[i]);
            if(id == user.getId()) {
                removedUser = user;
                continue;
            }
            newRows[j++] = usersRows[i]; 
        }
        
        this.fileWriteRows(file, newRows);
        return removedUser;
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
        
        if(userSplited[0].equals("PESSOA_FISICA")){
            String cpf = userSplited[7];
            int idade = Integer.parseInt(userSplited[8]);
            
            boolean receita = userSplited[9].equals("true") ? true: false;


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


    @Override
    public Usuario update(Usuario newUserData) throws IOException {
        this.fileClear(file);
        String[] usersRows = this.splitFileWrite(this.fileReader(file));
        
        
        for(int i=0; i< usersRows.length; i++) {
            Usuario user = this.fromStringToUserObject(usersRows[i]);
            if(newUserData.getId() == user.getId()) {
                usersRows[i] = newUserData.toString();
            }
        }
        
        this.fileWriteRows(file, usersRows);
        
        return newUserData;
    }
    }

