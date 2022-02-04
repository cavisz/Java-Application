package teste;
import java.util.Locale;
import java.util.Scanner;
public class Teste {

    
    public static void main(String[] args) {
              
      Scanner sc = new Scanner(System.in)  ;
        
      String x;
      int y;
      double z;
      
      x = sc.next();
      y = sc.nextInt();
      z = sc.nextDouble();
      
      Locale.setDefault(Locale.US);
      System.out.println("digitou: ");
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);
      
      
      sc.close();
    }
}
