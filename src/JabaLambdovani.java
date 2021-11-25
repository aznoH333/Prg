import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoubleFunction;
import java.util.function.Predicate;

public class JabaLambdovani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get input
        String[] temp = sc.nextLine().split(" ");
        Double[] inputs = new Double[temp.length];
        for (int i = 0; i < temp.length; i++) {
            inputs[i] = Double.parseDouble(temp[i]);
        }

        // output
        System.out.println(filter(inputs, i -> i%11 == 0));
        // zadna mocnina nekonci na 3
        // pro test jsem jako nahradu pouzil 4
        System.out.println(filter(inputs, i -> Double.toString(i*i).charAt(Double.toString(i*i).length() - 3) == '4'));
        System.out.println(apply(inputs, i -> i*2));
        System.out.println(apply(inputs, i -> Math.ceil(i*0.8/10)*10));

        System.out.println(reduce(inputs, (i, acc) -> {return i*acc;}));
        System.out.println(reduce(inputs, (i, acc) -> {return i+acc;}));

    }


    public static ArrayList<Double> filter(Double[] input, Predicate<Double> f){
        ArrayList<Double> output = new ArrayList<>();
        for (double i: input) {
            if(f.test(i)) output.add(i);
        }
        return output;
    }

    public static ArrayList<Double> apply(Double[] input, DoubleFunction<Double> f){
        ArrayList<Double> output = new ArrayList<>();
        for (double i: input) {
            output.add(f.apply(i));
        }
        return output;
    }

    public static Double reduce(Double[] input, DoubleParameterFunction<Double> f){
        double output = input[0];
        for (int i = 1; i < input.length; i++) {
            output = f.apply(input[i],output);
        }

        return output;
    }
}

interface DoubleParameterFunction<Double>{
    Double apply(Double a, Double b);
}
