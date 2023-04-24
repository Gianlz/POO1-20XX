package lista7.Exec7;

public class Exec7 {
    private String nome;
    private int idade;
    private float peso, altura;

    Exec7(String nome, int idade, float peso, float altura) {
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
    }

    public void envelhecer() {
        idade++;
        if (idade < 21) {
            crescer();
        }
    }

    public void engordar() {
        peso++;
    }

    public void emagrecer() {
        if (peso > 1) {
            peso--;
        }
    }

    public void crescer() {
        altura += 0.05f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().length() > 0) {
            this.nome = nome.trim();
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
    }

}