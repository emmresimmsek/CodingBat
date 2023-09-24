public class Diff21 {
    public static void main(String[] args) {
    /*  Given an int n, return the absolute difference
        between n and 21, except return double the absolute difference if n is over 21.

        diff21(19) → 2
        diff21(10) → 11
        diff21(21) → 0               */

        System.out.println(diff21(22));

    }

    public static int diff21(int n) {



        if (   n > 21   ){

            return (n-21)*2; // sonunun eksi olmaması için n'i başa aldım (n-21). Sağda olsa eksi sonuç verecekti.

        } else {

            return 21-n;
        }

    }







}



