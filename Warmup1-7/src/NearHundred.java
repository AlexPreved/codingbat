/**http://codingbat.com/prob/p184004
 Given an int n, return true if it is within 10 of 100 or 200.
 Note: Math.abs(num) computes the absolute value of a number.

 nearHundred(93) → true
 nearHundred(90) → true
 nearHundred(89) → false
 */
//public boolean nearHundred(int n) {
//  {


/*** SOLUTION ***/
public class NearHundred {
    public boolean nearHundred(int n){

    }

    public static void main(String[] args) {
        NearHundred nearHundred = new NearHundred();
        System.out.println("false:  //" + nearHundred.nearHundred(-89));
        System.out.println("false:  //" + nearHundred.nearHundred(0));
        System.out.println("false:  //" + nearHundred.nearHundred(89));
        System.out.println("true:  //" + nearHundred.nearHundred(90));
        System.out.println("true:  //" + nearHundred.nearHundred(110));
        System.out.println("false:  //" + nearHundred.nearHundred(111));
        System.out.println("false:  //" + nearHundred.nearHundred(189));
        System.out.println("true:  //" + nearHundred.nearHundred(190));
        System.out.println("true:  //" + nearHundred.nearHundred(210));
        System.out.println("false:  //" + nearHundred.nearHundred(211));
        System.out.println("false:  //" + nearHundred.nearHundred(1000));
    }
}
