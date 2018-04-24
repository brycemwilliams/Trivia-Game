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
    TriviaUI theTriviaUI;
    
    public Controller(){
        theTriviaUI = new TriviaUI(this);
        theTriviaUI.setVisible(true);
    }
}
