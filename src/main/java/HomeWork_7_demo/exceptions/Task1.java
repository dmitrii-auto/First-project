package HomeWork_7_demo.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {

    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try {
            FileReader fileReader = new FileReader("data.txt");
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }



}
