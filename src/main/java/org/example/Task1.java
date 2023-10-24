package org.example;

import java.io.*;
import java.nio.file.Path;

public class Task1 {
    public static void main(String[] args) throws IOException {

        rwLineFixed(Path.of("pom.xml"), Path.of("test.txt"));
    }


    private static void rwLineFixed(Path pathRead, Path pathWrite) throws IOException {

        try (BufferedReader in = new BufferedReader(new FileReader(pathRead.toFile()));
             BufferedWriter out = new BufferedWriter(new FileWriter(pathWrite.toFile()))) {
            out.write(in.readLine());
        }
    }

    private void rwLine (Path pathRead, Path pathWrite) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = new BufferedReader(in);
            out = new BufferedWriter(out);
            out.write(in.readLine());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e){

            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e){

            }
        }
    }

}