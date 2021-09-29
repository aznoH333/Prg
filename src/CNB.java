public class CNB {
    public static void main(String[] args) {
        String[] input = ("Austrálie|dolar|1|AUD|15,776\n" +
                "Brazílie|real|1|BRL|4,090\n" +
                "Bulharsko|lev|1|BGN|13,010\n" +
                "Čína|žen-min-pi|1|CNY|3,366\n" +
                "Dánsko|koruna|1|DKK|3,422\n" +
                "EMU|euro|1|EUR|25,445\n" +
                "Filipíny|peso|100|PHP|42,500\n" +
                "Hongkong|dolar|1|HKD|2,795\n" +
                "Chorvatsko|kuna|1|HRK|3,392\n" +
                "Indie|rupie|100|INR|29,456\n" +
                "Indonesie|rupie|1000|IDR|1,526\n" +
                "Island|koruna|100|ISK|16,952\n" +
                "Izrael|nový šekel|1|ILS|6,800\n" +
                "Japonsko|jen|100|JPY|19,614\n" +
                "Jižní Afrika|rand|1|ZAR|1,444\n" +
                "Kanada|dolar|1|CAD|17,176\n" +
                "Korejská republika|won|100|KRW|1,841\n" +
                "Maďarsko|forint|100|HUF|7,105\n" +
                "Malajsie|ringgit|1|MYR|5,195\n" +
                "Mexiko|peso|1|MXN|1,083\n" +
                "MMF|ZPČ|1|XDR|30,872\n" +
                "Norsko|koruna|1|NOK|2,528\n" +
                "Nový Zéland|dolar|1|NZD|15,227\n" +
                "Polsko|zlotý|1|PLN|5,537\n" +
                "Rumunsko|leu|1|RON|5,141\n" +
                "Rusko|rubl|100|RUB|29,939\n" +
                "Singapur|dolar|1|SGD|16,064\n" +
                "Švédsko|koruna|1|SEK|2,501\n" +
                "Švýcarsko|frank|1|CHF|23,453\n" +
                "Thajsko|baht|100|THB|64,796\n" +
                "Turecko|lira|1|TRY|2,460\n" +
                "USA|dolar|1|USD|21,755\n" +
                "Velká Británie|libra|1|GBP|29,793").split("\n");

        String[][] input2 = new String[input.length][5];
        for (int i = 0; i < input.length; i++) input2[i] = input[i].split("\\|");


        for (String[] mena: input2) {
            System.out.println(String.format("%.5f", (1 / Double.parseDouble(mena[4].replace(",",".")))) + " " + mena[3] + " = 1 CZK");
        }
        System.out.println();
        System.out.println("Pro kontrolu:");
        for (String[] mena: input2) {
            System.out.println(String.format("%.5f", (30 / Double.parseDouble(mena[4].replace(",",".")))) + " " + mena[3] + " = 30 CZK");
        }
    }
}
