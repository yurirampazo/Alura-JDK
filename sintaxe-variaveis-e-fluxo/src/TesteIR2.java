
public class TesteIR2 {
	public static void main(String[] args) {
		double salario = 3300.0;

		// ifs aqui
		if (salario <= 1903.98) {
			System.out.println("O contribuinte est� insento de dedu��o do IR!");

		} else if (salario >= 1903.99 && salario <= 2826.65) {
			System.out.println("A sua aliquota � de 7,5%");
			System.out.println("Voc� pode deduzir at� R$ 142,80");

		} else if (salario >= 2826.66 && salario <= 3751.05) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� R$ 354,80");

		} else if (salario >= 3751.06 && salario <= 4664.68) {
			System.out.println("A sua aliquota � de 22,5%");
			System.out.println("Voc� pode deduzir at� R$ 636,13");

		} else if (salario >= 4664.69) {
			System.out.println("A sua aliquota � de 27,5%");
			System.out.println("Voc� pode deduzir at� R$ 869,36");
		}
	}
}
