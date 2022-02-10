import java.util.*;

public class Test {
    public static void main(String args[]){
        System.out.println("Hi");
        String str="The sum of the lengths of all the words do not exceed 10-6";
      String[] arr=  str.split(" ",-2);

      List<String> strlist=new ArrayList<String>();

      for(String a:arr){
          if(a.matches("^[A-Za-z-.?!,]+$")){
              strlist.add(a);
          }
      }
        System.out.println(strlist.size());
    }
}
