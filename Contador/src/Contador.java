import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		

		contar(parametroUm, parametroDois);
		
	}
	static void contar(int parametroUm, int parametroDois ){
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois){

			System.out.println( "O segundo parâmetro deve ser maior que o primeiro");
			Contador.main(null);

		}else{

			int contagem = parametroDois - parametroUm;

			for(int i = 0; i <= contagem; i++){
				System.out.println( "Imprimindo o número "+i );
			}

			Contador.main(null);

		}
		
	}
}