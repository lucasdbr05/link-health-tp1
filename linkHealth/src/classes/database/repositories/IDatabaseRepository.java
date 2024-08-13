package classes.database.repositories;

import java.io.IOException;

public interface IDatabaseRepository {
    void fileClear(String path) throws IOException;
    String fileReader(String path) throws IOException;
    void fileWriter(String path, String row) throws IOException;
    String[] splitRowString(String row);
    String[] splitFileWrite(String fileData);
}
