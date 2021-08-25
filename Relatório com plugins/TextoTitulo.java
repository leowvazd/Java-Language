/*

Classe TextoTitulo: implementação de PluginTexto que adiciona um título ao texto do relatório.

public TextoTitulo(String titulo): construtor que instancia um plugin e armazena um título na instância de TextoTitulo.
public String aplicar(String texto): adiciona um título no início do texto no formato: "(TITULO: %s>) ", em que %s é o título do relatório (observe que não há acento). Por exemplo, para o texto "Este eh um teste." e título "Relatorio1", o retorno do método aplicar seria "(TITULO: Relatorio1) Este eh um teste."

*/
package relatorio;


public class TextoTitulo implements PluginTexto {
    
    public String titulo;
    
    public TextoTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String aplicar(String texto){
        return "(TITULO: " + titulo + ") " + texto; 
    }
}