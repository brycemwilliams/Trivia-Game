
public class QuestionPrompt {
    private QuestionLists ql;
    private boolean gameWon ;
    
    QuestionPrompt(){
        gameWon = false;
        
        ql = new QuestionLists();
        

    }
    
    public void ongoingPrompt(String userResponse){
        
        
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

    /**
     * @return the gameWon
     */
    public boolean isGameWon() {
        return gameWon;
    }

    /**
     * @param gameWon the gameWon to set
     */
    public void setGameWon(boolean gameWon) {
        this.gameWon = gameWon;
    }
    
    
}
