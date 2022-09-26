public class SayiBulma {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,5,4,7,9,0};

        int number = 2;
        boolean found = false;

        for (int i : sayilar) {
            if (i==number){
                System.out.println("we found the number");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println(" no number is equals");
        }
    }
}
