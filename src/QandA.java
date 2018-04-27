
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "QandA{" + "question=" + question + ", answer=" + answer + "}";
    }
    
}
