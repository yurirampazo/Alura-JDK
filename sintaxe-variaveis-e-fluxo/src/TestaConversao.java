
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1250.70;
		int valor = (int) salario;
		System.out.println(valor);
		System.out.println(salario);

		int valorTeste1 = 30;
		double valorTeste2 = valorTeste1;
		System.out.println(valorTeste1);
		System.out.println(valorTeste2);

		long numeroGrande = 34569745464545L;
		System.out.println(numeroGrande);
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		float pontoFlutuante0 = (float) 3.1415;
		System.out.println(pontoFlutuante0);
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);

		double valorExemplo = 2.5;
		int valorExemplo2 = (int) valorExemplo;
		System.out.println(valorExemplo);
		System.out.println(valorExemplo2);
	}
}
