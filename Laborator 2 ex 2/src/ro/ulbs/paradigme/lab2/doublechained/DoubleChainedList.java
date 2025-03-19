package ro.ulbs.paradigme.lab2.doublechained;

public class DoubleChainedList {
    private DoubleChainedNode head;
    private DoubleChainedNode tail;
    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNextNode(newNode);
            newNode.setPrevNode(tail);
            tail = newNode;
        }
    }
    public void removeNodeByValue(int value) {
        if (head == null) return;
        if (head.getValue() == value) {
            head = head.getNextNode();
            if (head != null) head.setPrevNode(null);
            return;
        }
        if (tail.getValue() == value) {
            tail = tail.getPrevNode();
            if (tail != null) tail.setNextNode(null);
            return;
        }
        DoubleChainedNode current = head;
        while (current != null && current.getValue() != value) {
            current = current.getNextNode();
        }
        if (current != null) {
            current.getPrevNode().setNextNode(current.getNextNode());
            if (current.getNextNode() != null) {
                current.getNextNode().setPrevNode(current.getPrevNode());
            }
        }
    }
    public void listNodes() {
        DoubleChainedNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " <-> ");
            current = current.getNextNode();
        }
        System.out.println("null");
    }
    public int sumNodes() {
        int sum = 0;
        DoubleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }
    public boolean isSortedAscending() {
        DoubleChainedNode current = head;
        while (current != null && current.getNextNode() != null) {
            if (current.getValue() > current.getNextNode().getValue()) {
                return false;
            }
            current = current.getNextNode();
        }
        return true;
    }
}
