import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();
ArrayList<Integer> squares = new ArrayList<>();
numbers.add(9);
numbers.add(10);
numbers.add(3);
numbers.add(4);
numbers.add(7);
numbers.add(3);
numbers.add(4);

squares=numbers.stream().mapToInt(n->n*n).collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
System.out.println("Numerele: " + numbers);
System.out.println("Patratele numerelor: " + squares);
    }
}