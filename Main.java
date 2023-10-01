import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try{
		   
    	    System.out.println("Olá, qual é o seu nome?");                                   
    	    Scanner leia = new Scanner(System.in);
    	    String nome = leia.next();                                                                                          // variavel 'nome' criada para guarda o nome digitado pelo usuario
    	    
    	    System.out.println("Olá " + nome + ", prazer em conhece-lo, preciso que insira 2 valores a seguir para uma operação");  // Saudação 
    	    
    	    System.out.println("Digite o primeiro valor: ");                                                                    // pede ao usuario digitar o valor do primeiro numero
            double n1 = leia.nextInt();                                                                                         // n1 guarda o valor digitado pelo usuario
            
            System.out.println("Digite o segundo valor: ");                                                                     // pede ao usuario digitar o valor do primeiro numero
            double n2 = leia.nextInt();                                                                                         // n1 guarda o valor digitado pelo usuario
            
            //Opções para o usuario escolher	    
    	    System.out.println("Digite a opção da operação: ");
    	    System.out.println("Digite a opção da (1) Soma: ");
    	    System.out.println("Digite a opção da (2) Subtração: ");
    	    System.out.println("Digite a opção da (3) Divisão: ");
    	    System.out.println("Digite a opção da (4) Multiplicação: ");
    	    System.out.println("");
    	    
    	    // variavel 'opcao' vai guardar o valor digitado pelo usuario
    	    int opcao = leia.nextInt(); 
	    
	        // switch vai ler a opção digitada pelo usuario e fazer a operação desejada
    	    switch(opcao){
    	        case 1:
    	        System.out.println("O resultado da sua soma é: " + (n1 + n2));
    	        break;
    	        
    	        case 2:
    	        System.out.println("O resultado da sua subtração é: " + (n1 - n2));
    	        break;
    	        
    	        case 3:
    	        System.out.println("O resultado da sua divisão é: " + (n1 / n2));
    	        break;
    	        
    	        case 4:
    	        System.out.println("O resultado da sua multiplicação é: " + (n1 * n2));
    	        break;
    	        
    	        default:
    	        System.out.println("Opção invalida");
    	        break;
    	        
	        }
	       leia.close();
	    
	    }
	    // tratamento de erro caso o usuario digite qualquer outra coisa que não seja um número
		catch(Exception e) {
		    System.err.println("Você deve digitar somente números!");
		    //e.printStackTrace();
		}
	}
}
