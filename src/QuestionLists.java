
import java.util.ArrayList;


public class QuestionLists {
    private ArrayList<QandA> animals;
    private ArrayList<QandA> technology; 
    private ArrayList<QandA> nature; 
    private ArrayList<QandA> sports; 
    private ArrayList<QandA> food; 
    
//    public void addPopCulture(String question, String answer)
//    {
//        return popCulture.add(new QandA(question, answer));
//    }
    
    
    public void QuestionLists(){
        //animal list
        QandA a1 = new QandA("Lemurs are native to only what Country?", "Madagascar"); animals.add(a1);
        QandA a2 = new QandA("How many legs does a spider have?", "8"); animals.add(a2);
        QandA a3 = new QandA("Canis lupus familaris is the scientific name for which common animal", "Dog"); animals.add(a3);
        
        QandA f1 = new QandA("What US state is famous for their juicy peaches?","Georgia"); food.add(f1);
        QandA f2 = new QandA("What is sushi traditionally wrapped in?", "Seaweed" ); food.add(f2);
        QandA f3 = new QandA("What popular beverage once contained cocaine?", "Coca-Cola"); food.add(f3); 
        
        QandA t1 = new QandA("When did the Apple iPHone first become available", "2007"); technology.add(t1); 
        QandA t2 = new QandA("What does ROM stand for?", "Read Only Memory"); technology.add(t2); 
        QandA t3 = new QandA("What does IBM stand for?", "International Business Machines"); technology.add(t3); 
        
        QandA n1 = new QandA("What is the name of the largest ocean on earth?", "Pacific Ocean"); nature.add(n1); 
        QandA n2 = new QandA("Which is hotter, the center of the earth or surface of the sun?", "Center of the Earth"); nature.add(n2);
        QandA n3 = new QandA("What is the name of the highest mountain on earth?", "Mt. Everest"); nature.add(n3); 
        
        QandA s1= new QandA("How many holes are there in a full round of golf?", "18"); sports.add(s1); 
        QandA s2 = new QandA("Who is the only athlete ever to play in a Super Bowl and a World Series?", "Deion Sanders"); sports.add(s2); 
        QandA s3 = new QandA("What is the regulation height for a basketball hoop?", "10 feet"); sports.add(s3); 
        //
    }

}
