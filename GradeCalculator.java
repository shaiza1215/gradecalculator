import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of subjects of the student: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the marks student obtained in subject " + i + ": ");
            int m = sc.nextInt();
            total += m;
        }

        double avg = (double) total / (n * 100) * 100;

        char g;
        if (avg >= 90) {
            g = 'A';
        } else if (avg >= 80) {
            g = 'B';
        } else if (avg >= 70) {
            g = 'C';
        } else if (avg >= 60) {
            g = 'D';
        } else {
            g = 'F';
        }

        System.out.println("Total Marks of the Student: " + total);
        System.out.println("Average Percentage of the Student: " + avg + "%");
        System.out.println("Grade scored by Student: " + g);

        sc.close();
    }
}