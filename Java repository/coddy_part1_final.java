import java.util.Scanner;

public class coddy_part1_final {
    public static double calculateAverageGrade(int[] grades) {
        // Write your code here
        double avg=0,t_avg=0;
        for(int i=0;i<grades.length;i++)
        {
        avg =  grades[i];
        t_avg += avg;
        }
        double AVG = t_avg/grades.length;
        return AVG;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] studentGrades = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
           studentGrades[i] = Integer.parseInt(stringArr[i]);
        }
        double averageGrade = calculateAverageGrade(studentGrades);
        System.out.printf("Average grade: %.2f", averageGrade);
    }
}
