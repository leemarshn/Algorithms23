public class ReverseInteger {
    public static void main(String[] args) {
        //System.out.println(1/10);
        System.out.println(reverseInteger(-900000));
    }

   static int reverseInteger(int num){
       long r = 0;

       while (num !=0){
           r = r * 10 + num % 10;
           num /=10;

           if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE){
               return 0;
           }
       }

        return (int) r;
    }
}
