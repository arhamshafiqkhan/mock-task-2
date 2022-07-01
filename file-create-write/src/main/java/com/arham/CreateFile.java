package com.arham;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void createFile(String filePath) {
        File file = new File(filePath);
        Path myPath = Paths.get(filePath);
        if (Files.exists(myPath))
            System.out.println("File already exist");
        else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
