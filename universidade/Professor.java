package universidade;

public class Professor extends Pessoa {
    public Professor() {
        super();
    }

    @Override
    public String getEmail() {
        return nome + sobrenome + "@faculdade.edu.br";
    }

    @Override
    public String getVinculo() {
        return "Professor da Faculdade";
    }
}
