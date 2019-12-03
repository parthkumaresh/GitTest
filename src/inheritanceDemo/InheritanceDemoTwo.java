package inheritanceDemo;


/**
 * Created by Minal Patel
 */

public class InheritanceDemoTwo {
    public static void main(String[] args) {
        z objz  = new z();
        objz.methodOne();
    }
}
/*
1. Multiple inheritance can't be possible at a same time
2. Is-A : Relation ship (One-Way)
3. Subclass Contains properties of extended class
4. Can achieve by "extends" keyword
 */
class x {
    public void methodOne() {
        System.out.println("This is Method One");
    }
}

class y extends x {
    public void methodOne() {
        System.out.println("This is Method Two");
    }
}

class z extends y{
    public void methodOne() {
        System.out.println("This is Method Three");
    }
}

