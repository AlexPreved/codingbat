/**https://codingbat.com/prob/p186759
 Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

 doubleX("axxbb") → true
 doubleX("axaxax") → false
 doubleX("xxxxx") → true
 */


public class DoubleX {
    public boolean doubleX(String str){
        int x = str.indexOf("x");
        if (x == -1) return false;
        if (str.substring(x).startsWith("xx")) return true;
        return false;


//        int i = str.indexOf("x");
//        if (i == -1) return false;
//        if (i + 1 >= str.length()) return false;
//        return str.substring(i + 1, i + 2).equals("x");


//        return (str.indexOf('x') < (str.length()-1) && str.charAt(str.indexOf('x') + 1) == 'x');

    }

    public static void main(String[] args) {

    }
}
