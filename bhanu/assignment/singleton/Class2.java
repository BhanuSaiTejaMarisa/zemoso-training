package bhanu.assignment.singleton;

public class Class2 {
    private String Word;
    public static Object initField(String str){
        //Cannot use a non static field
        // inside a static method
//        Word=str;
        return "";
    }
    public String initNonStaticField(String str){
        Word=str;
        return Word;
    }
    public void printField(){
        System.out.println(Word);
    }
}
