
public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
			// contador ++; é apenas para operações com salto de 1 número
			// maneiras menos frequentes usadas para somar um valor "n" a um contador
			// contador = contador + 1, só que mais simples
		}
		System.out.println(contador);
	}
}
