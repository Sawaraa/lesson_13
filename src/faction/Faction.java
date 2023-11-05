package faction;

import deputies.Deputies;
import deputies.Main;

import java.util.*;

public class Faction {

    private String name;
    private static List<Deputies> listOfDeputies = new ArrayList<>();

    public Faction(){}

    public Faction(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(String firstName, String lastName, int weight, int height, int bride, int amount) {
        boolean newDeputies = (bride == 1) ? true : false;
        Deputies newdeputies = new Deputies(firstName, lastName, weight, height, newDeputies);
        newdeputies.giveBride(amount);
        listOfDeputies.add(newdeputies);

        Iterator<Deputies> iterator = listOfDeputies.iterator();

        while (iterator.hasNext()) {
            Deputies next = iterator.next();
            System.out.println(next);
        }

    }

    public void remove(String name, String lastName) {

        Iterator<Deputies> iterator = listOfDeputies.iterator();

        while (iterator.hasNext()) {
            Deputies next = iterator.next();
            System.out.println(next);
        }

        for (int i = 0; i < listOfDeputies.size(); i++) {
            Deputies deputies = listOfDeputies.get(i);
            if (deputies.getFirstName().equalsIgnoreCase(name) && deputies.getLastName().equalsIgnoreCase(lastName)) {
                listOfDeputies.remove(i);
                System.out.println("Депутат " + name + " " + lastName + " був видалений зі списку");
                return;
            }
        }

    }

    public void outputAllTrueBride() {

        //   Iterator<Deputies> iterator = listOfDeputies.iterator();

        for (Deputies deputies : listOfDeputies) {
            if (deputies.isBride()) {
                System.out.println(deputies +" Хабар: " + deputies.getAmount());
            }
        }

    }

    public  void  outputBiggestBride(){
        if (listOfDeputies.isEmpty()) {
            System.out.println("Список депутатів порожній.");
            return;
        }

        Deputies biggestBriber = Collections.max(listOfDeputies);
        int maxAmount = biggestBriber.getAmount();

        System.out.println("Найбільший хабарник(и):");

        for (Deputies deputies : listOfDeputies) {
            if (deputies.getAmount() == maxAmount) {
                System.out.println(deputies + " Хабар: " + deputies.getAmount());
            }
        }
    }

    public void outputAll(){

        Iterator<Deputies> iterator = listOfDeputies.iterator();

        while (iterator.hasNext()) {
            Deputies next = iterator.next();
            System.out.println(next);
        }

    }

    public void removeAll(){

        Iterator<Deputies> iterator = listOfDeputies.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

    }

    @Override
    public String toString() {
        return "Function{" +
                "name='" + name + '\'' +
                '}';
    }



   /* public void list(){
        System.out.println("1. Дадати депутата");
        System.out.println("2. Видалити депутата");
        System.out.println("3. Вивести всіх хабарників у фракції");
        System.out.println("4. Вивести найбільшого хабарника у фракції");
        System.out.println("5. Вивести всіх депутатів фракції");
        System.out.println("6. Очистити всю фракцію від депутатів");
    }

   /* public void menu(){

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

    }*/

}
