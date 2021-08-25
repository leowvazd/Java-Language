package universidade;

public class Aluno extends Pessoa {
    public Aluno() {
        super();
    }

    @Override
    public String getEmail() {
        return nome + sobrenome + "@aluno.faculdade.edu.br";
    }

    @Override
    public String getVinculo() {
        return "Aluno da Faculdade";
    }
}
