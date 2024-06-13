import java.util.regex.Pattern;

public class Senha {

	public static final int TAMANHO_MINIMO_SENHA = 10;
	public static final int TAMANHO_MAXIMO_SENHA = 30;
	private String conteudo;
	
	public Senha(String conteudo) {
		VerificaTamanhoSenha(conteudo);
	}
	
	public void VerificaTamanhoSenha(String conteudo) {
		if(conteudo.length() < TAMANHO_MINIMO_SENHA || conteudo.length() > TAMANHO_MAXIMO_SENHA) {
			throw new IllegalArgumentException("Tamanho da senha incorreto");
		}
		
		validarSenha(conteudo);
	}
	
	public void validarSenha(String conteudo) {
		String regex = "^(?=.*[0-9](?=.*[az])"
				+ "(?=.*[AZ](?=.*[@#$%^&-+=()])(?=\\S+$"
				+ ").{10,30}$"; 
		if(!Pattern.matches(regex, regex)) {
			throw new IllegalArgumentException("Formato incorreto de senha"
					+ "deve possuir letra maiscula, minuscula numero e caracter expecial");
		}
		setConteudo(conteudo);
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public String getConteudo() {
		return conteudo;
	}
}
