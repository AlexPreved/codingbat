/**http://codingbat.com/prob/p165701
 We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 Given 2 int values, return true if one or the other is teen, but not both.

 loneTeen(13, 99) → true
 loneTeen(21, 19) → true
 loneTeen(13, 13) → false
 */


public class LoneTeen {
    public boolean loneTeen(int a, int b) {
            boolean teena = a>=13 && a <= 19;
            boolean teenb = b>=13 && b <= 19;

      //      return (teena || teenb) && teena != teenb;
        return (teena && !teenb) || (!teena && teenb);




//        if (a >= 13 && a <= 19) a = 1;
//        if (b >= 13 && b <= 19) b = 1;
//
//        return ((a == 1 || b ==1) && a != b);


    }
}
