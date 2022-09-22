import java.util.Scanner;
import java.util.StringJoiner;

class FindFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = Math.abs(num);

        if (num == 0) {
            System.out.println("No Factors");
        } else {
            printDivisors(num);
        }
    }
    static void printDivisors(int n) {
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                System.out.print(i + " ");
            }
        }
    }

}
