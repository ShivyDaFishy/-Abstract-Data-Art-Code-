import org.code.theater.*;

public class DataScene extends Scene {

  /**
   * Creates a new array of dogs called canine
   */
  
 private Dog[] canine;     

  
  public DataScene() {
    canine = createCanine();
  }
  /**
   * Sets the dog list to include the dog names and life expectancy txt.
   */
 
  public Dog[] createCanine() {
    String[] dogNamesArray = FileReader.toStringArray("DogNames.txt");
    String[] lifeExpectancyArray = FileReader.toStringArray("LifeExpectancy.txt");
    
    Dog[] canineArray = new Dog[dogNamesArray.length];
    for (int i = 0; i < canineArray.length; i++) {
      canineArray[i] = new Dog(dogNamesArray[i], lifeExpectancyArray[i]);
    }

    return canineArray;
  }

    /**
   * Gets a random dog from the canine list
   */
public Dog getRandomDog() {
  int randomIndex = (int) (Math.random() * canine.length);
  return canine[randomIndex];
}



  /**
   * Prints out info in the console dog.
   * sets up the lifeExpectancy and sets up what face should be equal to what life expectancy
   * sets the drawing in the theater
   */


  
  public void drawScene() {
Dog randomDog = getRandomDog();
    System.out.println("Dog: " + randomDog.getDogName());
    System.out.println("Life Expectancy " + randomDog.getLifeExpectancy() + " years");

      String lifeExpectancy = randomDog.getLifeExpectancy(); 
  
    String face;
    if (lifeExpectancy.equals("12-15")){
      face = ":)";
    }
    else if (lifeExpectancy.equals("10-12") || lifeExpectancy.equals("8-10")) {
      face = ":/";
    }
    else {
      face = ":'( ";
    }

    setTextHeight(50);
    drawText(face, 100, 100);
 
    




    
  }


  
}



 