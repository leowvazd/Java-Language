package universidade;

public class Pessoa {

    protected String nome;
    protected String sobrenome;

    public Pessoa() {
    }

    public void setNomeSobrenome(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return nome + sobrenome + "@dominio.generico.com.br";
    }

    public String getVinculo() {
        return "Sem vínculo com a Faculdade";
    }
}
