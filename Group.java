import java.util.LinkedList;
import java.util.Random;

public class Group {
    public static void main(String[] args) {
        
        LinkedList theGroup = new LinkedList<String>();

        theGroup.add("Johannes"); //0 
        theGroup.add("Nina"); //1 
        

        System.out.println(theGroup);

        Random itsHappening = new Random();
        int theBraveOne = itsHappening.nextInt(2);
        System.out.println("The brave one to find another partner is: " + theGroup.get(theBraveOne));
        


    }
}