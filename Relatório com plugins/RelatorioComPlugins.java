/*
public RelatorioComPlugins(String autor): construtor que armazena o texto passado no parâmetro texto.
public void aplicarPluginTexto(PluginTexto plugin): aplica o plugin de processamento sobre o texto armazenado na instância de RelatorioComPlugins e substitui o texto armazenado pelo obtido após a aplicação do plugin.
public void setPluginImpressao(PluginImpressao p) : armazena uma referência a uma instância de um plugin de impressão. Essa instância será usada posteriormente pelo método imprimirRelatorio.
public void imprimirRelatorio(): imprime o texto armazenado na instância de RelatorioComPlugins usando o plugin de impressão especificado por setPluginImpressao.
*/
package relatorio;

public class RelatorioComPlugins extends Relatorio{
    
    private String texto;
    private PluginImpressao pImp;

    public RelatorioComPlugins(String autor){
        super(autor);
    }
    
    public void aplicarPluginTexto(PluginTexto plugin){
        super.setTexto(plugin.aplicar(getTexto()));
        
    }
    public void setPluginImpressao(PluginImpressao p){
        this.pImp =  p;
    }
    
    @Override
    public void imprimirRelatorio(){
        pImp.imprimir(this);
    }
    
}