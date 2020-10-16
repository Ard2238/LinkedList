public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Program");

        LinkedList linkedList = new LinkedList();
        linkedList.addNode(56);
        linkedList.addNode(30);
        linkedList.addNode(70);

        Node n = linkedList.head;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
}
