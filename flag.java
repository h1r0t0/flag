package track;
import java.util.Scanner;
import java.util.ArrayList;

class Flag{
  int red;
  int white;
  String[] s;

  Flag(String[] l){
    red = 0;
    white = 0;
    s = l;
  }

  boolean winner(Flag a){
    // simon : ture
    // alice : false 

    for(int i = 0; i < a.s.length; i++){
      if(a.s[i]=="RU"){
        red++;
      }
      if(a.s[i]=="RD"){
        red--;
      }
      if(a.s[i]=="WU"){
        white++;
      }
      if(a.s[i]=="WD"){
        white--;
      }

      if((red<0 || red>1)
        ||(white<0 || white>1)){
          return false;
        }
    }
    return true;
  }
}
