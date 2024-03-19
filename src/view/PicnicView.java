package view;

import controller.PicnicController;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class PicnicView {
    PicnicController picnicController = new PicnicController();
    Scanner scanner = new Scanner(System.in);
    Boolean temp = true;
    public void run (BufferedReader br) throws IOException {
        System.out.println("Доступные команды:\n1. Подсчитать все слова в файле\n" +
                "2. Найти самое длинное слово\n" +
                "3. Вывести частоту слов\n" +
                "4. Выход");
        while(temp == true) {
            System.out.println("Введите команду: ");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    System.out.println("1");
                    System.out.println("Количесво слов в файле: "
                            + picnicController.sumOfWords(br));
                    break;
                case "2":
                    System.out.println("2");
                    System.out.println("Самое длинное слово в файле: "
                            + picnicController.longestWord(br) +
                            " длина - " + picnicController.longestWord(br).length());
                    break;
                case "3":
                    System.out.println("3");
                    picnicController.countOfWords(br);
                    break;
                case "4":
                    temp = false;
                    break;
                default:
                    System.out.println("Несуществующая команда, повторите ввод");
                    break;
            }
        }

    }

}
