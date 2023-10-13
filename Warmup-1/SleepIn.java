public class SleepIn {
    public static void main(String[] args) {

        System.out.println(sleepIn(false,true));
    }

    // The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    // "weekday" parametresi "true"dur Eğer hafta içi ise..
    // Tatildeysek "vacation" parametresi doğrudur.
    // Hafta içi değilse yani hafta sonu ise ve tatildeysek uyuyoruz.
    //Uyuyorsak true döndür.


    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (  !weekday && vacation  ) {

            return true; // Yani uyuyoruz.. True döndürdük.

        } else if (weekday  && vacation){

            return true; // Uyuyoruz.
        }

        else if (!weekday  && !vacation){

            return true;  // Uyuyoruz.

        } else {
            return false;

        }



    }


}
