public class Funcionario {
    private long id;
    private String nome;
    private int idade;
    private boolean estado_civil;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public boolean isEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(boolean estado_civil) {
        this.estado_civil = estado_civil;
    }
}
