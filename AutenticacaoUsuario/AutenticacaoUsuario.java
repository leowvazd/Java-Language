
import java.util.Scanner;
import acesso.Usuario;
import acesso.Impressao;
import acesso.UsuarioBloqueado;
import acesso.SenhaInvalida;

public class AutenticacaoUsuario {

	public static void main(String[] args) throws SenhaInvalida, UsuarioBloqueado {
		
		int n = leNumero();
		
		Usuario[] usuarios = criaParesLogin(n);
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getLogin());
		}
		
		int k = leNumero();
		
		//Usuarios para autenticar
		Usuario[] usuariosAut = new Usuario[k];
		
		
		for (int i = 0; i < usuariosAut.length; i++) {
			usuariosAut[i] = usuarios[i];
		}
		
		for(Usuario u : usuariosAut) {
			u.autenticar(leTexto());
		}
	}
	
	private static int leNumero() {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		if(n.equals(null)) {
			scanner.close();
		}
		return n;
	}
	
	private static Usuario[] criaParesLogin(int n) {
		Usuario[] usuarios = new Usuario[n];
		
		for (int i = 0; i < n; i++) {
			String par = leTexto();
			String[] sequencia = par.split(" ");
			usuarios[i] = new Usuario(sequencia[0], sequencia[1]);
		}
		
		return usuarios;
	}
	
	private static String leTexto() {
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();
		if(texto.equals(null)) {
			scanner.close();
		}
		return texto;
	}

}


