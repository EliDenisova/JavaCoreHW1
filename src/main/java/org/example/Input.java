package org.example;

import java.util.Scanner;

public class Input {
    public String inputMassage() {
        String massage = null;
       try {
           Scanner scanner = new Scanner(System.in);
           massage = scanner.nextLine();
       }catch (Exception e) {
           System.out.println("e");
       }
       return massage;
    }


}
