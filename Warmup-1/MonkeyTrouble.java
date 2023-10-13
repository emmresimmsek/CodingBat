public class MonkeyTrouble {
    public static void main(String[] args) {
    /* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling.
    Return true if we are in trouble.
    */

        System.out.println(monkeyTrouble(true,false));

    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (    aSmile   &&  bSmile  ||  !aSmile   &&  !bSmile  ) {

            return true; // We are in trouble ( Başımız Belada! )

        } else {

            return false; // not Trouble!
        }

    }






    }



