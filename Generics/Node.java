package com.learning.assignments.JAVA.Generics;



public class Node<T>{
    T value;
    Node<T> next;

    public Node(){
        this.value=null;
        this.next=null;
    }
    public Node(T value){
        this.value=value;
        this.next=null;
    }
}

