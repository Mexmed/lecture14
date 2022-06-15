import java.util.Scanner;

public class Main {
    public static void countYAndZ(String word){
      int count = 0;
      int count2 = 0;
     char temp;
        for (int i = 0; i < word.length(); i++) {

            temp = word.charAt(i);
            if (temp == 'y') {
                count++;
            }
            if (temp == 'z') {
                count2++;
            }
        }
        System.out.println("There are " + count + " y" + " and " + count2 + " z");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String text = s.next();
        System.out.println(text);
       countYAndZ(text);
    }
}