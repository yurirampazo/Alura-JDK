
public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
			// contador ++; � apenas para opera��es com salto de 1 n�mero
			// maneiras menos frequentes usadas para somar um valor "n" a um contador
			// contador = contador + 1, s� que mais simples
		}
		System.out.println(contador);
	}
}
