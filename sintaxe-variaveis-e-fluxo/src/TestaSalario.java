
public class TestaSalario {
	public static void main(String[] args) {

        boolean foiPromovido = true;

        if(foiPromovido) {
            double salario = 4200.0;
        } else {
            double salario = 3800.0;
        }
     System.out.println(salario);
    }

}
//Código não compila, variavel salário foi declarada dentro do loop if e else apenas,
//Fora do bloco ela não foi declarada!!!