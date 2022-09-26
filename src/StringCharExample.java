public class StringCharExample {
    public static void main(String[] args) {
        char ince = 'E';
        char kalin = 'A';

        String sentence= "Today is very very good day for people";

        int counterInce = 0;
        int counterKalin=0;

        System.out.println(sentence);

        for (char a:sentence.toUpperCase().toCharArray()) {
            if (a==ince){
                counterInce++;
            } else if (a==kalin) {
                counterKalin++;
            }
        }
        System.out.println(counterInce);
        System.out.println(counterKalin);

    }
}
