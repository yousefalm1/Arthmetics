public class Main {
    public static void main(String[] args) {
        double amountKWD = 86;


        double amountInUSD = amountKWD *= 3.25;

        System.out.println("$" + amountInUSD);


        double amountBackToKWD = amountInUSD /= 3.25;

        System.out.println(amountBackToKWD + "KWD");



        double amountToEuro = amountKWD *= 0.33;
        System.out.println(amountToEuro);

        double amountFromEuroToKWD = amountToEuro /= 0.33;

        System.out.println(amountFromEuroToKWD + "KWD") ;


    }



}
