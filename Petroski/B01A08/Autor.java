public class Autor {
    private String nome;
    private String email;
    private int idade;

    // construtor
    public Autor(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        if (this.idade >= 0)
            this.idade = idade;
        else {
            throw new IllegalArgumentException("Idade inválida!");
        }
    }

    

    public String toString() {
        // TODO Auto-generated method stub
        return "\nNome: " + getNome() + "\nEmail: " + getEmail() + "\nIdade: " + getIdade();
    }
}