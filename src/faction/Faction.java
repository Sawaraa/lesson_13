package faction;

import deputies.Deputies;

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
        boolean newDeputies =  (bride == 1) ? true : false;
        Deputies newdeputies = new Deputies(firstName, lastName, weight, height, newDeputies);
        newdeputies.giveBride(amount);

        listOfDeputies.add(newdeputies);

    }

    public void remove(String name, String lastName) {

       listOfDeputies.removeIf(deputies ->
               deputies.getFirstName().equalsIgnoreCase(name) && deputies.getLastName().equalsIgnoreCase(lastName));
       System.out.println("Депутат " + name + " " + lastName + " був видалений зі списку");

    }

    public void outputAllTrueBride() {

        listOfDeputies.stream().filter(Deputies::isBride).forEach(System.out::println);

    }

    public  void  outputBiggestBride(){

//        listOfDeputies.stream().forEach(deputies -> {
//            Optional.of(deputies).stream().map(Deputies::getAmount).max(Integer::compareTo).get();
//
//        });

    }

    public void output(){
        listOfDeputies.stream().forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Function{" +
                "name='" + name + '\'' +
                '}';
    }

}
