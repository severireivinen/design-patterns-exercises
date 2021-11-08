package model;

import controller.IFileHandler;

import java.io.IOException;

public abstract class EncryptionDecorator implements IFileHandler {
    protected IFileHandler encryptingHandler;

    public EncryptionDecorator(IFileHandler handler) {
        this.encryptingHandler = handler;
    }

    public String readFile(IFile file) throws IOException {
        return encryptingHandler.readFile(file);

    }

    public void writeFile(IFile file) throws IOException {
        encryptingHandler.writeFile(file);
    }
}
