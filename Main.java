import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] argv) {
        System.out.print("Quelle fonction éxecuter ?\n\t 1 - Afficher les paramètres du programme\n\t 2 - Afficher les paramètres dans l'ordre inverse\n\t 3 - Afficher les paramètres en majuscule\n\t 4 - Compter le nombre de caractères dans les paramètres\n");
        Scanner sc = new Scanner(System.in);
        String rep = sc.nextLine();

        switch (rep) {
            case "1" :
                for (String arg : argv) {
                    System.out.println(arg);
                }
                break;
            case "2" :
                for (int i = argv.length - 1; i >= 0; i--) {
                    System.out.println(argv[i]);
                }
                break;
            case "3" : 
                for (String arg : argv) {
                    System.out.println(arg.toUpperCase());
                }
                break;
            case "4" :
                int cpt = 0;
                for (String arg : argv) {
                    cpt += arg.length();
                }
                System.out.println(cpt);
                break;
        }
    }
}