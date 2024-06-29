import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Subjects: ");
        int numberOfSub = sc.nextInt();

        int totalOfMarks = 0;
        int [] marks = new int[numberOfSub]; // For taking marks
        for(int i =0; i<numberOfSub; i++)
        {
            System.out.print("Enter Subject "+(i+1)+" Marks (out of 100): ");
            marks[i] = sc.nextInt();
            totalOfMarks = totalOfMarks + marks[i];
        }
        double averagePercentage = (double)totalOfMarks/numberOfSub;


        char grade; // for grades
        if(averagePercentage>=90){
            grade ='A';

        }
        else if(averagePercentage>=80 && averagePercentage<90){
            grade ='B';

        }
        else if(averagePercentage>=70 && averagePercentage<80){
            grade ='C';

        }
        else if(averagePercentage>=60 && averagePercentage<70){
            grade ='D';

        }
        else if(averagePercentage>=50 && averagePercentage<60){
            grade ='E';

        }
        else{
            grade ='F';
        }

        System.out.println("Total Marks: "+totalOfMarks);
        System.out.printf("Average Percentage: %.2f\n",averagePercentage);
        System.out.println("Grade is: "+grade);
    }
}