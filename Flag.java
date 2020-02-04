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
      if(s[i]=="RU"){
        red++;
      }
      if(s[i]=="RD"){
        red--;
      }
      if(s[i]=="WU"){
        white++;
      }
      if(s[i]=="WD"){
        white--;
      }

      // status tracker
      System.out.print("Red: " + red + " / White: " + white);
      System.out.println();
      System.out.println(s[i]);

      // if Simon makes any mistake
      if((red<0 || red>1)
        ||(white<0 || white>1)){
          return false;
        }
    }
    return true;
  }

  void judge(boolean w){
    if(w == true){
      System.out.println("Simon");
    }
    else{
      System.out.println("Alice");
    }
  }
}
