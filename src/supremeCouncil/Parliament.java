package supremeCouncil;
import deputies.Deputies;
import deputies.Main;
import faction.Function;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Parliament {

   public Scanner scanner = new Scanner(System.in);
    Main main = new Main(scanner);
    private ArrayList<Function> listOffactions;

    Function function1 = new Function();

    public Parliament() {
        this.listOffactions = new ArrayList<>();
    }
    public void list(){
        System.out.println("1. Дадати франкцію");
        System.out.println("2. Видалити франкцію");
        System.out.println("3. Вивести всі франкції");
        System.out.println("4. Вивести конкретну франкцію");
        //System.out.println("5. Вивести всіх депутатів фракції");
        //System.out.println("6. Очистити всю фракцію від депутатів");
    }

    public void menu(){
        while (true){
            list();

            System.out.println("Оберіть дію");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введіть назву фракції");
                    String name = main.scanner.next();
                    Function function = new Function(name);
                    listOffactions.add(function);
                    Iterator<Function> iterator = listOffactions.iterator();

                    while (iterator.hasNext()) {
                        Function next = iterator.next();
                        System.out.println(next);
                    }

                    break;
                case 2:
                    Iterator<Function> iterator1 = listOffactions.iterator();
                    while (iterator1.hasNext()) {
                        Function next = iterator1.next();
                        System.out.println(next);
                    }

                    System.out.println("Введіть назву фракції яку хочете видалити");
                    String deleteName = main.scanner.next();

                    for (int i = 0; i < listOffactions.size(); i++) {
                        function1 = listOffactions.get(i);
                        if (function1.getName().equalsIgnoreCase(deleteName)) {
                            listOffactions.remove(i);

                            System.out.println("Франкція " + deleteName + " була видалена зі списку");
                            System.out.println("Список франкції які залишились");

                            Iterator<Function> iterator2 = listOffactions.iterator();
                            while (iterator2.hasNext()) {
                                Function next = iterator2.next();
                                System.out.println(next);
                            }
                        }
                    }

                    break;
                case 3:
                    for (Function function2 : listOffactions){
                        System.out.println(function2);
                    }
                    break;
                case 4:
                    System.out.println("Напишіть ім'я франкції яку хочете вивести");
                    String outputName = main.scanner.next();

                    for (int i = 0; i < listOffactions.size(); i++) {
                        function1 = listOffactions.get(i);
                        if (function1.getName().equalsIgnoreCase(outputName)) {
                            System.out.println(function1);
                        }
                    }

                    break;
                default:
                    System.out.println("Ви ввели неправильне число");
            }


        }
    }
}
