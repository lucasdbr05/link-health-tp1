package classes.database.repositories;

import java.io.IOException;

public interface IDatabaseRepository {
    void fileClear(String path) throws IOException;
    String fileReader(String path) throws IOException;
    void fileWriter(String path, String row) throws IOException;
    String[] splitRowString(String row);
    String[] splitFileWrite(String fileData);
    // void fileUpdate(String path, String newData)
    // void fileDeleteRow(String path, String newData)
    int getNextId(String path, int idPosition) throws IOException;
}