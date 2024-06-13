public class Main {
public static void main(String[] args) {
	
	Senha senha = new Senha("111111111111111111111111111111");
	ForcaSenha validar = new ForcaSenha();
	validar.ValidarForcaSenha(senha);
	}
}
