package teste;
import java.util.Scanner;
import java.util.Locale;

public class Teste {

    
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int numero;
                double hora, valor, salario;
	    
	    numero = sc.nextInt();
            hora = sc.nextDouble();
            valor = sc.nextDouble();
            
            salario =  hora * valor;

	   
             Locale.setDefault(Locale.US);
	    System.out.println("Numero:"+ numero);
            System.out.printf("Salário: %.2f%n", salario);

		sc.close();
	}
}
