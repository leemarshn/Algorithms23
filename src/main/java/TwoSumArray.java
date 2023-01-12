import java.util.Arrays;

public class TwoSumArray {
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7};
        int target = 5;
        System.out.println(Arrays.toString(getIndices(arr, target)));
    }
    static int[] getIndices(int[] array, int target){
       for (int i=0; i<array.length; i++){
           for (int k=i+1; k<array.length; k++){
               if (array[i]+array[k]==target){
                   return new int[] {i, k};
               }
           }
       }

       return new int [] {0};
    }
}
