package com.learning.assignments.JAVA.Ass7;

class InnerClassTest {
    //-----------------------------------------------------------------------
    // PARENT CLASS
    class ParentClass {
        public ParentClass(String str) {
            x = new InnerClass(str);
        }

        private InnerClass x;

        class InnerClass {
            InnerClass(String str){
                System.out.println("Inner class Constructor of Parent class "+str);
            }
            public void speak() {
                System.out.println("Speak method: I am a ParentClass.InnerClass");
            }
        }

        public InnerClass getInnerClass(){
            return x;
        }
    }

    //-----------------------------------------------------------------------
    // CHILD CLASS
    class ChildClass extends ParentClass {
        public ChildClass(String str) {
            super(str);
            x = new InnerClass(str);
        }

        private InnerClass x;

        class InnerClass extends ParentClass.InnerClass {
            InnerClass(String str) {
                    super(str);
                    System.out.println("Inner class Constructor of Child class "+str);
            }

            public void speak() {
                System.out.println("Speak method: I am a ChildClass.InnerClass");
            }
        }
        public InnerClass getInnerClass(){
            return x;
        }
    }

    //-----------------------------------------------------------------------
    // MAIN
    public static void main(String[] args) {
        ChildClass obj = (new InnerClassTest()).new ChildClass("object of child class");
        System.out.println("line 56");
        obj.x.speak();
        System.out.println("line 58");

        ParentClass obj2 = (new InnerClassTest()).new ParentClass("object of parent class");
        System.out.println("line 62");

        obj2.getInnerClass().speak();
    }
}
