package PF_EX3;

import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class App2 {
    public static void main(String[] args) {
        Matiere m1 = new Matiere("MAT1");
        Matiere m2 = new Matiere("MAT2");
        UE ue1 = new UE("UE1", Map.of(m1, 2, m2, 2));
        Matiere m3 = new Matiere("MAT3");
        UE ue2 = new UE("UE2", Map.of(m3, 1));
        Annee a1 = new Annee(Set.of(ue1, ue2));
        Etudiant e1 = new Etudiant("39001", "Alice", "Merveille", a1);
        e1.noter(m1, 12.0);
        e1.noter(m2, 14.0);
        e1.noter(m3, 10.0);
        System.out.println(e1);
        Etudiant e2 = new Etudiant("39002", "Bob", "Eponge", a1);
        e2.noter(m1, 14.0);
        e2.noter(m3, 14.0);
        Etudiant e3 = new Etudiant("39003", "Charles", "Chaplin", a1);
        e3.noter(m1, 18.0);
        e3.noter(m2, 5.0);
        e3.noter(m3, 14.0);

    }

    public static void afficheSi(String entete, List<Etudiant> listEtud, Predicate<Etudiant> predEtud , int annee){

        //parcourir la liste des etudiants
        //verifier pour chaque etudiant le predicat
        //build le stingà afficher pour les etudiants qui valident le predicat
        for(int i =0 ; i<listEtud.size();i++){
             if(predEtud.test(listEtud.get(i)))

         }
    }
}
