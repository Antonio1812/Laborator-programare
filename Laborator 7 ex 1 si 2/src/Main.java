//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ACalculator calculator=new ACalculator(10);
        NewIntCalculator newIntCalculator=new NewIntCalculator(10);
        DoubleCalculator doubleCalculator=new DoubleCalculator(10);

        int result=newIntCalculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) "+result);
        double result2=doubleCalculator.add(5).subtract(3.3).multiply(2.2).resultDouble();
        System.out.println("b) "+result2);
    }
}