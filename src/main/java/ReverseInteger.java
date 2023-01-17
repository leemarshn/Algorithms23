public class ReverseInteger {

   int reverseInteger(int num){
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
