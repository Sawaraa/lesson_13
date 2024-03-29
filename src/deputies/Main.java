package deputies;

import faction.Faction;
import faction.Function;
import supremeCouncil.Parliament;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void list(){
        System.out.println("1. Дадати франкцію");
        System.out.println("2. Видалити франкцію");
        System.out.println("3. Вивести всі франкції");
        System.out.println("4. Очисти конкретну франкцію");
        System.out.println("5. Вивести конкретну франкцію");
        System.out.println("6. Додати депутата в франкцію");
        System.out.println("7. Видалити депутата франкції");
        System.out.println("8. Вивести список хабарників");
        System.out.println("9. Вивести найбільшого харабарника");
    }

    public static void main(String[] args){
        Parliament parliament = Parliament.parliament;
        Scanner scanner = new Scanner(System.in);

        while (true){
            list();

            System.out.println("Оберіть дію");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Введіть ім'я");
                    String name = scanner.next();
                    parliament.add(name);
                    break;
                }
                case 2: {
                    System.out.println("Введіть ім'я франкції яку хочете видалити");
                    String name = scanner.next();
                    parliament.remove(name);
                    break;
                }
                case 3: {
                    parliament.output();
                    break;
                }
                case 4: {
                    System.out.println("Введіть ім'я франкції яку хочете очистити");
                    String name = scanner.next();
                    parliament.clear(name);
                    break;
                }
                case 5 : {
                    String name = scanner.next();
                    parliament.specificOutput(name);
                    break;

                }
                case 6 :{
                        System.out.println("Ведіть ім'я франкцію в яку хочете додати депутата");
                        String name = scanner.next();
                        Faction f = parliament.getFraction(name);
                        System.out.println("Ведіть дані:" + "\n" + " Ім'я: ");
                        String firstName = scanner.next();
                        System.out.println("Призвіще: ");
                        String lastName = scanner.next();
                        System.out.println("Вага: ");
                        int weight = scanner.nextInt();
                        System.out.println("Ріст: ");
                        int height = scanner.nextInt();
                        System.out.println("Хабар(оберіть 1.Правда або 2. Неправда): ");
                        int bride = scanner.nextInt();
                        System.out.println("Введіть суму хабаря");
                        int amount = scanner.nextInt();
                        f.add(firstName, lastName, weight, height, bride, amount);
                    break;
                }
                case 7 :{
                    Faction faction = new Faction();
                    faction.output();
                    System.out.println("Ведіть ім'я франкції в якій хочете видалити депутата");
                    String name = scanner.next();
                    System.out.println("Всі депутати в цій франкції:");
                    faction.output();
                    Faction f = parliament.getFraction(name);
                    System.out.println("Ведіть дані:" + "\n" + " Ім'я: ");
                    String firstName = scanner.next();
                    System.out.println("Призвіще: ");
                    String lastName = scanner.next();
                    f.remove(firstName, lastName);
                    break;
                }
                case 8 :{
//                    System.out.println("Ведіть ім'я франкції в якій хочете вивести список хабарників");
//                    String name = scanner.next();
                    Faction f = new Faction();
                    f.outputAllTrueBride();
                    break;
                }
                case 9 :{
                    Faction f = new Faction();
                    f.outputBiggestBride();
                    break;
                }
                default:
                    System.out.println("Ви ввели неправильне число");
            }


        }
    }

}