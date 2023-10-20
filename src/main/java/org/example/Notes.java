package org.example;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notes {
    public void notes(String input) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd,MM,yyyy");
        String currentDate = String.valueOf(dateFormat.format(date));

        File myFile = new File("notes.txt");
        try {
            FileOutputStream outputStream = new FileOutputStream(myFile);
            byte[] buffer = input.getBytes();
            outputStream.write(currentDate.getBytes());
            outputStream.write("  ".getBytes());
            outputStream.write(buffer);
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}