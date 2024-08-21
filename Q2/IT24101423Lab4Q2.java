import java.util.Scanner;

public class IT24101423Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double examMarks = getValidatedMarks(scanner, "Enter the exam marks (out of 100): ");
        
        double labMarks = getValidatedMarks(scanner, "Enter the lab submission marks (out of 100): ");
        
        
        double examPercentage = getValidatedPercentage(scanner, "Enter the percentage taken from exam marks: ");
        double labPercentage = getValidatedPercentage(scanner, "Enter the percentage taken from lab submission marks: ");

                if (examPercentage + labPercentage != 100) {
            System.out.println("Error: The percentages should add up to 100.");
        } else {
            
            double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
            System.out.printf("The final mark of the module is: %.2f\n", finalMark);
        }

        
        scanner.close();
    }

    
    private static double getValidatedMarks(Scanner scanner, String prompt) {
        double marks;
        while (true) {
            System.out.print(prompt);
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
            }
        }
        return marks;
    }

   
    private static double getValidatedPercentage(Scanner scanner, String prompt) {
        double percentage;
        while (true) {
            System.out.print(prompt);
            percentage = scanner.nextDouble();
            if (percentage >= 0 && percentage <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Percentage should be between 0 and 100.");
            }
        }
        return percentage;
    }
}