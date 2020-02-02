package track;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
      
      public static void main(String[] args) {
            String[] lines = getStdin();
            for (int i = 0, l = lines.length; i < l; i++) {
                    //String output = String.format("line[%s]: %s", i, lines[i]);
                    String output = String.format("Hello %s!", lines[i]);
                    System.out.println(output);
            }
      }

      private static String[] getStdin() {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> lines = new ArrayList<>();
            while (scanner.hasNext()) {
                 lines.add(scanner.nextLine());
            }
            return lines.toArray(new String[lines.size()]);
      }
}
