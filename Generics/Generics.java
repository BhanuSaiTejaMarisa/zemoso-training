package com.learning.assignments.JAVA.Generics;




    public class Generics {
        public static void main(String[] args) {

            Slist<Integer> newList=new Slist<Integer>();
            SListIterator<Integer> it=newList.getIterator();

            newList.tostring();
            it.insert(10);
            newList.tostring();
            it.insert(23);
            newList.tostring();
            it.insert(54);
            newList.tostring();
            it.insert(98);
            newList.tostring();
            it.remove();
            newList.tostring();

    while(it.hasNext()!=null){
        System.out.println(it.hasNext());
    }

        }
    }


