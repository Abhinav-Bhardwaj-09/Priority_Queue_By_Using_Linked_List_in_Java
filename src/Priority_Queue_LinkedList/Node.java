package Priority_Queue_LinkedList;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   19-02-2020 ,  Time :-    16 : 20
 
 */
public class Node {
    int data ;
    int priority;
    Node next;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


}
