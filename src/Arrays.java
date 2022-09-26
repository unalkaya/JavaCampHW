public class Arrays {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        System.out.println("Hello World");

        double[] mylist = {3.4, 5.6, 6.5, 4.4, 7.5};
        double max = mylist[0];
        double total = 0;

        for (double i : mylist) {
            System.out.println(i);
            if (max < i) {
                max = i;
            }
            total = total + i;


        }
        System.out.println(total);
        System.out.println(max);


        String[][] sehirler = new String[2][2];

        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Ankara";
        sehirler[1][0]="İzmir";
        sehirler[1][1]="Mersin";

        for (int i = 0; i<2; i++){
            for (int j=0;j<2;j++){
                System.out.println(sehirler[i][j]);
            }
        }



    }
}
