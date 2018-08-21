/**https://codingbat.com/prob/p196441
 Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
 So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

 everyNth("Miracle", 2) → "Mrce"
 everyNth("abcdefg", 2) → "aceg"
 everyNth("abcdefg", 3) → "adg"
 */


public class EveryNth {
    public String everyNth (String str, int n){
        String ret = "";
        for (int i = 0; i < str.length(); i = i + n){
            ret = ret + str.charAt(i);
        }
        return ret;


//        String ret = "";
//        for (int i = 0; i < str.length(); i++){
//            if (i % n == 0) ret = ret + str.charAt(i);
//        }
//        return ret;

    }
}
