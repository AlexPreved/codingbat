/**http://codingbat.com/prob/p154485
 Given two int values, return their sum. Unless the two values are the same, then return double their sum.

 sumDouble(1, 2) → 3
 sumDouble(3, 2) → 5
 sumDouble(2, 2) → 8
 */
//  public int sumDouble(int a, int b) {
//  {


/*** SOLUTION ***/
public class SumDouble {

    public int sumDouble(int a, int b) {
//        if (a != b) return a+b;
//        else return 2*(a+b);
        int sum = a + b;
        if (a==b) sum = sum * 2;
        return sum;
    }

    public static void main(String[] args) {
        SumDouble sum = new SumDouble();
        System.out.println("must be 4:  ///" + sum.sumDouble(1,1));
        System.out.println("must be 12:  ///" + sum.sumDouble(3,3));
        System.out.println("must be 64:  ///" + sum.sumDouble(16,16));
        System.out.println("must be 5:  ///" + sum.sumDouble(2,3));
        System.out.println("must be 9:  ///" + sum.sumDouble(5,4));
        System.out.println("must be 36:  ///" + sum.sumDouble(9,9));

    }
}
