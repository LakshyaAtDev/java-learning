package company;
import java.util.Scanner;
public class calculator {
    static void main() {
        System.out.println("To calculate your percentage");
        System.out.println("Enter marks in subject 1");
        Scanner scanner=new Scanner(System.in);
        float S1=scanner.nextFloat();
        System.out.println("Enter marks in subject 2");
        float S2=scanner.nextFloat();
        System.out.println("Enter marks in subject 3");
        float S3=scanner.nextFloat();
        System.out.println("Enter marks in subject 4");
        float S4=scanner.nextFloat();
        System.out.println("Enter marks in subject 5");
        float S5=scanner.nextFloat();
        System.out.println("Now enter total marks");
        float total_marks= scanner.nextFloat();
        float percentage=(S1+S2+S3+S4+S5)/total_marks*100;
        System.out.print("Your percentage is "+ percentage);



    }
}
