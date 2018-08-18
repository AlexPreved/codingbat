/**https://codingbat.com/prob/p199720
 Given a string, return a string made of the first 2 chars (if present),
 however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

 startOz("ozymandias") → "oz"
 startOz("bzoo") → "z"
 startOz("oxx") → "o"
 */


public class StartOz {
    public String startOz (String str) {
        // String o = "", z = "";
        // if (str.length() > 0 && str.charAt(0) == 'o') o = String.valueOf('o');
        // if (str.length() > 1 && str.charAt(1) == 'z') z = String.valueOf('z');
        // return o + z;

        String ret = "";
        if (str.length() > 0 && str.charAt(0) == 'o') ret += str.charAt(0);
        if (str.length() > 1 && str.charAt(1) == 'z') ret += str.charAt(1);
        return ret;
    }
}
