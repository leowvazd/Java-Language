/*


public ImpressaoSimples(): essa classe deve possuir apenas o construtor sem parâmetros (esse construtor é implicitamente criado se nenhum outro construtor for implementado na classe).
void imprimir(Relatorio r): faz uma impressão simples, ou seja, apenas chama o método imprimirLinha com o texto do relatório.
*/
package relatorio;

public class ImpressaoSimples implements PluginImpressao {
	
	public ImpressaoSimples() {}

	@Override
	public void imprimir(Relatorio r) {
	    Impressao.imprimirLinha(r.getTexto());	
	}

	
}
