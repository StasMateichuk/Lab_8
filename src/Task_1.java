

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public void userInput(int minRange, int maxRange) {
        if (minRange >= maxRange) {
            System.out.println("Некоректне введення! x не може бути більше за y. Спробуйте ще раз.");
        }
    }

    public void numberRandomizer(File fileName, int minRange, int maxRange, int count) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\stas1\\OneDrive\\Documents\\Лапітєх\\3 семестр\\ООП\\" + fileName + ".txt"));
            writer.write("Ваше мінімальне значення: " + minRange + ". Ваше максимальне значення: " + maxRange + "\n");

            Random random = new Random();
            for (int i = 1; i <= count; i++) {
                int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                writer.write("Згенероване число " + i + ": " + randomNumber + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void infoReader(File fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\stas1\\OneDrive\\Documents\\Лапітєх\\3 семестр\\ООП\\" + fileName + ".txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
