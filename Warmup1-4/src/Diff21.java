/**
 * http://codingbat.com/prob/p116624
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 * <p>
 * diff21(19) → 2
 * diff21(10) → 11
 * diff21(21) → 0
 */
//  public int diff21(int n) {
//  {


/*** SOLUTION ***/
public class Diff21 {
    public int diff21(int n) {
        if (n <= 21) return 21-n;
        else return 2*(n-21);
    }

    public static void main(String[] args) {
        Diff21 diff21 = new Diff21();
        System.out.println("2:  ///" + diff21.diff21(19));
        System.out.println("11: ///" + diff21.diff21(10));
        System.out.println("0: ///" + diff21.diff21(21));
        System.out.println("18: ///" + diff21.diff21(30));
    }
}
