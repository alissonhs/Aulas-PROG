import java.util.Scanner;

public class EX005 {
	public EX005() {
		System.out.println("");
		System.out.println("*--- Iniciando exerc�cio 005 ---*");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero");
		int num2 = scan.nextInt();
		
		doAll(num1, num2);
		
		System.out.println("*--- ENCERRANDO ---*");
	}
	
	private void doAll(int n1, int n2) {
		
		if (n1 == n2) {
			System.out.println("Os n�meros s�o iguais.");
		} else {
			System.out.println("Os n�meros n�o s�o iguais.");
			int maior = 0;
			int menor = 0;
			if (n1 > n2) {
				maior = n1;
				menor = n2;
			} else {
				maior = n2;
				menor = n1;
			}
			System.out.println("O maior �: " + maior);
			System.out.println("O menor �: " + menor);
		}
		

	}
}