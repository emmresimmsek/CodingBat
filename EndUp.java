
public class EndUp {
    public static void main(String[] args) {

        /*

       Given a string, return a new string where the last 3 chars are now in upper case.
       If the string has less than 3 chars, uppercase whatever is there.
       Note that str.toUpperCase() returns the uppercase version of a string.


            endUp("Hello") → "HeLLO"
            endUp("hi there") → "hi thERE"
            endUp("hi") → "HI"

      */
        System.out.println(endUp("Hello"));
    }

    public static String endUp(String str) {
       if  (  str.length()   <= 2  )      {

          return str.toUpperCase();
       }


        return str.substring(0, str.length() - 3) +
                str.substring(str.length() - 3).toUpperCase();



    }



}







