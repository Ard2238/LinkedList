public class LinkedListMain {
    LinkedList list;
    public LinkedListMain(){
        list = new LinkedList();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Program");

        LinkedListMain llmain = new LinkedListMain();
        llmain.list.addNode(56);
        llmain.list.addNode(30);
        llmain.list.addNode(70);

        //linkedList.pop();
        //llmain.list.popLast();
        llmain.list.insertNode(40,30);

        Node n = llmain.list.head;
        while(n != llmain.list.tail.next){
            System.out.println(n.data);
            n = n.next;
        }
    }
}
