public class odd_even {
    public static void main(String[] args) {
        int n = 9;
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
    }
}
