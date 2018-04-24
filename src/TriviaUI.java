
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryce
 */
public class TriviaUI extends JFrame {
     private JPanel questionPanel;
     private JPanel categoriesPanel;
     Controller Controller;
     private JButton food, popCulture, technology, nature, music, sports; 
     private JTextField inputBar;
     private JButton submitButton;
    public TriviaUI(Controller Controller){
        this.Controller = Controller;
        viewComponents();
        
    }
    private void viewComponents(){
        setTitle("Agile Trivia Game");
        setSize(650,450);
        
        questionPanel = new JPanel();
        categoriesPanel = new JPanel();
        
        food = new JButton("Food");
        popCulture = new JButton("Pop Culture");
        technology = new JButton("Technology");
        nature = new JButton("Nature");
        music = new JButton("Music");
        
        submitButton = new JButton("Submit!!");
        
        inputBar = new JTextField("Input Answer Here");
        
        categoriesPanel.setLayout(new FlowLayout());
        questionPanel.setLayout(new BorderLayout());
        
        questionPanel.add(inputBar, BorderLayout.SOUTH);
        questionPanel.add(submitButton, BorderLayout.LINE_END);
        
        categoriesPanel.add(food);
         categoriesPanel.add(popCulture);
          categoriesPanel.add(technology);
           categoriesPanel.add(nature);
            categoriesPanel.add(music);
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(questionPanel, BorderLayout.NORTH);
        getContentPane().add(categoriesPanel, BorderLayout.SOUTH);
        
    }
    
}
