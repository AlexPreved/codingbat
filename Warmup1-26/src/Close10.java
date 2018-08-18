/**https://codingbat.com/prob/p172021
 Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
 Note that Math.abs(n) returns the absolute value of a number.

 close10(8, 13) → 8
 close10(13, 8) → 8
 close10(13, 7) → 0
 */


public class Close10 {
    public  int close10 (int a, int b){
//        int c10 = 10;
//        int rasstA = 0, rasstB = 0;

//        if (a < 0) rasstA = Math.abs(a) + c10;
//        if (a >= 0 && a <= 10) rasstA = c10 - a;
//        if (a > c10) rasstA = a - c10;
//
//        if (b < 0) rasstB = Math.abs(b) + c10;
//        if (b >= 0 && b <= 10) rasstB = c10 - b;
//        if (b > c10) rasstB = b - c10;

        int c10 = 10;
        int rasstA = Math.abs(a-c10);
        int rasstB = Math.abs(b-c10);

        if (rasstA < rasstB) return a;
        else if (rasstB < rasstA) return b;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(Math.max(-5, 500));
    }

}
