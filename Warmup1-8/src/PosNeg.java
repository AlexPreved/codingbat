/**
 * http://codingbat.com/prob/p159227
 * Given 2 int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both are negative.
 * <p>
 * posNeg(1, -1, false) → true
 * posNeg(-1, 1, false) → true
 * posNeg(-4, -5, true) → true
 */
//  public boolean posNeg(int a, int b, boolean negative) {
//  {


/*** SOLUTION ***/
public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
//        if (!negative && (a < 0 && b > 0 || a > 0 && b < 0)) return true;
//        else if (negative && (a < 0 && b < 0)) return true;

//        else return false;

        return (!negative && (a < 0 && b > 0 || a > 0 && b < 0) || negative && (a < 0 && b < 0));
//        if (negative) {
//            if (a < 0 && b < 0) return true;
//            else return false;
//        } else {
//            if ((a < 0 && b > 0) || (a > 0 && b < 0)) return true;
//            else return false;
//        }

//        public boolean posNeg(int a, int b, boolean negative) {
//            if (negative) {
//                return (a < 0 && b < 0);
//            }
//            else {
//                return ((a < 0 && b > 0) || (a > 0 && b < 0));
//            }
//        }

    }

    public static void main(String[] args) {

    }
}
