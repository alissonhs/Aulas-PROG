import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o exerc�cio que quer abrir:");
		System.out.println("01 - Este software exibe a pessoa mais velha e a mais nova!");
		System.out.println("02 - Este software exibe o maior n�mero digitado!");
		System.out.println("03 - Este software exibe uma lista descrescente a partir do n�mero digitado!");
		System.out.println("04 - Este software exibe a soma dos n�meros impares de 0~30 e a multiplica��o dos pares de 0~30");
		System.out.println("05 - Este software exibe se os n�meros s�o iguais ou n�o!");
		System.out.println("06 - Este software exibe o pre�o de venda de um produto!");
		
		
		int exerciseNumber = scan.nextInt();
		System.out.println("");
		switch (exerciseNumber) {
			case 1: EX001 exercicio1 = new EX001();
				break;
		
			case 2: EX002 exercicio2 = new EX002();
				break;

			case 3: EX003 exercicio3 = new EX003();
				break;

			case 4: EX004 exercicio4 = new EX004();
				break;
				
			case 5: EX005 exercicio5 = new EX005();
				break;

			case 6: EX006 exercicio6 = new EX006();
				break;							
				
		
			default: System.out.println("Exerc�cio inv�lido!");
				break;
			
		}
		
	}
	
}