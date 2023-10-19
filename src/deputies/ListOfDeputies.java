package deputies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListOfDeputies {

    Scanner scanner =  new Scanner(System.in);
    Main main = new Main(scanner);

    private List<Deputies> listOfDeputies = new ArrayList<>();

    public List<Deputies> getListOfDeputies() {
        return listOfDeputies;
    }

    public ListOfDeputies(){

        listOfDeputies.add(new Deputies("Крупа", "Царко", 70, 180 , false));
        listOfDeputies.add(new Deputies("Крупа", "Царко",65, 170 , false));
        listOfDeputies.add(new Deputies("Каховський", "Хорив",80, 185 , true));

    }

   /* public void output(){

        System.out.println("Оберіть депутата:");
        Iterator <Deputies> iterator = listOfDeputies.iterator();
        int count = 1;

        while (iterator.hasNext()){
            Deputies next = iterator.next();
            System.out.println(count + ". " + next);
            count++;
        }
        int choice = main.scanner.nextInt() - 1;
        Deputies choiceDeputies = (Deputies)listOfDeputies.get(choice);
        choiceDeputies.giveBride();

    }

    /* public void add() {

        Iterator <Deputies> iterator1 = listOfDeputies.iterator();
        while (iterator1.hasNext()){
            Deputies next = iterator1.next();
            System.out.println(next);
        }

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
        Boolean newDeputies = (bride == 1) ? true : false;

        Deputies newdeputies = new Deputies(firstName, lastName, weight, height, newDeputies);

        listOfDeputies.add(newdeputies);

        Iterator <Deputies> iterator = listOfDeputies.iterator();
        while (iterator.hasNext()){
            Deputies next = iterator.next();
            System.out.println(next);
        }
    }*/

}
