import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String  text = s.next().toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
             if(text.charAt(0) == text.charAt(text.length()-1)){
                 System.out.print(text.charAt(i) + " ");
                 count ++;
             }
        }
        if(count >= 2 ){
            System.out.println("Has mirrored parts");
        }else{
            System.out.println("No mirrored parts");
        }
    }
}