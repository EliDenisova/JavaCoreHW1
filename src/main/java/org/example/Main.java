package org.example;
import org.example.Notes;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        Notes notes = new Notes();
        System.out.println("Введите заметку");
        String massage = input.inputMassage();
        notes.notes(massage);
        output.outputMassage("notes.txt");
    }
}