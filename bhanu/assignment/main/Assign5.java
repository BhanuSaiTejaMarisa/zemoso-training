package bhanu.assignment.main;

import bhanu.assignment.data.Class1;
import bhanu.assignment.singleton.Class2;

public class Assign5 {
    public static void main(String[] args) {
        Class1 obj=new Class1();
        obj.printFields();
        obj.printLocalVar();

        Class2 obj2=new Class2();
        obj2.initField("1");
        obj2.initNonStaticField("return");
        obj2.printField();
    }
}
