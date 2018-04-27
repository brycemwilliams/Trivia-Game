
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
     private JButton food, popCulture, technology, nature, music, sports; 
     private JTextField inputBar;
     private JTextField answerBar;
     private JButton submitButton;
     private QuestionLists ql;
    
     public TriviaUI(QuestionLists newQL){
        ql = newQL;
         
        viewComponents();
        
    }
    private void viewComponents(){
        setTitle("Agile Trivia Game");
        setSize(650,450);
        
        setQuestionPanel(new JPanel());
        setCategoriesPanel(new JPanel());
        
        setFood(new JButton("Food"));
        setPopCulture(new JButton("Pop Culture"));
        setTechnology(new JButton("Technology"));
        setNature(new JButton("Nature"));
        setMusic(new JButton("Music"));
        
        setSubmitButton(new JButton("Submit!!"));
        
        setInputBar(new JTextField("Input Answer Here"));
        answerBar = new JTextField(ql.getRandomQuestion().getQuestion());
        
        
        getCategoriesPanel().setLayout(new FlowLayout());
        getQuestionPanel().setLayout(new BorderLayout());
        
        getQuestionPanel().add(getInputBar(), BorderLayout.SOUTH);
        getQuestionPanel().add(getSubmitButton(), BorderLayout.LINE_END);
        
        getCategoriesPanel().add(getFood());
         getCategoriesPanel().add(getPopCulture());
          getCategoriesPanel().add(getTechnology());
           getCategoriesPanel().add(getNature());
            getCategoriesPanel().add(getMusic());
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(getQuestionPanel(), BorderLayout.NORTH);
        getContentPane().add(answerBar, BorderLayout.CENTER);
        getContentPane().add(getCategoriesPanel(), BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public void populateQuestion(QuestionLists ql){
        
    }

    /**
     * @return the questionPanel
     */
    public JPanel getQuestionPanel() {
        return questionPanel;
    }

    /**
     * @param questionPanel the questionPanel to set
     */
    public void setQuestionPanel(JPanel questionPanel) {
        this.questionPanel = questionPanel;
    }

    /**
     * @return the categoriesPanel
     */
    public JPanel getCategoriesPanel() {
        return categoriesPanel;
    }

    /**
     * @param categoriesPanel the categoriesPanel to set
     */
    public void setCategoriesPanel(JPanel categoriesPanel) {
        this.categoriesPanel = categoriesPanel;
    }

    /**
     * @return the food
     */
    public JButton getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(JButton food) {
        this.food = food;
    }

    /**
     * @return the popCulture
     */
    public JButton getPopCulture() {
        return popCulture;
    }

    /**
     * @param popCulture the popCulture to set
     */
    public void setPopCulture(JButton popCulture) {
        this.popCulture = popCulture;
    }

    /**
     * @return the technology
     */
    public JButton getTechnology() {
        return technology;
    }

    /**
     * @param technology the technology to set
     */
    public void setTechnology(JButton technology) {
        this.technology = technology;
    }

    /**
     * @return the nature
     */
    public JButton getNature() {
        return nature;
    }

    /**
     * @param nature the nature to set
     */
    public void setNature(JButton nature) {
        this.nature = nature;
    }

    /**
     * @return the music
     */
    public JButton getMusic() {
        return music;
    }

    /**
     * @param music the music to set
     */
    public void setMusic(JButton music) {
        this.music = music;
    }

    /**
     * @return the sports
     */
    public JButton getSports() {
        return sports;
    }

    /**
     * @param sports the sports to set
     */
    public void setSports(JButton sports) {
        this.sports = sports;
    }

    /**
     * @return the inputBar
     */
    public JTextField getInputBar() {
        return inputBar;
    }

    /**
     * @param inputBar the inputBar to set
     */
    public void setInputBar(JTextField inputBar) {
        this.inputBar = inputBar;
    }

    /**
     * @return the submitButton
     */
    public JButton getSubmitButton() {
        return submitButton;
    }

    /**
     * @param submitButton the submitButton to set
     */
    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }
    
}
