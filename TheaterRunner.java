import org.code.theater.*;


  /**
   * Creates the theater and draws the scene
   */

public class TheaterRunner {
  public static void main(String[] args) {

   
    DataScene scene = new DataScene();
    
   
    scene.drawScene();
    
   
    Theater.playScenes(scene);
    
  }
}
    
    