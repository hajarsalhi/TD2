package PF_EX2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App1 {

    public static void main(String[] args) {

        Predicate<Integer> tailleTropPetite = (Integer taille)->{
            return taille<100;
        };
        Predicate<Integer> tailleTropGrande = (Integer taille)->{
            return taille>200;
        };
        Predicate<Integer> tailleIncorrecte = tailleTropGrande.or(tailleTropPetite);


        Predicate<Integer> tailleCorrecte = tailleIncorrecte.negate();

        Predicate<Double> poidsLourd = (Double poids)->{
            return poids>150.0;
        };

        Predicate<Double> poidsCorecte= poidsLourd.negate();


        Predicate<Paire<Integer,Double>> accèsAutorise = (Paire<Integer,Double> personne)->{

            return tailleCorrecte.test(personne.fst) && poidsCorecte.test(personne.snd);

        };

    }

    //version lamda Function<List<P<T>, P<T>> f = ...
    public static <T> List<T> filtragepredicatif(List<Predicate<T>> listPred , List<T> listelements){

        //construction du predicat de la conjonction
        Predicate<T> globale = null;
        for(Predicate<T> element : listPred)
            globale.and(element);

        //pour chaque element T verfier la conjonction des predicats
        List<T> listRes= new ArrayList<>();
        for(T element : listelements){
            if(globale.test(element))
                listRes.add(element);
        }

        return listRes;
    }
}
