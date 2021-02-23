
public class TestaCondicionais {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 25;
		int quantidadePessoas = 3;
		if(idade >= 18 || quantidadePessoas >=2) {
			System.out.println("Você tem mais de 18 anos!");
			// Se for verdadeiro receberá essa mensagem!
			//Usar as chaves mesmo se não tiver condicional negativa!
			//Mesmo só tendo uma linha!
		}else {
			if(quantidadePessoas >=2) {
				System.out.println("Você não é maior de idade,"
						+ " mas pode entrar por estar acompanhado!");
			} else {
			System.out.println("Infelizmente você não pode entrar aqui!");
		
			}
		}		
	}
}
