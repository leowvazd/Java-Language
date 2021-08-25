package multimidia;

public class ArquivoAudio extends ArquivoMultimidia {
    
    String nomeArquivo;
    boolean audioHD;
    
    //construtor
    public ArquivoAudio (String nomeArquivo, boolean audioHD) {
        super(nomeArquivo);
        this.nomeArquivo = nomeArquivo;
        this.audioHD = audioHD;
    }
    
    @Override
    public String toString(){
            return "Audio: " + this.nomeArquivo + " (HD = " + this.audioHD + ")";
    }
    
}