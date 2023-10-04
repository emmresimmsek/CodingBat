
public class StringE {
    public static void main(String[] args) {

        /*

       if the given string contains between 1 and 3 'e' chars.


            stringE("Hello") → true
            stringE("Heelle") → true
            stringE("Heelele") → false

      */
        System.out.println(stringE("Hello"));

    }

    public static boolean stringE(String str) {
        int result = 0;  // Başlangıç değerini sıfır yapmayı unutma!
        for (int i = 0; i < str.length() ; i++) {


           if ( str.substring(i,i+1).equals("e")  ) {

            result++;


           }





        } return (result >= 1 && result <= 3) ;






    }
}

























