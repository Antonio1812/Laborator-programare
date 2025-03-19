package ro.ulbs.paradigme.lab2.application;
import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;

public class Application {
    public static void main(String[] args) {
        System.out.println("Lista simplu înlănțuită:");
        SimpleChainedList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            simpleList.addValue(i);
        }
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);
        simpleList.listNodes();
        System.out.println("Suma: " + simpleList.sumNodes());
        System.out.println("Lista sortată? " + simpleList.isSortedAscending());
        System.out.println("\nLista dublu înlănțuită:");
        DoubleChainedList doubleList = new DoubleChainedList();
        for (int i = 1; i <= 10; i++) {
            doubleList.addValue(i);
        }
        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);
        doubleList.listNodes();
        System.out.println("Suma: " + doubleList.sumNodes());
        System.out.println("Lista sortată? " + doubleList.isSortedAscending());
    }
}
