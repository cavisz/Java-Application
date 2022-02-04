package teste;
import java.util.Locale;
import java.util.Locale;
import java.util.Scanner;
public class Teste {

    
    public static void main(String[] args) {
              
      Scanner sc = new Scanner(System.in)  ;
        
      double x;
      x = sc.nextDouble();
      
      Locale.setDefault(Locale.US);
      System.out.printf("digitou: %.2f%n", x);
      
      sc.close();
    }
}
