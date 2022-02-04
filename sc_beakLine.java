package teste;
import java.util.Scanner;
public class Teste {

    
    public static void main(String[] args) {
              
      Scanner sc = new Scanner(System.in)  ;
        
      String s1, s2, s3;
      
      s1 = sc.nextLine();
      s2 = sc.nextLine();
      s3 = sc.nextLine();
      
         //nextLine(); limpa buffer de leitura 
        
      System.out.println("digitou: ");
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      
      
      sc.close();
    }
}
