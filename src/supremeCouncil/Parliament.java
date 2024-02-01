package supremeCouncil;
import deputies.Deputies;
import deputies.Main;
import faction.Faction;
import faction.Function;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Parliament {

    public static Parliament parliament = new Parliament();

    private ArrayList<Faction> listOffactions = new ArrayList<>();

    Faction faction1 = new Faction();

    private Parliament() {

    }

    public Faction getFraction(String name){
        for (Faction f:
             listOffactions) {
            if (f.getName().equalsIgnoreCase(name))
                return f;
        }
        return null ;
    }

    public void add(String name){
        Faction faction = new Faction(name);
        listOffactions.add(faction);
        System.out.println("Ви успішно добавили фракцію");

        listOffactions.stream().forEach(System.out::println);
//        Iterator<Faction> iterator = listOffactions.iterator();
//
//        while (iterator.hasNext()) {
//            Faction next = iterator.next();
//            System.out.println(next);
//        }
    }

    public void remove(String deleteName){

//        for (int i = 0; i < listOffactions.size(); i++) {
//            faction1 = listOffactions.get(i);
//            if (faction1.getName().equalsIgnoreCase(deleteName)) {
//                listOffactions.remove(i);
//
//                System.out.println("Франкція " + deleteName + " була видалена зі списку");
//                System.out.println("Список франкції які залишились");
//
//                Iterator<Faction> iterator2 = listOffactions.iterator();
//                while (iterator2.hasNext()) {
//                    Faction next = iterator2.next();
//                    System.out.println(next);
//                }
//            }
//            else {System.out.println("Такої франкції не існує");}
//        }
    }

    public void output(){
        listOffactions.stream().forEach(faction -> System.out.println(faction));
//        for (Faction function1 : listOffactions) {
//            System.out.println(function1);
//        }
    }

    public void clear(String outputName){
        for (int i = 0; i < listOffactions.size(); i++) {
            faction1 = listOffactions.get(i);
            if (faction1.getName().equalsIgnoreCase(outputName)) {
                listOffactions.clear();
            }
        }
    }

    public void specificOutput(String outputName){
        for (int i = 0; i < listOffactions.size(); i++) {
            faction1 = listOffactions.get(i);
            if (faction1.getName().equalsIgnoreCase(outputName)) {
                System.out.println(faction1);
            }
        }
    }

}
