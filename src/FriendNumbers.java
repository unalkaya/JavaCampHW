public class FriendNumbers {
    public static void main(String[] args) {
        int number1 =220;
        int number2=284;

        if (deviCounter(number1)==number2 && deviCounter(number2)==number1){
            System.out.println("This numbers are friends");
        }
        else{
            System.out.println("this number are not friends");
        }
    }

    public static int deviCounter(int number){
        int counter = 0;
        for(int i=1;i<((number/2)+1);i++){
            if (number%i==0){
                counter = counter + i;
            }
        }
        return counter;
    }
}
