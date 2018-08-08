/**http://codingbat.com/prob/p181646

 We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

 monkeyTrouble(true, true) → true
 monkeyTrouble(false, false) → true
 monkeyTrouble(true, false) → false
 */
//  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//  }


/*** SOLUTION ***/
public class MonkeyTrouble {
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
      if (aSmile && bSmile || !aSmile && !bSmile) return true;
      else return false;

//      return ((aSmile && bSmile) || (!aSmile && !bSmile));
//      return (aSmile == bSmile);
  }
    public static void main(String[] args) {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        System.out.println("Must return true: ///" + monkeyTrouble.monkeyTrouble(true, true));
        System.out.println("Must return false: ///" + monkeyTrouble.monkeyTrouble(true, false));
        System.out.println("Must return false: ///" + monkeyTrouble.monkeyTrouble(false, true));
        System.out.println("Must return true: ///" + monkeyTrouble.monkeyTrouble(false, false));
    }
}
