package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {


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


    private void rwLineFixed (Path pathRead, Path pathWrite) throws IOException {

        try (BufferedReader in = new BufferedReader(null);
             BufferedWriter out = new BufferedWriter(null)) {
            out.write(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}