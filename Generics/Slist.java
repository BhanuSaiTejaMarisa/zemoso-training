package com.learning.assignments.JAVA.Generics;

public class Slist<T>{
    public Node<T> head;
    SListIterator<T> tempHead;
    public Slist(){
        this.head=new Node<>();
    }
    public Slist(T data) {
        this.head = new Node(data);
    }
    public SListIterator<T> getIterator(){
        tempHead=new SListIterator(head);
        return tempHead;
    }
    public void tostring(){
        this.head= tempHead.getHead();
        if(this.head.value==null){
            System.out.println("The list is empty");
            return;
        }
        Node<T> temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }


}
