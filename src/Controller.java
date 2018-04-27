
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryce
 */

public class Controller {
    private TriviaUI theTriviaUI;
    private QuestionLists ql;
    
    public Controller(){
        ql = new QuestionLists();
        
        theTriviaUI = new TriviaUI(ql);
        theTriviaUI.setVisible(true);
        
        buttonListeners();
        

        
    }
    
    public void buttonListeners(){
        theTriviaUI.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userAnswer = theTriviaUI.getInputBar().getText();
                System.out.println(ql.getRandomQuestion().toString());
                
            }

        });
        
    }
    
    public void questionPrompt(){
        
    }
    
    
    
}
