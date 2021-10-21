package com.learning.assignments.JAVA.Generics;

public class SListIterator<T> {
    Node<T> head;
    public SListIterator(Node<T> head){
        this.head=head;
    }
    public void insert(T data){
        Node<T> temp=head;
        Node<T> newNode=new Node<>(data);

        if(temp.value==null){
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void remove(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node<T> temp=head.next;
        Node<T> prev=head;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    public Node<T> getHead(){
        return head;
    }

    public Node<T> NextElem= this.getHead();
    public Node<T> hasNext(){
        Node<T>last=NextElem;
        NextElem=last.next;

        return last;
    }

}
