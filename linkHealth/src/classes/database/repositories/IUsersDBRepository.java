package classes.database.repositories;

import java.io.IOException;
import java.util.ArrayList;

import classes.Usuario;

public interface IUsersDBRepository extends IDatabaseRepository {
    Usuario findOne(int id) throws IOException;
    ArrayList<Usuario> findAll() throws IOException;
    Usuario update(int id, Usuario updatedUsuario) throws IOException;
    Usuario create(Usuario usuario) throws IOException;
    Usuario deleteUsuario(int id) throws IOException;
    Usuario fromStringToUserObject(String data);
}
