  import java.util.Scanner;
public class loop


{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else{
                System.out.println("odd");
            }
        }
    }

