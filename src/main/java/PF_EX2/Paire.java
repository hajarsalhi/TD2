package PF_EX2;
import java.util.List;
import java.util.function.Predicate;
public class Paire<T, U> {
    public T fst;
    public U snd;
    public Paire(T fst, U snd) {
        this.fst = fst;
        this.snd = snd;
    }
    @Override public String toString() {
        return String.format("(%s,%s)",fst.toString(),snd.toString());
    }


}
