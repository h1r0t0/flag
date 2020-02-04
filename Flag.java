// package track;
import java.util.Scanner;
import java.util.ArrayList;

public class Flag{
  int red;
  int white;
  //String[] s;

  Flag(){
    red = 0;
    white = 0;
  }

  boolean winner(String[] s){
    // simon : true
    // alice : false 

    for(int i = 0; i < s.length; i++){
      if(s[i].equals("RU")){
        red++;
      }
      if(s[i].equals("RD")){
        red--;
      }
      if(s[i].equals("WU")){
        white++;
      }
      if(s[i].equals("WD")){
        white--;
      }

      // status tracker
      System.out.print("Red: " + red + " / White: " + white);
      System.out.println();
      System.out.print("s[" + i + "]: " + s[i] + " ");
      System.out.println("/ Length: " + s.length);
      System.out.println();

      // if Simon makes any mistake
      if((red<0 || red>1)
        ||(white<0 || white>1)){
          return false;
        }
    }
    // below Simon is the winner
    // fun() 
    // parse red and white
    return true;
  }

  // fun(int red, int white){
  //   String r = red.parseSting
  //   char x =r.charAt(1);
    
  //   String w = whte.parseSting
  //   char y =w.charAt(1);
  // }

  void judge(boolean w){
    if(w == true){
      System.out.println("Simon");
      // System.out.pritnln(fun());
    }
    else{
      System.out.println("Alice");
    }
  }
}
