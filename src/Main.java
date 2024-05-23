

import java.io.*;
import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main mainObject = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nБудь ласка, введіть режим, який ви хочете використовувати. \nЯкщо ви не знаєте які режими доступні, введіть цифру '2' для допомоги.");
            int mode = scanner.nextInt();
            scanner.nextLine();

            try {
                mainObject.handleMode(mode);
            } catch (NumberFormatException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, спробуйте ще раз.");
            }
        }
    }

    private void handleMode(int mode) {
        switch (mode) {
            case 1:
                executeFirstTask();
                break;
            case 2:
                displayHelp();
                break;
            default:
                System.out.println("\nНеправильний ввід! Будь ласка, спробуйте ще раз.");
        }
    }

    private void executeFirstTask() {
        Task_1 numberWriter = new Task_1();

        System.out.println("Введіть назву файлу: ");
        String fileName = scanner.nextLine();

        System.out.println("Введіть мінімальне значення (x): ");
        int minRange = Integer.parseInt(scanner.nextLine());

        System.out.println("Введіть максмальне значення (y): ");
        int maxRange = Integer.parseInt(scanner.nextLine());

        System.out.println("Введіть кількість випадкових чисел: ");
        int count = Integer.parseInt(scanner.nextLine());

        numberWriter.userInput(minRange, maxRange);
        numberWriter.numberRandomizer(new File(fileName), minRange, maxRange, count);
        numberWriter.infoReader(new File(fileName));
    }

    private void displayHelp() {
        System.out.println("Якщо ви напишете '1' ви получите доступ до завдання.");
        System.out.println("Якщо ви введете '2' вас перекине у вікно допомоги ще раз.");
    }
}
