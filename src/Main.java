//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
//import java.util.scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student marks:");
        int marks=sc.nextInt();
        char grade;
        String feedback;
        if(marks>=100){
            grade='A';
        } else if (marks>=80) {
           grade='B';
        } else if (marks>=60) {
            grade='c';
        }else {
            grade = 'f';
        }

        switch(grade) {
            case 'A':
                feedback = "excellent";
                break;
            case 'B':
                feedback = "good job";
                break;
            case 'c':
                feedback = "you passed";
                break;
            default:
                feedback = "fail try it";
                break;

            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
        }
        System.out.println("grade:"+grade);
        System.out.println("feedback:"+feedback);

        }
    }
