package MethodandClasses.FileHandling.Demo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class KeywordDemo {
    public static void main(String[] args) {
        String folderPath = "C:/testFile";
        String keyword = "Lorem";
        searchFiles(folderPath, keyword);
    }

    private static void searchFiles(String folderPath, String keyword) {
        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            System.out.println("Invalid folder path: " + folderPath);
            return;
        }
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    int lineNumber = 1;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.printf("Found keyword '%s' in file %s, line %d: %s\n", keyword, file.getName(), lineNumber, line);
                        }
                        lineNumber++;
                    }
                } catch (IOException e) {
                    System.out.println("Error reading file " + file.getName() + ": " + e.getMessage());
                }
            }
        }
    }
}

