
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		// boolean acompanhado = quantidadePessoas >= 2;

		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar aqui!");
			if (idade >= 18 && acompanhado) {
				System.out.println("Voc� � maior de idade e est�, seja bem vindo!");
			} else {
				System.out.println("Infelizmente voc� n�o pode entrar aqui!");
			}
		}
	}
}
