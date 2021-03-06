/**
 * http://codingbat.com/prob/p191914
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged.
 * Note: use .equals() to compare 2 strings.
 * <p>
 * notString("candy") → "not candy"
 * notString("x") → "not x"
 * notString("not bad") → "not bad"
 */
//public String notString(String str) {
//  {


/*** SOLUTION ***/
public class NotString {
//    public String notString(String str) {
//        String[] substr = str.split(" ");
//        if (substr[0].equals("not")) return str;
//        else return "not " + str;
//    }

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }


    public static void main(String[] args) {
        NotString notString = new NotString();
        System.out.println(notString.notString("test"));
        System.out.println(notString.notString("nottest"));
        System.out.println(notString.notString("not test"));
    }
}
