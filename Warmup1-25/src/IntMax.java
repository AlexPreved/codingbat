/**https://codingbat.com/prob/p101887
 Given three int values, a b c, return the largest.

 intMax(1, 2, 3) → 3
 intMax(1, 3, 2) → 3
 intMax(3, 2, 1) → 3
 */


public class IntMax {
    public int intMax (int a, int b, int c){
        int max = Math.max(a, b);
        max = Math.max(max, c);
        return max;


//        int max;
//        if (a > b) max = a;
//        else max = b;
//        if (c > max) max = c;
//        return max;

//        if (a > b && a > c) return a;
//        if (b > a && b > c) return b;
//        if (c > a && c > b) return c;
//        return 0;
    }
}
