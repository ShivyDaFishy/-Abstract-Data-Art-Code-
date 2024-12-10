import org.code.theater.*;
import org.code.media.*;

public class Dog{

  private String dogName;
  private String lifeExpectancy;

  public Dog(String dogName, String lifeExpectancy){
    this.dogName = dogName;
      this.lifeExpectancy = lifeExpectancy;
  }

  public String getDogName() {
    return dogName;
  }

  public String getLifeExpectancy () {
    return lifeExpectancy;
  }

  public String toString() {
    return "Name :" + dogName;
  }
    public String toString2() {
      return "Life Expectancy: " + lifeExpectancy;
    }


 
  }

 