import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava{

  Random randMachine = new Random();
  
  public ArrayList<Integer> getTenRolls(){
    ArrayList<Integer> result = new ArrayList<Integer>();
    for( int i=0; i<10; i++){
      result.add(randMachine.nextInt(6)+1);
    }
    return result;
  }
}