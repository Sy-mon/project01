import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean scoreRemarks = false;
        int score = 0;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first_name = scan.next();

        System.out.println("Enter your last name: ");
        String last_name = scan.next();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your score: ");
         score = scan.nextInt();

         if(score >= 50){
             scoreRemarks = true;
         }

         if(scoreRemarks){
             System.out.println("You passed the test.....🎉🥳");
         } else {
             System.out.println("You need to retake the test...");
         }


        System.out.println("=====================");
        System.out.println("welcome: "+first_name);
        System.out.println("Your password is: "+last_name +age);
        System.out.println("Passed: "+scoreRemarks);

    }
}