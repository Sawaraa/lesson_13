package faction;

import deputies.Deputies;
import deputies.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction {

    Scanner scanner = new Scanner(System.in);
    Main main = new Main(scanner);
    Function function = new Function();

    public void list(){
        System.out.println("1. Дадати депутата");
        System.out.println("2. Видалити депутата");
        System.out.println("3. Вивести всіх хабарників у фракції");
        System.out.println("4. Вивести найбільшого хабарника у фракції");
        System.out.println("5. Вивести всіх депутатів фракції");
        System.out.println("6. Очистити всю фракцію від депутатів");
    }

    public void menu(){

        while (true){
            list();

            System.out.println("Оберіть дію");
            int choice = main.scanner.nextInt();

            switch (choice) {
                case 1:
                    function.add();
                    break;
                case 2:
                    function.remove();
                    break;
                case 3:
                    function.outputAllTrueBride();
                    break;
                case 4:
                    function.outputBiggestBride();
                    break;
                case 5:
                    function.outputAll();
                    break;
                case 6:
                    function.removeAll();
                    break;
                default:
                    System.out.println("Ви ввели неправильне число");
            }


        }

    }

}
