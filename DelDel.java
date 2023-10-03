
public class DelDel {
    public static void main(String[] args) {

        /*

      Given a string, if the string "del" appears starting at index 1,
      return a string where that "del" has been deleted. Otherwise, return the string unchanged.


            delDel("adelbc") → "abc"
            delDel("adelHello") → "aHello"
            delDel("adedbc") → "adedbc"

      */
        System.out.println(delDel("add"));


    }

    public static String delDel(String str) {

        if (str.length()>=4 && str.substring(1, 4).equals("del")) {

            return str.charAt(0) + str.substring(4);
        } else {

            return str;
        }
    }


    }



































