import java.util.Scanner;
import java.util.StringJoiner;

class InitCap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        boolean flag = true;

        System.out.println("Enter the String:");
        string = scanner.nextLine();
        
        String message = "everyone loves java";

         char[] charArray = message.toCharArray();
         boolean foundSpace = true;

          for(int i = 0; i < charArray.length; i++) {

          if(Character.isLetter(charArray[i])) {
 
          if(foundSpace) {
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
            }
          }

         else {
         foundSpace = true;
          }
         }
    
        message = String.valueOf(charArray);
        System.out.println("Message: " + message);
    }
}
