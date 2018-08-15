/**http://codingbat.com/prob/p123384
 Given a string, return a new string where the first and last chars have been exchanged.

 frontBack("code") → "eodc"
 frontBack("a") → "a"
 frontBack("ab") → "ba"
 */


public class FrontBack {
    public String frontBack(String str) {
        if (str.length() > 1) {
            char first = str.charAt(0);
            char last = str.charAt(str.length() -1);
            String mid = str.substring(1, str.length() - 1);
            return last + mid + first;
        }
        return str;

//        if (str.length()>1) {
//
//        String first = str.substring(0,1);
//        String mid = str.substring(1,str.length()-1);
//        String last = str.substring(str.length()-1, str.length());
//
//        return  last + mid + first;}
//
//        return str;
    }

    public static void main(String[] args) {

    }
}
