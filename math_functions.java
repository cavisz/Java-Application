package teste;
public class Teste {

    
    public static void main(String[] args) {
              
     // A = Math.sqrt(x);   variavel A recebe raiz quadarda de x
     // A = Math.pow(x,y);  variavel A recebe o resultado de x elevado a y
     // A = Math.abs(x);    variavel A recebe valor absoluto de x (sem valor negativo caso exista)
        
     double x = 3.0;
     double y = 4.0;
     double z = -5.0;
     double A, B, C;
     
      A = Math.sqrt(x);
      B = Math.sqrt(y);
      C = Math.sqrt(25.0);
      System.out.println("Raiz quadrada de " + x + " = " +A);
      System.out.println("Raiz quadrada de " + y + " = " +A);
      System.out.println("Raiz quadrada de 25 = " + C);
      
      A = Math.pow(x,y);
      B = Math.pow(x, 2.0);
      C = Math.pow(5.0, 2.0);
      System.out.println(x + " elevado a " + y + " = " + A);
      System.out.println(x + " elevado ao quadrado = " + B);
      System.out.println("5 elevado ao quadrado = " + C);
      
      A = Math.abs(y);
      B = Math.abs(z);
      System.out.println("valor absoluto de " + y + " = " + A);
      System.out.println("valor absoluto de " + y + " = " + B);       
        
    }
}
