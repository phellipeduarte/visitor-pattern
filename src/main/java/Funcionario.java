public class Funcionario implements Pessoa{

    private String nome;
    private String posicao;
    private Setor setor;

    public Funcionario(String nome, String posicao, Setor setor) {
        this.nome = nome;
        this.posicao = posicao;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirFuncionario(this);
    }
}
