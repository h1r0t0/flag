//package track;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class App {    
      public static void main(String[] args) {
            Flag f = new Flag();
            FileReader fr = null;
            try{
                  fr = new FileReader();
            }
            catch(Exception e){
                  Systme.out.println("FileNotFound");
            }
            String[] lines = getStdin();
            for (int i = 0, l = lines.length; i < l; i++) {
                    //String output = String.format("line[%s]: %s", i, lines[i]);
                    String output = String.format("%s", lines[i]);
                    System.out.println(output);
            }
            //System.out.println("Num of elements: " + i);
            f.judge(f.winner(lines));
      }

      private static String[] getStdin() {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> lines = new ArrayList<>();
            while (scanner.hasNext()) {
                 lines.add(scanner.nextLine());
                 if(lines.contains("exit")) break;
            }
            lines.remove("exit");
            scanner.close();
            return lines.toArray(new String[lines.size()]);
      }
}
