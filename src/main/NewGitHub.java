package main;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by админ on 29.01.2017.
 */
public class NewGitHub {

    public static void main(String[]args){
        System.out.println("Method that returns static variable "+CoolObject.isFirstRun());
        System.out.println("Static variable "+CoolObject.firstRun);
        System.out.println("New project");
        System.out.println("Hello!");
        Scanner scan = new Scanner(System.in);
        int integ = 0;
        integ = scannerInputFilter(scan);

        if(integ != 0){
            System.out.println(integ);
        }

        CoolObject answerSlave = new CoolObject();
        String question = scannerStringFilter();
        System.out.println(question);
        System.out.println(answerSlave.getAnswerOnQuestion(question));
        scannerStringFilterMultipleTimes();

        scannerStringFilterMultipleTimesWithSwitchCase();
    }

    private static int scannerInputFilter(Scanner scan){
        int integ = 0;
        while(!scan.hasNextInt()){
            System.out.println("You have entered wrong value");
            scan.next();
        }

        integ = scan.nextInt();
        return integ;
    }

    private static String scannerStringFilterMultipleTimes(){
        Scanner scan = new Scanner(System.in);
        CoolObject answerSlave = new CoolObject();
        String question = "";
        System.out.println("Please enter enter your questio");
        while(scan.hasNextLine() && !(question = scan.nextLine()).equalsIgnoreCase("close")){
            System.out.println(answerSlave.getAnswerOnQuestion(question));
        }

        if(question.isEmpty()){
            return "You have no ability to ask questions";
        }

        return question;
    }

    private static String scannerStringFilterMultipleTimesWithSwitchCase(){
        Scanner scan = new Scanner(System.in);
        String question = "";
        System.out.println("Please enter enter your questio");
        while(scan.hasNextLine() && !(question = scan.nextLine()).equalsIgnoreCase("close")){
            System.out.println(answerTheQuestion(question));
        }

        if(question.isEmpty()){
            return "You have no ability to ask questions";
        }

        return question;
    }

    private static String scannerStringFilter(){
        Scanner scan = new Scanner(System.in);
        String question = "";
        System.out.println("Please enter the sicret password");
        while(scan.hasNextLine() && !(question = scan.nextLine()).equalsIgnoreCase("please@pass_me")){
            System.out.println("Wrong password. Please try again");
        }
        System.out.println("You have passed a filter. Now ask your question");

        question = scan.nextLine();

        if(question.isEmpty()){
            return "Please ask a question";
        }

        return question;
    }

    private static String answerTheQuestion(String question){
        String answer = "";
        switch (question){
            case "How old are you" : answer = "25";
                break;
            case "What is your name" : answer = "Alexander";
                break;
            case "Where do you live" : answer = "In Kiev";
                break;
            case "What is your mother's name" : answer = "Antonina";
                break;
            default: answer = "Blank";
                break;
        }
        return answer;
    }

}
