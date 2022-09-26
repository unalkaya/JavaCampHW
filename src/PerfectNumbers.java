public class PerfectNumbers {
    public static void main(String[] args) {

        int number =28;
        int counter =0;

        for (int i=1;i<((number/2)+1);i++){
            if (number%i==0){
                counter = counter+i;
            }
        }

        if(counter == number){
            System.out.println("This number is perfect");
        }else{
            System.out.println("This number is idiot");
        }

    }
}
