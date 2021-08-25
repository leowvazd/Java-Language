/* 
Exercício de programação orientada a objetos. Implementação de uma classe Porta, utilizando os conceitos de modificadores de acesso e métodos 
modificadores.

Tarefa
Para esse exercício, queremos uma classe que represente uma porta da vida real, que pode ser aberta ou fechada. O objeto poderá ser instanciado
diversas vezes.

Cada instância de porta pode ser aberta ou fechada, e deve ter um atributo interno que mantenha registro do estado da porta. O utilizador deve 
ser capaz de atribuir um nome para a porta, obter o nome da porta, obter o estado da porta (se está aberta ou não), abrir a porta e fechar a porta.

Porta
- aberta : boolean = true
- nome : String = "Porta sem nome"
+ setNome(nome: String)
+ getNome() : String
+ estaAberta() : boolean
+ abrir() : int
+ fechar() : int

Crie a classe pública Porta em um arquivo contendo apenas a implementação da classe (nomeie o arquivo como <Porta.java> para a submissão).

Importante: O programa principal já existe no sistema de correção automática. Submeta apenas a classe Porta. A classe Porta não pode realizar 
impressão de dados ou utilizar import.

O estado da porta e o seu nome não podem ser modificados diretamente, portanto devem ser variáveis privadas. Espera-se o seguinte comportamento 
das funções:

setNome(nome : String)
Recebe um novo nome para a porta e salva internamente
getNome(): String
Retorna o nome da porta
estaAberta(): boolean
retorna verdadeiro caso a porta esteja aberta, e retorna falso caso esteja fechada
abrir(): int
altera o estado da porta se estiver fechada, retornando 0 para indicar sucesso. Caso a porta esteja aberta, não altera o estado e retorna 1
fechar(): int
análogo ao método anterior, sendo bem sucedida se a porta estiver aberta
Exemplo de uso da classe
    Porta portaSala = new Porta();
    portaSala.setNome("Porta da sala");

    Porta portaCozinha = new Porta();
    portaCozinha.setNome("Porta da cozinha");

    if (portaSala.estaAberta()) {
        portaCozinha.fechar();
    }
*/  

public class Porta  {
    
    private boolean aberta = true;
    private String nome = "Porta sem nome";
    
    public void setNome(String nome)  {
        this.nome = nome;
    }
    
    public String getNome()  {
       return this.nome;
    }
    
    public boolean estaAberta() {
        return this.aberta;
    }
    
    public int abrir() {
		if (aberta != true) {
			aberta = true;
			return 0;
		}
		
		else {
			return 1;
		}
	}

	public int fechar() {
		if(aberta != false){
			aberta = false;
			return 0;
		}
		
		else {
			return 1;
		}
	}
}