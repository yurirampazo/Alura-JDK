
public class TesteCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		//em seguida atividade extra alura
		int idade1 = 68;
		boolean ehIdoso = idade1 >= 65;
		
		System.out.println("valor de acompanhado = " + acompanhado);
		if(idade >= 18 || acompanhado) {
			// || pipe pipe= condicional Or
			System.out.println("Seja bem vindo!");
			} else {
			System.out.println("Infelizmente você não pode entrar aqui!");
		if(idade >= 18 && acompanhado) {
			// && condicional And
			// Verificador booleano poderia ser escrito da seguinte forma:
			// if(idade >= 18 && acompanhado == true) {
			// == compara	
			System.out.println("Você é maior de idade e está, seja bem vindo!");
			} else {
			System.out.println("Infelizmente você não pode entrar aqui!");
		}
		}		
		System.out.println(ehIdoso);
		// mensagem recebida após o teste boolean= true
	}
}

 