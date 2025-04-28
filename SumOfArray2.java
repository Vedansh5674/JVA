public class SumOfArray2 {
    public static void main(String[] args) {
        int[][] arr={ {   1,2,3,4,5},{2,3,4,5,6},{2,3,4}    };
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            int s= 0;
            for(int j =0; j <arr[i].length; j++){
                System.out.println(arr[i][j]);
                
                s=s+arr[i][j];

      

            }
            System.out.println();
            t=t+s;

        }
        System.out.println(t);
}
}
