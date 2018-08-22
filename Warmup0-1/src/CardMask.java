/**
На вход подаётся String. Нужно маскировать его таким образом, чтобы метод возвращал строку сдедующего вида:
 первые шесть символов- без изменения; Три звёздочки (вне зависимости от кол-ва символов); последние четыре символа строки.

      Доп. задание1:
    Если длина строки 6-12 символов, то маскировать по принципу: n; ***(маскируется 3 и больше симв); n-1;
    Если длина строки 3-6 символов, то маскировать по принципу: 1; **(маскируется 2 и больше симв);
      Доп. задание2:
    Если длина строки меньше 3, вернуть ошибку;
      Доп. задание3:
    После прогона тестов из предыдущих заданий, предложить ввести номер карты с клавиатуры.
    И если получили ошибку, то предложить заново ввести строку для маскирования.
 */


public class CardMask {

    public String cardMask (String str) {
        String masq = "***";
        if (str.length() >= 13) {
            return str.substring(0,6) + masq + str.substring(str.length()-4, str.length());
        }
        else if (str.length() >= 6 && str.length() < 13) {
            int cutA = 0, cutE;

            cutE = 0;
            while ((str.length()- cutE - cutA > 3) ||(str.length()- cutE - cutA > 4)) {
                cutA = cutE +1;
                cutE++;
            }
            
//            for (cutE = 1; ((str.length()- cutE - cutA == 3) ||(str.length()- cutE - cutA == 4)); cutE++){
//                cutA = cutE +1;
//            }

            return str.substring(0,cutA) + masq + str.substring(str.length()-cutE+1);
        }
        return str;
    }

    public static void main(String[] args) {
        CardMask card = new CardMask();
        System.out.println(card.cardMask("1234567890absdfgwsgfwegfwcdefghijklmn"));
        System.out.println("12345***90ab - >   " + card.cardMask("1234567890ab"));
        System.out.println("1234***90a   - >   " + card.cardMask("1234567890a"));
        System.out.println("1234***890   - >   " + card.cardMask("1234567890"));
        System.out.println("123***89     - >   " + card.cardMask("123456789"));
        System.out.println("123***78     - >   " + card.cardMask("12345678"));
        System.out.println("12***7       - >   " + card.cardMask("1234567"));
        System.out.println("12***6       - >   " + card.cardMask("123456"));
        System.out.println(card.cardMask("12345"));
        System.out.println(card.cardMask("1234"));
        System.out.println(card.cardMask("123"));

    }
}
