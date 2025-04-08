import java.util.Scanner;


public class power {
    public static void main(String[] args) {
        int x=6,y;
        System.out.println("enter the value of x");
        Scanner sc=new Scanner(System.in);
        x= sc.nextInt();
        System.out.println("enter the value of y(power)");
        y=sc.nextInt();
        System.out.println(power(x,y));


    }
    public static long power(int x, int y){
        int result=1;
        while(y>0){
            result*=x;
            y--;
        }
        return result;
    }
}
