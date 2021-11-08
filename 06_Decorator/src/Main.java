import controller.IFileHandler;
import controller.TextFileHandler;
import model.Encryption;
import model.IFile;
import model.TextFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        IFile file = new TextFile("file");
        IFileHandler normalHandler = new TextFileHandler(); // Normal handler
        IFileHandler encryptionHandler = new Encryption(normalHandler); // Encryption handler

        encryptionHandler.writeFile(file);
        System.out.println(normalHandler.readFile(file));
        System.out.println(encryptionHandler.readFile(file));

    }
}
