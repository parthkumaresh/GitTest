package inheritanceDemo;


/**
 * Created by Minal Patel
 */

/*
: Inheritance :
-don't need to create object
-method overriding concept can be achieved
-required more than one class
 */

/*
OverRide  : How to achive overiding :
- both parent class and child class method should be same (With name and para)
 */

class InheritanceDemo{

    public static void main(String[] args) {

        Cd obj = new Cd();
        obj.disOne();
    }

}

class AB{
    int a=8;
  public AB() {
        System.out.println("Welcome");
   }

  public void disOne(){
        System.out.println("This is display one method");
    }

//  public void disTwo(){
//        System.out.println("This is display Two method");
//    }
}

class Cd extends AB{
    public void disOne(){
        System.out.println("Over_ridden Method");
    }
}