import java.util.ArrayList;
import java.util.Random;


public class QuestionLists {
    private ArrayList<QandA> animals;
    private ArrayList<QandA> technology; 
    private ArrayList<QandA> nature; 
    private ArrayList<QandA> sports; 
    private ArrayList<QandA> food; 
    private ArrayList<ArrayList<QandA>> bigList;
    
    
    public QuestionLists(){
        bigList = new ArrayList<ArrayList<QandA>>();
        
        //animal category
        animals = new ArrayList<QandA>();
        QandA a1 = new QandA("Lemurs are native to only what Country?", "Madagascar"); getAnimals().add(a1);
        QandA a2 = new QandA("How many legs does a spider have?", "8"); getAnimals().add(a2);
        QandA a3 = new QandA("Canis lupus familaris is the scientific name for which common animal", "Dog"); getAnimals().add(a3);
        bigList.add(animals);
        
        //food category
        food = new ArrayList<QandA>();
        QandA f1 = new QandA("What US state is famous for their juicy peaches?","Georgia"); getFood().add(f1);
        QandA f2 = new QandA("What is sushi traditionally wrapped in?", "Seaweed" ); getFood().add(f2);
        QandA f3 = new QandA("What popular beverage once contained cocaine?", "Coca-Cola"); getFood().add(f3); 
        bigList.add(food);
        
        //technology category
        technology = new ArrayList<QandA>();
        QandA t1 = new QandA("When did the Apple iPHone first become available", "2007"); getTechnology().add(t1); 
        QandA t2 = new QandA("What does ROM stand for?", "Read Only Memory"); getTechnology().add(t2); 
        QandA t3 = new QandA("What does IBM stand for?", "International Business Machines"); getTechnology().add(t3); 
        bigList.add(technology);
        
        //nature category
        nature = new ArrayList<QandA>();
        QandA n1 = new QandA("What is the name of the largest ocean on earth?", "Pacific Ocean"); getNature().add(n1); 
        QandA n2 = new QandA("Which is hotter, the center of the earth or surface of the sun?", "Center of the Earth"); getNature().add(n2);
        QandA n3 = new QandA("What is the name of the highest mountain on earth?", "Mt. Everest"); getNature().add(n3); 
        bigList.add(nature);
        
        //sports category
        sports = new ArrayList<QandA>();
        QandA s1= new QandA("How many holes are there in a full round of golf?", "18"); getSports().add(s1); 
        QandA s2 = new QandA("Who is the only athlete ever to play in a Super Bowl and a World Series?", "Deion Sanders"); getSports().add(s2); 
        QandA s3 = new QandA("What is the regulation height for a basketball hoop?", "10 feet"); getSports().add(s3); 
        bigList.add(sports);

    }
    
    public QandA getRandomQuestion(){
        Random rand = new Random();
        int randNum1 = (int) (Math.random()*3) + 0;
        int randNum2 = (int) (Math.random()*3) + 0;
        
        return bigList.get(randNum1).get(randNum2);
        //return technology.get(1);
    }

    /**
     * @return the animals
     */
    public ArrayList<QandA> getAnimals() {
        return animals;
    }

    /**
     * @param animals the animals to set
     */
    public void setAnimals(ArrayList<QandA> animals) {
        this.animals = animals;
    }

    /**
     * @return the technology
     */
    public ArrayList<QandA> getTechnology() {
        return technology;
    }

    /**
     * @param technology the technology to set
     */
    public void setTechnology(ArrayList<QandA> technology) {
        this.technology = technology;
    }

    /**
     * @return the nature
     */
    public ArrayList<QandA> getNature() {
        return nature;
    }

    /**
     * @param nature the nature to set
     */
    public void setNature(ArrayList<QandA> nature) {
        this.nature = nature;
    }

    /**
     * @return the sports
     */
    public ArrayList<QandA> getSports() {
        return sports;
    }

    /**
     * @param sports the sports to set
     */
    public void setSports(ArrayList<QandA> sports) {
        this.sports = sports;
    }

    /**
     * @return the food
     */
    public ArrayList<QandA> getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(ArrayList<QandA> food) {
        this.food = food;
    }

    /**
     * @return the bigList
     */
    public ArrayList<ArrayList<QandA>> getBigList() {
        return bigList;
    }

    /**
     * @param bigList the bigList to set
     */
    public void setBigList(ArrayList<ArrayList<QandA>> bigList) {
        this.bigList = bigList;
    }

}
