package multimidia;

public abstract class ArquivoMultimidia {
    private String nomeArquivo;

    public ArquivoMultimidia(String nomeArquivo) {
        setNomeArquivo(nomeArquivo);
    }
    
    public final String getNomeArquivo() {
        return this.nomeArquivo;
        
    }
    public final void setNomeArquivo(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }
}