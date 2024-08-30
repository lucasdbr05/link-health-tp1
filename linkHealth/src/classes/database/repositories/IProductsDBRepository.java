package classes.database.repositories;

import java.io.IOException;
import java.util.ArrayList;

import classes.Produto;

public interface IProductsDBRepository extends IDatabaseRepository {
    Produto findOne(int id) throws IOException;
    ArrayList<Produto> findAll() throws IOException;
    ArrayList<Produto> findAllByUser(int userId) throws IOException;
    Produto update(Produto user) throws IOException;
    Produto create(Produto usuario) throws IOException;
    Produto deleteProduto(int id) throws IOException;
    Produto fromStringToProductObject(String data);
}