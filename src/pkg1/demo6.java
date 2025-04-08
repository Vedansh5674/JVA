package pkg1;


import java.util.Scanner;
public class demo6 {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        int x,y;
        System.out.println("Enter number 1:" );
        x=sc.nextInt();
        System.out.println("Enter number 2:" );
         y=sc.nextInt();
        System.out.println(add(x,y));
        sc.close();
                                //add(x,y)
        //demo6 obj1= new demo6();
        //obj1.add(x,y);
                            //note->  A non Static function cannot be called directly from a static function.
                              //this happens because when multiple objects are made out of the class copies of static,
                                 // members is not created for every different objects.
    }
    private static int add(int a, int b){
        return(a+b);//any member inside a class whether it be static or not
                            // static can access each other even if they are private
    }//1 static function can directly call another static
    //2 Anon static function can call another non static function directly
    //3 static has to create an object and call a  non static function using (.) operater}// function
}
