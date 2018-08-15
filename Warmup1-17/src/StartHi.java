/**http://codingbat.com/prob/p191022
 Given a string, return true if the string starts with "hi" and false otherwise.

 startHi("hi there") → true
 startHi("hi") → true
 startHi("hello hi") → false
 */

public class StartHi {
    public boolean startHi (String str) {
            return str.length()>=2 && str.substring(0 , 2).equals("hi");





//        1st solution(fail): StringIndexOutOfBoundsException with "h" and "" strings
//        return str.charAt(0) == 'h' && str.charAt(1) == 'i';

//        2nd solution(SUCCESS): but without String.equals;
//        return str.length() >=2 && str.charAt(0) == 'h' && str.charAt(1) == 'i';
    }
}
