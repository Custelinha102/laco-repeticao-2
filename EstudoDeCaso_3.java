package lista_1;
import java.util.Scanner;
public class EstudoDeCaso_3 {

	public static void main(String[] args) {
		int dataNasc, anoAtual,idade, continuar;
		Scanner in = new Scanner(System.in);
		
		System.out.println("fale qual o ano atual");
		anoAtual = in.nextInt();
		
		System.out.println("agora diga a sua data de nascimento");
		dataNasc = in.nextInt();
		
		idade = anoAtual - dataNasc;
		System.out.println("voce tem " +idade+ " anos");
	}

}
