public class TraillingZeros {
    public static void main(String[] args) {
        System.out.println(addZeros(88));
    }

    static int addZeros(int n){
        // Initialize a count variable
        int count = 0;
        // Loop while n is greater than or equal to 5
        while (n >= 5) {
            // Add the quotient of n divided by 5 to the count
            count += n / 5;
            // Update n to be the quotient of n divided by 5
            n /= 5;
        }
        // Return the count
        return count;

    }
}
