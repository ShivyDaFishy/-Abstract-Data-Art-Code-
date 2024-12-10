import org.code.theater.*;
import org.code.media.*;

public class Dog{

  /**
   * Instance Variables
   */
  
  private String dogName;
  private String lifeExpectancy;

  /**
   * Parameterlized constructur
   */
  
  public Dog(String dogName, String lifeExpectancy){
    this.dogName = dogName;
      this.lifeExpectancy = lifeExpectancy;
  }

    /**
   * Accessor methods
   */
  public String getDogName() {
    return dogName;
  }

  public String getLifeExpectancy () {
    return lifeExpectancy;
  }

  /**
   * To String methods
   */
  
  public String toString() {
    return "Name :" + dogName;
  }
    public String toString2() {
      return "Life Expectancy: " + lifeExpectancy;
    }


 
  }

 