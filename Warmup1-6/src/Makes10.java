/**http://codingbat.com/prob/p182873
 Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

 makes10(9, 10) → true
 makes10(9, 9) → false
 makes10(1, 9) → true
 */
//public boolean makes10(int a, int b) {
//  {


/*** SOLUTION ***/
public class Makes10 {
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
//        if (a == 10 | b == 10) return true;
//        else if (a + b == 10) return true;
//        else return false;
    }

    public static void main(String[] args) {
        Makes10 makes10 = new Makes10();
        System.out.println("true:  ///" + makes10.makes10(9,10));
        System.out.println("false:   ///" + makes10.makes10(9,9));
        System.out.println("true:  ///" + makes10.makes10(1,9));
        System.out.println("true:   ///" + makes10.makes10(10,1));
        System.out.println("true:   ///" + makes10.makes10(10,10));
        System.out.println("true:   ///" + makes10.makes10(8,2));
        System.out.println("false:   ///" + makes10.makes10(8,3));
        System.out.println("true:   ///" + makes10.makes10(10,42));
        System.out.println("true:   ///" + makes10.makes10(12,-2));
    }
}
