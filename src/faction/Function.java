package faction;

import deputies.Deputies;
import deputies.Main;

import java.util.*;

public class Function {
    String name;
    Scanner scanner = new Scanner(System.in);
    Main main = new Main(scanner);

    // Deputies deputies = new Deputies();
    private static List<Deputies> listOfDeputies = new ArrayList<>();

    public Function(){}

    public Function(String name){
        this.name = name;
        this.listOfDeputies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public static List<Deputies> getListOfDeputies() {
        return listOfDeputies;
    }

    public void add() {

        System.out.println("Ведіть дані:" + "\n" + " Ім'я: ");
        String firstName = main.scanner.next();
        System.out.println("Призвіще: ");
        String lastName = main.scanner.next();
        System.out.println("Вага: ");
        int weight = main.scanner.nextInt();
        System.out.println("Ріст: ");
        int height = main.scanner.nextInt();
        System.out.println("Хабар(оберіть 1.Правда або 2. Неправда): ");
        int bride = main.scanner.nextInt();
        Boolean newDeputies = (bride == 1) ? true : false;

        Deputies newdeputies = new Deputies(firstName, lastName, weight, height, newDeputies);

        newdeputies.giveBride();
        listOfDeputies.add(newdeputies);


        Iterator<Deputies> iterator = listOfDeputies.iterator();

        while (iterator.hasNext()) {
            Deputies next = iterator.next();
            System.out.println(next);
        }

    }

    public void remove() {

        Iterator<Deputies> iterator = listOfDeputies.iterator();

        while (iterator.hasNext()) {
            Deputies next = iterator.next();
            System.out.println(next);
        }

        System.out.println("Напишіть ім'я та фамілію депутата якого хочете видалити");

        String name = main.scanner.next();
        String lastname = main.scanner.next();

        for (int i = 0; i < listOfDeputies.size(); i++) {
            Deputies deputies = listOfDeputies.get(i);
            if (deputies.getFirstName().equalsIgnoreCase(name) && deputies.getLastName().equalsIgnoreCase(lastname)) {
                listOfDeputies.remove(i);
                System.out.println("Депутат " + name + " " + lastname + " був видалений зі списку");
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
}
