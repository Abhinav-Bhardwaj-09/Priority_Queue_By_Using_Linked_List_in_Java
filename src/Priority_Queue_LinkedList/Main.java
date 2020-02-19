package Priority_Queue_LinkedList;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   19-02-2020 ,  Time :-    16 : 35
 
 */
public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(10,5);
        Node n2 = new Node(20,3);
        Node n3 = new Node(30,1);
        PriorityQueue obj = new PriorityQueue();
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.display();
    }
}
