public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " is a perfect number.");
                System.out.print("Factors: ");
                printFactors(i);
                System.out.println();
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void printFactors(int number) {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
