package polymorphism;


/**
 * Created by Minal Patel
 */
/*
1. Method overloading can achieve by - One Class
2. Method name must be same
3. Type of method will be difference by

        - Number of arguments
        - Types Od Data
        - Sequence

 */

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        MethodOverloadingDemo methodOverloadingDemo = new MethodOverloadingDemo();
        methodOverloadingDemo.display();
        methodOverloadingDemo.display(8);
        methodOverloadingDemo.display("java");

    }

    public void display(){
        System.out.println("display");
    }

    public void display(int a){
        System.out.println("Int a Method "+ a);
    }

    public void display(String a){
        System.out.println("String  a Method "+ a);
    }

    public void display(int a , int b){

    }
    public void display(int b, String  a){

    }
}
