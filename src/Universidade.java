public class Universidade {
    private String instituicao;

    public Universidade(String nome) {
        this.instituicao = nome;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String nome) {
        this.instituicao = nome;
    }

    @Override
    public String toString() {
        return instituicao;
    }
}

