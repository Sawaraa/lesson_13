package deputies;

import faction.Faction;
import supremeCouncil.Parliament;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public Scanner scanner = new Scanner(System.in);
    public Main(Scanner scanner) {
        this.scanner = scanner;
    }
    public static void main(String[] args) {

        //Faction faction = new Faction();
        //faction.menu();
        Parliament parliament = new Parliament();
        parliament.menu();
        parliament.scanner.close();
    }

}