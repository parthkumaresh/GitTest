package inheritanceDemo;


/**
 * Created by Minal Patel
 */

public class InheritanceDemoOne {

    public static void main(String[] args) {
        D obj = new D();
        obj.methodThree();
        obj.methodTwo();
        obj.methodOne();

    }
}

/*
1. Multiple inheritance can't be possible at a same time
2. Is-A : Relation ship (One-Way)
3. Subclass Contains properties of extended class
4. Can achieve by "extends" keyword
 */
class A {
    public void methodOne() {
        System.out.println("This is Method One");
    }
}

class B extends A {
    public void methodTwo() {
        System.out.println("This is Method Two");
    }
}

class D extends B {
    public void methodThree() {
        System.out.println("This is Method Three");
    }
}
