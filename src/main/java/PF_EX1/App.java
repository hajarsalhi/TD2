package PF_EX1;

import java.util.List;
import java.util.Map;

public class App {


    public static void main(String[] args) {

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


        ToString<List<String>> strListToString = (List<String> strList)->{
            StringBuilder str = new StringBuilder("");
            for(String e : strList ) {
                str.append(e);
                str.append(",");
            };

            return str.toString();

        };

        ToString<Map<String,Integer>> strMapToString = (Map<String,Integer> strMap)->{

            StringBuilder str = new StringBuilder("");
            for(int i=1;i<strMap.size();i++){
                str.append(i);
                str.append(":");
                str.append(strMap.get(i));

            }
            return str.toString();

        };
    }
}
