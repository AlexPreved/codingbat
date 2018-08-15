/**
 * http://codingbat.com/prob/p136351
 * Given a string, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there.
 * Return a new string which is 3 copies of the front.
 * <p>
 * front3("Java") → "JavJavJav"
 * front3("Chocolate") → "ChoChoCho"
 * front3("abc") → "abcabcabc"
 */
public class Front3 {
    public String front3(String str) {
        String front;
        if (str.length() < 3) {
            front = str;
        }
        else {
            front = str.substring(0 , 3);
        }
        return front + front + front;


//        String x3str = "";
//
//        if (str.length() < 3) {
//            for (int i = 0; i < 3; i++) {
//                x3str += str;
//            }
//            return x3str;}
//
//        for (int z = 0; z < 3; z++) {
//            x3str += str.substring(0, 3);
//        }
//        return x3str;
    }

}
