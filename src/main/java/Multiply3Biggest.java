public class Multiply3Biggest {
    public static void main(String[] args) {
        int[] arr = {-100,-2,-3,1};

        System.out.println(threeLargestNo(arr));

    }

    static int threeLargestNo(int[] arr){
        int start = arr.length;
        int end = start - 3;
        _ignoreNegativeBubbleSort(arr);
        int p = 1;
        while (end<start){
            p *= arr[end];
            end++;
        }
       return p;
    }

    static void _ignoreNegativeBubbleSort(int[] arr){
        int l = arr.length;
        for (int i=0;i<l-1;++i){
            for(int j=0;j<l-i-1; ++j){
               if(Math.sqrt(arr[j+1]* arr[j+1])<Math.sqrt(arr[j]*arr[j])){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }
}
