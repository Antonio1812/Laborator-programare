package ro.ulbs.paradigme.lab2.simplechained;

public class SimpleChainedList {
    private SimpleChainedNode head;
    public void addValue(int value) {
        if (head == null) {
            head = new SimpleChainedNode(value);
        } else {
            SimpleChainedNode current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(new SimpleChainedNode(value));
        }
    }
    public void removeNodeByValue(int value) {
        if (head == null) return;
        if (head.getValue() == value) {
            head = head.getNextNode();
            return;
        }
        SimpleChainedNode current = head;
        while (current.getNextNode() != null && current.getNextNode().getValue() != value) {
            current = current.getNextNode();
        }
        if (current.getNextNode() != null) {
            current.setNextNode(current.getNextNode().getNextNode());
        }
    }
    public void listNodes() {
        SimpleChainedNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNextNode();
        }
        System.out.println("null");
    }
    public int sumNodes() {
        int sum = 0;
        SimpleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }
    public boolean isSortedAscending() {
        SimpleChainedNode current = head;
        while (current != null && current.getNextNode() != null) {
            if (current.getValue() > current.getNextNode().getValue()) {
                return false;
            }
            current = current.getNextNode();
        }
        return true;
    }
}
