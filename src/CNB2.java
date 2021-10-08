import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CNB2 {
    public static void main(String[] args) {
        String[] baseInput = (
                "Austrálie|dolar|1|AUD|15,834\n" +
                "Brazílie|real|1|BRL|4,030\n" +
                "Bulharsko|lev|1|BGN|12,940\n" +
                "Čína|žen-min-pi|1|CNY|3,385\n" +
                "Dánsko|koruna|1|DKK|3,403\n" +
                "EMU|euro|1|EUR|25,310\n" +
                "Filipíny|peso|100|PHP|43,080\n" +
                "Hongkong|dolar|1|HKD|2,803\n" +
                "Chorvatsko|kuna|1|HRK|3,375\n" +
                "Indie|rupie|100|INR|29,439\n" +
                "Indonesie|rupie|1000|IDR|1,525\n" +
                "Island|koruna|100|ISK|16,907\n" +
                "Izrael|nový šekel|1|ILS|6,777\n" +
                "Japonsko|jen|100|JPY|19,629\n" +
                "Jižní Afrika|rand|1|ZAR|1,459\n" +
                "Kanada|dolar|1|CAD|17,220\n" +
                "Korejská republika|won|100|KRW|1,846\n" +
                "Maďarsko|forint|100|HUF|7,066\n" +
                "Malajsie|ringgit|1|MYR|5,220\n" +
                "Mexiko|peso|1|MXN|1,064\n" +
                "MMF|ZPČ|1|XDR|30,740\n" +
                "Norsko|koruna|1|NOK|2,526\n" +
                "Nový Zéland|dolar|1|NZD|15,110\n" +
                "Polsko|zlotý|1|PLN|5,523\n" +
                "Rumunsko|leu|1|RON|5,116\n" +
                "Rusko|rubl|100|RUB|29,877\n" +
                "Singapur|dolar|1|SGD|16,088\n" +
                "Švédsko|koruna|1|SEK|2,493\n" +
                "Švýcarsko|frank|1|CHF|23,456\n" +
                "Thajsko|baht|100|THB|64,855\n" +
                "Turecko|lira|1|TRY|2,467\n" +
                "USA|dolar|1|USD|21,819\n" +
                "Velká Británie|libra|1|GBP|29,552\n" +
                "Ceska republika|Koruna|1|CZK|1\n").split("\n");

        // process input
        HashMap<String, Double> processedInput = new HashMap<>();
        for (String currency: baseInput) {
            String[] temp = currency.split("\\|");
            processedInput.put(temp[3],Double.parseDouble(temp[4].replace(",","."))/Double.parseDouble(temp[2].replace(",",".")));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Type end to exit the pogrom");
        ArrayList<String> comp = new ArrayList<>();

        while (true){
            printInfo(comp.size());
            String input = sc.nextLine().toUpperCase(Locale.ROOT);
            if (!input.equals("END")){
                comp.add(input);

                if (comp.size() == 3){
                    compute(comp, processedInput);
                    comp.clear();
                }
                //print output

            } else if (input.equals("END")) {
                System.out.println("Exiting pogrom...");
                break;
            }else
                System.out.println("Invalid input");
        }
    }

    private static void printInfo(int length){
        switch (length){
            case 0:
                System.out.println("Type amount :");
                break;
            case 1:
                System.out.println("Type currency :");
                break;
            case 2:
                System.out.println("Type second currency :");
                break;
        }
    }

    private static void compute(ArrayList<String> input, HashMap<String, Double> currencies){
        int count = 0;
        try {
            count = Integer.parseInt(input.get(0));
        }catch (Exception e) {System.out.println("Math error");}
        if (currencies.containsKey(input.get(1)) && currencies.containsKey(input.get(2)) && count != 0){
            Double output = (currencies.get(input.get(1))*count)/currencies.get(input.get(2));
            System.out.println(count + " " + input.get(1) + " = " + output + " " + input.get(2));
        } else System.out.println("error");
    }
}
