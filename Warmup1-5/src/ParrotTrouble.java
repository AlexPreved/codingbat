/**http://codingbat.com/prob/p140449

 We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
 We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

 parrotTrouble(true, 6) → true
 parrotTrouble(true, 7) → false
 parrotTrouble(false, 6) → false
 */
//  public boolean parrotTrouble(boolean talking, int hour) {
//  {


/*** SOLUTION ***/
public class ParrotTrouble {
    public boolean parrotTrouble (boolean talking, int hour) {
//        if (talking == true && (hour <7 || hour>20)) return true;
//        else return false;
        return (talking == true && (hour <7 || hour>20));
    }

    public static void main(String[] args) {
        ParrotTrouble parrotTrouble = new ParrotTrouble();
        System.out.println("true:   ///" + parrotTrouble.parrotTrouble(true, 6));
        System.out.println("false:   ///" + parrotTrouble.parrotTrouble(true, 7));
        System.out.println("false:   ///" + parrotTrouble.parrotTrouble(false, 6));
    }
}
