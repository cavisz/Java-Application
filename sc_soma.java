package teste;
import java.util.Scanner;
public class Teste {

    
    public static void main(String[] args) {
        
     int x1, x2, resultado;
     
        Scanner sc = new Scanner(System.in);
        
      x1 = sc.nextInt();
      x2 = sc.nextInt();
      
      resultado = x1 + x2;
     
      System.out.println("SOMA = " + resultado);
          
       sc.close();    
    }
}
