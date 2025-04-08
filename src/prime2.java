import java.util.Scanner;
public class prime2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("enter the value of n;");
        int n = sc.nextInt();
        boolean is_prime=true;
        //0 and 1 are not prime numbers
        if(n==0||n==1){
            is_prime=false;
        }
        // loop to check if n is prime
        for(int i=2;i<n/2;++i){
            if (n%i==0){
                is_prime=false;
                break;
            }
        }
        if(is_prime){
            System.out.println(+n+"  the given number is prime");
        }else{
            System.out.println(+n+" the given number is not prime");
        }
    }}

