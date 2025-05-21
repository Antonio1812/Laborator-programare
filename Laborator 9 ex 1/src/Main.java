import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> interval=new ArrayList<Integer>();
        ArrayList<Double> numbersDouble = new ArrayList<Double>();

        for(int i=0; i<10; i++){
            numbers.add((int) (Math.random()*25));
        }

        int suma=numbers.stream().mapToInt(Integer::intValue).sum();
        int min=numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
        int max=numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
        interval=numbers.stream().mapToInt(Integer::intValue).filter(x-> x>10 && x<20).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        numbersDouble=numbers.stream().mapToDouble(Integer::doubleValue).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        String nrGasit=numbers.stream().anyMatch(x->x==12)? "12" : "Numarul 12 nu a fost gasit";

        System.out.println("Numerele: "+numbers);
        System.out.println("Suma: "+suma);
        System.out.println("Minimul: "+min);
        System.out.println("Maximul: "+max);
        System.out.println("Intervalul: "+interval);
        System.out.println("Numerele Double: "+numbersDouble);
        System.out.println("Numar cautat: "+nrGasit);
    }
}