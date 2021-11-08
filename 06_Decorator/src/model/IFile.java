package model;

import java.io.IOException;

public interface IFile {
    String getName();

    String getContent();

    void setContent(String content);
}
