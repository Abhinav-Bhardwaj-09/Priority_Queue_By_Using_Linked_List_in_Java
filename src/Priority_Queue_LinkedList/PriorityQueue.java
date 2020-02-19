package Priority_Queue_LinkedList;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   19-02-2020 ,  Time :-    16 : 22
 
 */
public class PriorityQueue {
    Node front ;
    Node rear ;

    public PriorityQueue() {
        this.front = null;
        this.rear = null;
    }


    public void enqueue (Node newnode){
        if ( front == null || newnode.priority < front.priority ){
            newnode.next = front;
            front = newnode;
        }
        else{
            Node temp = front ;
            while ( temp.next != null && temp.next.priority <= newnode.priority) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    public  void dequeue(){
        if ( front != null){
            front = front.next;
        }
        else {
            System.out.println("Underflow... ");
        }
        if ( front != null ){
            display();
        }
        else {
            System.out.println("List is ");
        }
    }


    public void display(){
        Node temp = front;
        while ( temp!= null ){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
