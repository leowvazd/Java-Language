package multimidia;

public class ArquivoVideo extends ArquivoMultimidia{
    
    String nomeArquivo;
    int largura, altura;
    
    //construtor
    public ArquivoVideo (String nomeArquivo, int largura, int altura) {
        super(nomeArquivo);
        this.nomeArquivo = nomeArquivo; 
        this.altura = altura;
        this.largura = largura;
    }
    
    @Override
    public String toString(){
            return ("Video: " + this.nomeArquivo + " (" + this.largura + " x " + this.altura + ")");
    }
    
}