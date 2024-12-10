import org.code.theater.*;

public class DataScene extends Scene {

 private Dog[] canine;     

  
  public DataScene() {
    canine = createCanine();
  }

 
  public Dog[] createCanine() {
    String[] dogNamesArray = FileReader.toStringArray("DogNames.txt");
    String[] lifeExpectancyArray = FileReader.toStringArray("LifeExpectancy.txt");
    
    Dog[] canineArray = new Dog[dogNamesArray.length];
    for (int i = 0; i < canineArray.length; i++) {
      canineArray[i] = new Dog(dogNamesArray[i], lifeExpectancyArray[i]);
    }

    return canineArray;
  }

public Dog getRandomDog() {
  int randomIndex = (int) (Math.random() * canine.length);
  return canine[randomIndex];
}
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

// This is where I need help to put info in the theater class
    setTextHeight(50);
    drawText(face, 100, 100);
 
    




    
  }


  
}


 