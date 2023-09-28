import java.util.Scanner;

public class Student_grade_calculater {
    public static void main(String args[]) {
        Scanner hr = new Scanner(System.in);
        System.out.println("Enter the mark of IOT :");
        float a = hr.nextFloat();
        System.out.println("Enter the mark of Compiler Design :");
        float b = hr.nextFloat();
        System.out.println("Enter the mark of Machine lerning :");
        float c = hr.nextFloat();
        System.out.println("Enter the mark of Devlopment Engineering :");
        float d = hr.nextFloat();
        System.out.println("Enter the mark of Computer network :");
        float e = hr.nextFloat();
        float total_marks = a + b + c + d + e;
        System.out.println("The total sum of each subject =" + total_marks);
        float average = total_marks / 5;
        System.out.println("The total average of a student =" + average);

        float percentage = (average / 500) * 100;
        System.out.println("The Percentage of student = " + percentage);
        System.out.println("Grade of the student is :");
        if (percentage >= 80) {
            System.out.print("A");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.print("B");
        } else if (percentage >= 40 && percentage < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }

    }
}