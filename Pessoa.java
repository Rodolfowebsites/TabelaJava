@Tabela(nome = "Pessoa")
public class Pessoa {
    @Coluna(nome = "id")
    private int id;

    @Coluna(nome = "nome")
    private String nome;

    @Coluna(nome = "idade")
    private int idade;

    // Construtor, Getters e Setters
    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
