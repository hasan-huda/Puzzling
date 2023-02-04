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

  public char getRandomLetter(){
    char[] alphabet= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    return alphabet[randMachine.nextInt(26)];
  }

  public String generatePassword(){
    String password="";
    for( int i=0; i<8; i++){
      password+=getRandomLetter();
    }
    return password;
  }

  public String[] getNewPasswordSet(int num){
    String[] result = new String[num];
    for( int i=0; i<num;i++){
      result[i]=generatePassword();
    }
    return result;
  }
}