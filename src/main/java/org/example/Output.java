package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Output {
    public void outputMassage(String fileName) {
        String st;
        File file = new File(fileName);
        try {
            BufferedReader br
                    = new BufferedReader(new FileReader(file));


            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
