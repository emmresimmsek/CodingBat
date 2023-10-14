public class FrontTimes {
    public static void main(String[] args) {

        /*  Given a string and a non-negative int n, we'll say that the front
        of the string is the first 3 chars, or whatever is there if the string
        is less than length 3. Return n copies of the front;


            frontTimes("Chocolate", 2) → "ChoCho"
            frontTimes("Chocolate", 3) → "ChoChoCho"
            frontTimes("Abc", 3) → "AbcAbcAbc"

       */


        System.out.println(frontTimes("Chocolate",2));
    }


    public static String frontTimes(String str, int n) {

    String result = "";

    if ( str.length() < n  ) {

        for (int i = 0; i < n ; i++) {

            result +=  str   ;

        }  return  result;


    } else {

        for (int i = 0; i < n ; i++) {

            result +=  str.substring(0,3)   ;


        } return result   ;

    }


    }


}
