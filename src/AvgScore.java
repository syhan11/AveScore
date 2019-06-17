import java.util.Scanner;

public class AvgScore {
    public static void main(String[] args) {
        int score = 0;
        float sum = 0;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.printf("Enter a score %d: \n", i);
            score = keyboard.nextInt();
            sum += score;
        }

        System.out.printf("Average score is %.2f\n", sum/10);
    }
}
