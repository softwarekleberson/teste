public class Main {
public static void main(String[] args) {
	
	Senha senha = new Senha("897245VAIsantos1@");
	
	
	ForcaSenha validar = new ForcaSenha();
	validar.ValidarForcaSenha(senha);
	}
}
