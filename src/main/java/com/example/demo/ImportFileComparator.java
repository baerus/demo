package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

public class ImportFileComparator implements Comparator<File> {

    @Override
    public int compare(File file1, File file2) {
        try {
            String type1 = extractType(file1);
            String type2 = extractType(file2);
            return type1.compareTo(type2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private String extractType(File f) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String s = br.readLine();
        br.close();
        return s;
    }
}
