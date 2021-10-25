package PF;

import PF.Somme;

public class App {

    Somme<Integer> elementInteger = (Integer x ,Integer y)->{
        return x+y;
    };
    Somme<String> elementString = (String x ,String y)->{
        StringBuilder sb = new StringBuilder("");
        sb.append(x);
        sb.append(y);
        return sb.toString();
    };
    Somme<Double> elementDouble= (Double x ,Double y)->{
        return x+y;
    };

    Somme<Float> elementFloat = (Float x, Float y)->{
        return x+y;
    };
    public static void main(String[] args) {

    }
}
