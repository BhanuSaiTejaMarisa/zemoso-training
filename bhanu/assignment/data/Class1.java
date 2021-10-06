package bhanu.assignment.data;

public class Class1 {
    int Number;
    char Letter;

    public void printFields(){

        System.out.println("int: "+Number+" char: "+Letter);
    }

    public void printLocalVar(){
        int Number=0;
        char Letter='q';
        //Initialization of localVar is compulsory
        System.out.println("int: "+Number+" char: "+Letter);


    }
    public static void main(String[] args) {
        Class1 test=new Class1();
        test.printFields();
    }
}
