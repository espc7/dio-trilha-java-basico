package list.operacoesBasicas;

public class Tarefa {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
}
