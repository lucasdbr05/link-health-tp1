package classes.database.repositories;

import java.io.IOException;
import java.util.ArrayList;

import classes.Compra;

public interface IComprasDBRepository extends IDatabaseRepository {
    Compra findOne(int id) throws IOException;
    ArrayList<Compra> findAll() throws IOException;
    Compra update(Compra user) throws IOException;
    Compra create(Compra usuario) throws IOException;
    Compra deleteCompra(int id) throws IOException;
    Compra fromStringToBuyObject(String data);
    
}
