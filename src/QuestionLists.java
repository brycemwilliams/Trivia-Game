
import java.util.ArrayList;


public class QuestionLists {
    private ArrayList<QandA> popCulture;
    private ArrayList<QandA> technology; 
    private ArrayList<QandA> nature; 
    private ArrayList<QandA> music; 
    private ArrayList<QandA> sports; 
    private ArrayList<QandA> food; 
    
    public boolean addQuestion(String question, String answer)
    {
        return popCulture.add(new QandA(question, answer));
    }
    
    public QuestionLists(){
        
        
    }
}
