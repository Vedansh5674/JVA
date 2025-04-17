import java.util.Scanner;

public class ReverseArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        

        System.out.println("Enter elements:");
        for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
        

    }
    System.out.println("reversed Array:");
    for(int i = n -1; i  >=0; i--){
        System.out.println(arr[i]+ "");
    }
    
}
}

    

