package model;

import controller.IFileHandler;

import java.io.FileWriter;
import java.io.IOException;

public class Encryption extends EncryptionDecorator {

    public Encryption(IFileHandler handler) {
        super(handler);
    }

    @Override
    public String readFile(IFile file) throws IOException {
        System.out.println("Decrypting: " + file.getName());
        decrypt(file);
        return super.readFile(file);
    }

    @Override
    public void writeFile(IFile file) throws IOException {
        super.writeFile(file);
        System.out.println("Encrypting: " + file.getName());
        encrypt(file);
    }

    private void encrypt(IFile file) throws IOException {
        FileWriter writer = new FileWriter(file.getName() + ".txt");
        String encryptedContent = new StringBuilder(file.getContent()).reverse().toString();
        file.setContent(encryptedContent);
        writer.write(encryptedContent);
        writer.close();
    }

    private void decrypt(IFile file) throws IOException {
        FileWriter writer = new FileWriter(file.getName() + ".txt");
        String encryptedContent = new StringBuilder(file.getContent()).reverse().toString();
        file.setContent(encryptedContent);
        writer.write(encryptedContent);
        writer.close();
    }
}
