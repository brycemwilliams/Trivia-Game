
public class QandA {
    String question;
    String answer;
    
    public QandA(String newQuestion, String newAnswer){
        this.question = newQuestion;
        this.answer = newAnswer;
    }
    
    public boolean isAnswerCorrect(String userResponse){
        if(userResponse.contains(answer)){
            return true;
        }
        else return false;
    }
}
