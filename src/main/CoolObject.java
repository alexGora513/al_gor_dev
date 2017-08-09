package main;
import java.util.*;

/**
 * Created by админ on 25.02.2017.
 */
public class CoolObject {
    private Set<String> feasibleQuestions;
    private Map<String, String> answersByFeasibleQuestions = new HashMap<String, String>();
    public static Boolean firstRun = true;

    public CoolObject(){
        this.feasibleQuestions = new HashSet<String>(Arrays.asList("How old are you","What is your name","Where do you live","What is your mother's name"));
        this.answersByFeasibleQuestions = new HashMap<String, String>();
        this.answersByFeasibleQuestions.put("How old are you","25");
        this.answersByFeasibleQuestions.put("What is your name","Alexander");
        this.answersByFeasibleQuestions.put("Where do you live","In Kiev");
        this.answersByFeasibleQuestions.put("What is your mother's name","Antonina");
    }

    public static Boolean isFirstRun(){
        if(firstRun){
            firstRun = false;
            return true;
        }else{
            return firstRun;
        }
    }

    public Set<String> getQuestions(){
        return this.feasibleQuestions;
    }

    public void setNewQuestion(String newQuestion){
        if(this.feasibleQuestions == null){
            this.feasibleQuestions = new HashSet<String>();
        }
        this.feasibleQuestions.add(newQuestion);
    }

    public String getAnswerOnQuestion(String question){
        if(this.answersByFeasibleQuestions == null || this.answersByFeasibleQuestions.isEmpty() || !this.answersByFeasibleQuestions.containsKey(question)){
            return "I dont want to answer your questions";
        }
        return this.answersByFeasibleQuestions.get(question);
    }
}
