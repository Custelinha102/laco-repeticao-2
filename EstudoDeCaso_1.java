package lista_1;

public class EstudoDeCaso_1 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
			
			if (i % 10 == 0) {
				System.out.println("\nmultiplo de 10");
			}
		}
	}
}
