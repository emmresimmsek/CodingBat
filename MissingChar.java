public class MissingChar {
    public static void main(String[] args) {

         /* Given a non-empty string and an int n, return a new string where the char
         at index n has been removed. The value of n will be a valid index of a char
         in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

            missingChar("kitten", 1) → "ktten"
            missingChar("kitten", 0) → "itten"
            missingChar("kitten", 4) → "kittn"
         */

           System.out.println(missingChar("kitten", 1));

    }

    public static String missingChar(String str, int n) {
        if (   n <= str.length()  ) {

            return str.substring(0, n) + str.substring(n + 1); // 2 tane substring kullandık.
            // ilk substring: n'e kadar olan harfleri alır ama n'i dahil etmez.
            // ikinci substring. n+1 den sonra sını alır sonuna kadar
            // n+1 yapmamızın sebebi n'i dahil etmemesi içindir. 

        } else {
            System.out.println("Lütfen geçerli bir sayı giriniz!");
            return str;  // yukarıdaki şartı sağlamıyorsa String str ifadesini döndürüyoruz.


        }



    }



}
















