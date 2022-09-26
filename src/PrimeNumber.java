public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("SAYİ ASAL Mİ?");

        boolean isPrime = true;
        int sayi =23;
        for (int i=2; i<sayi;i++){
            if (sayi%i == 0){
                System.out.println("This Number is not prime");
                isPrime=false;
                break;
            }
        }
        if (isPrime==true){
            System.out.println("This number is FUCKİNG PRİME");
        }

    }
}
