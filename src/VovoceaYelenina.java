import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class VovoceaYelenina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> zelen = new ArrayList<>();
        ArrayList<String> ovoc = new ArrayList<>();

        System.out.println("Zadej pocet zeleniny :");
        int bruh = Integer.parseInt(sc.nextLine());
        for (int n = 0; n < bruh; n++) {
            String temp = sc.nextLine();
            if (zelen.indexOf(temp) < 0)
                zelen.add(temp);
            else {System.out.println("debilku");n--;};
        }
        System.out.println("Zadej pocet ovoce :");
        int bruh2 = Integer.parseInt(sc.nextLine());
        for (int n = 0; n < bruh2; n++) {
            String temp = sc.nextLine();
            if (ovoc.indexOf(temp) < 0)
                ovoc.add(temp);
            else {System.out.println("debilku");n--;};
        }

        System.out.println("napis end kdyz pogrom");
        while (true){
            System.out.println("Zadej vec:");
            String input = sc.nextLine();
            if (input.toLowerCase(Locale.ROOT).equals("end")) break;
            else {
                if (zelen.indexOf(input) > -1) System.out.println("Zelenyhna");
                else if (ovoc.indexOf(input) > -1) System.out.println("Orvoce");
                else System.out.println("Nen9 neexistuje");
            }
        }
        System.out.println("list jelninu");
        for (String z: zelen) {
            System.out.println(z);
        }
        System.out.println("list toho druhyhy");
        for (String z: ovoc) {
            System.out.println(z);
        }
    }
}
