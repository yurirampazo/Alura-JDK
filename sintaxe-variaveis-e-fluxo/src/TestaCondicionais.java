
public class TestaCondicionais {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 25;
		int quantidadePessoas = 3;
		if(idade >= 18 || quantidadePessoas >=2) {
			System.out.println("Voc� tem mais de 18 anos!");
			// Se for verdadeiro receber� essa mensagem!
			//Usar as chaves mesmo se n�o tiver condicional negativa!
			//Mesmo s� tendo uma linha!
		}else {
			if(quantidadePessoas >=2) {
				System.out.println("Voc� n�o � maior de idade,"
						+ " mas pode entrar por estar acompanhado!");
			} else {
			System.out.println("Infelizmente voc� n�o pode entrar aqui!");
		
			}
		}		
	}
}
