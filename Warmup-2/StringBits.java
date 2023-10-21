
public class StringBits {
    public static void main(String[] args) {


        /*

            Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


            stringBits("Hello") → "Hlo"
            stringBits("Hi") → "H"
            stringBits("Heeololeo") → "Hello"
        */


        System.out.println(stringBits("Hello"));


    }
    public static  String stringBits(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i+=2) { // i++ : bir arttır, i+=2 : iki arttır, i+=3 : üç arttır.

            result = result + str.substring(i,i+1);



        } return result;



    }











}

