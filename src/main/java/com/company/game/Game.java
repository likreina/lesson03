package com.company.game;
import java.util.Random;
import java.util.Scanner;

class Game{
    public static void main(String args[]) {

        final int min = 1;
        final int max = 1000000000;

        Random r = new Random();
        int ranNumber = 0;

        System.out.println("Здравствуйте. С вами на связи Ваш компьютер ASUS." +
                "Мне стало немного скучно. Давайте поиграем? Загадайте число от " + min +" до " + max);
        System.out.println("Давайте договоримся об условиях." +
                "Если я угадываю Ваше число, то Вы поздравляете меня, написав 'win'," +
                "а если нет, то укажите значком < или >, если Ваше число меньше или больше предложенного мной.");
        System.out.println("Введите 'Ok', если готовы начать: ");

        Scanner sca = new Scanner(System.in);
        int tmin = min;
        int tmax = max;
        boolean win = false;
        while (!win) {
            String command = sca.nextLine().toUpperCase();
            switch (command) {
                case "OK" -> {
                    ranNumber = r.nextInt(max - min + 1) + min;
                    System.out.println(ranNumber);
                }
                case "WIN" -> win = true;
                case ">" -> {
                    tmin = ranNumber;
                    ranNumber = ranNumber + (tmax - tmin) / 2;
                    System.out.println(ranNumber);
                }
                case "<" -> {
                    tmax = ranNumber;
                    ranNumber = ranNumber - (tmax - tmin) / 2;
                    System.out.println(ranNumber);
                }
            }
        }
        System.out.println("Ура, я угадал Ваше число!");
    }
}