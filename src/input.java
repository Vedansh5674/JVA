import java.util.*;



class Input{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter 1st number");
    int a= in.nextInt();
    System.out.println("Enter your 2st Value");
    int b= in.nextInt();
    System.out.println("Enter your operator value");
    char op = in.next().charAt(0);
    switch (op) {
        case '+':
        System.out.println(a+b);
            
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break;
    
        default:
        System.out.println("0000000000");
            break;
    }

        


    }
    

}


    

