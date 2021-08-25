import java.util.Scanner;
import acesso.Usuario;
import acesso.Impressao;
import acesso.UsuarioBloqueado;
import acesso.SenhaInvalida;

public class AutenticacaoUsuario {
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	Impressao imp = new Impressao();
		
		int totalUsuario = scan.nextInt();
		Usuario[] users = new Usuario[totalUsuario];
		
		String[] Usuario = new String[totalUsuario];
		String[] Senha = new String[totalUsuario];
		
		for(int i = 0; i < Usuario.length; i++) {
			Usuario[i] = scan.next();
			Senha[i] = scan.next();
			users[i] = new Usuario(Usuario[i], Senha[i]);
		}
		
		int tentativasAuth = scan.nextInt();
		String[] UsuarioAuth = new String[tentativasAuth];
		String[] SenhaAuth = new String[tentativasAuth];
		
		for(int i = 0; i < UsuarioAuth.length; i++) {
			UsuarioAuth[i] = scan.next();
			SenhaAuth[i] = scan.next();
			for(int j = 0; j < users.length; j++) {
				if(UsuarioAuth[i].equals(users[j].getLogin())) {
					try {
						users[j].autenticar(SenhaAuth[i]);
						imp.imprimirUsuarioAutenticado(users[j].getLogin());
					} catch(SenhaInvalida e) {
						Impressao.imprimirSenhaInvalida(e.getLogin());
					} catch(UsuarioBloqueado e) {
					    Impressao.imprimirUsuarioBloqueado(e.getLogin());
					} 
				}
			}
		}
		
		scan.close();
	}
}
