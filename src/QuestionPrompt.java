
public class QuestionPrompt {
    private String userResponse = "";
    private QuestionLists ql;
    
    QuestionPrompt(){
        ql = new QuestionLists();
        

    }
    
    public void ongoingPrompt(){
        while(getUserResponse() != "done") {
            QandA q1 = new QandA("What does ROM stand for?", "read only memory");
            System.out.println(q1.getQuestion());
            
        
            if(q1.isAnswerCorrect(getUserResponse())){
                System.out.println("Right answer!");
                break;
            }
        }
    }

    /**
     * @return the userResponse
     */
    public String getUserResponse() {
        return userResponse;
    }

    /**
     * @param userResponse the userResponse to set
     */
    public void setUserResponse(String userResponse) {
        this.userResponse = userResponse;
    }

    /**
     * @return the ql
     */
    public QuestionLists getQl() {
        return ql;
    }

    /**
     * @param ql the ql to set
     */
    public void setQl(QuestionLists ql) {
        this.ql = ql;
    }
    
    
}
