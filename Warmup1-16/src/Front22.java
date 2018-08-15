/**http://codingbat.com/prob/p183592
 Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
 so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

 front22("kitten") → "kikittenki"
 front22("Ha") → "HaHaHa"
 front22("abc") → "ababcab"
 */


public class Front22 {
    public String front22(String str) {
        int cut = 2;
        if (cut > str.length())
            cut = str.length();
        String first = str.substring(0, cut);
        return first + str + first;




//        if (str.length() < 3) return str + str + str;
//        String first = str.substring(0 , 2);
//        return first + str + first;





    }
}
