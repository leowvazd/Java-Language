/*

public TextoData(int dia, int mes, int ano): construtor que instancia um plugin e armazena a data (dia, mês e ano).
public String aplicar(String texto): adiciona a data ao final do texto no formato " (DATA: %d/%d/%d)", em que cada um dos inteiros %d são respectivamente dia, mês e ano. Por exemplo, para o texto "Este eh um teste." e data 10/10/1000, o retorno do método aplicar seria "Este eh um teste. (DATA: 10/10/1000)".


*/
package relatorio;

public class TextoData implements PluginTexto{

    public int dia, mes, ano;
 
    public TextoData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String aplicar(String texto){
        return texto + " (DATA: " + dia + "/" + mes + "/" + ano + ")";
    }
}