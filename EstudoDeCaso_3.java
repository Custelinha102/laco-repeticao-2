package areaDeTeste;
import java.util.Scanner;
public class EstudoDeCaso_3 {

	public static void main(String[] args) {
		
		int dataNasc, anoAtual,idade, continuar;
		Scanner in = new Scanner(System.in);
		
		do { System.out.println("digite 1 para continuar ou 0(zero) para sair"); 
			continuar = in.nextInt();
			if (continuar == 1 ) {
			
			
			
			System.out.println("fale qual o ano atual");
		
		anoAtual = in.nextInt();
		
		System.out.println("agora diga o ano da sua data de nascimento");
		dataNasc = in.nextInt();
		
		idade = anoAtual - dataNasc;
		System.out.println("voce tem " +idade+ " anos");
			}else if (continuar==0) {
				System.out.println("programa encerrado");
			}
		} while (continuar !=0);
			
		in.close();
	}

}
