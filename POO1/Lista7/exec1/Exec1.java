package lista7.exec1;

public class Exec1 {

    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Exec1(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("nome = ");
        builder.append(nome);
        builder.append(", sobrenome = ");
        builder.append(sobrenome);
        builder.append("]");
        return builder.toString();
    }

    public String nomeCompleto()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(nome);
        builder.append(" ");
        builder.append(sobrenome);
        return builder.toString();
    }
}
