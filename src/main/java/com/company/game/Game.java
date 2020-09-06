package com.company.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void game() {

        final int min = 1;
        final int max = 1000000000;

        Random r = new Random();
        int ranNumber = 0;

        System.out.println("Здравствуйте. С вами на связи Ваш компьютер ASUS." +
                "Мне стало немного скучно. Давайте поиграем? Загадайте число от " + min + " до " + max);
        System.out.println("Давайте договоримся об условиях." +
                "Если я угадываю Ваше число, то Вы поздравляете меня, написав 'win'," +
                "а если нет, то укажите значком < или >, если Ваше число меньше или больше предложенного мной.");
        System.out.println("Введите 'Ok', если готовы начать: ");

        Scanner scanner = new Scanner(System.in);
        int smin = min;
        int smax = max;
        boolean win = false;
        while (!win) {
            String s = scanner.nextLine().toUpperCase();

            if (s.contains("OK")) {
                ranNumber = r.nextInt(max - min + 1) + min;
                System.out.println(ranNumber);
            }

            if (s.contains("WIN")) {
                win = true;
            }

            if (s.contains(">")) {
                smin = ranNumber;
                ranNumber = ranNumber + (smax - smin) / 2;
                System.out.println(ranNumber);
            }

            if (s.contains("<")) {
                smax = ranNumber;
                ranNumber = ranNumber - (smax - smin) / 2;
                System.out.println(ranNumber);
            }
        }
        System.out.println("Ура, я угадал Ваше число!");
    }

}