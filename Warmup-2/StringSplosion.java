
public class StringSplosion {
    public static void main(String[] args) {


        /*


Given a non-empty string like "Code" return a string like "CCoCodCode".


        stringSplosion("Code") → "CCoCodCode"
        stringSplosion("abc") → "aababc"
        stringSplosion("ab") → "aab"
        */


        System.out.println(stringSplosion("Code"));


    }
    public  static  String stringSplosion(String str) {
        String result = ""; // Bu değişken sonuçları biriktirecektir.

        for (int i = 0; i < str.length() ; i++) {

              result = result + str.substring(0, i + 1);

        } return result;

    }












}

