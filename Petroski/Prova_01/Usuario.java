//================================================================

// Sumário
// 1. Classe Usuario que exetende (herda) a classe pessoa
// 2. Atributos 
// 3. Construtor 
// 4. setUsername
// 5. setPassword
// 6. Getters
// 7. Login
// 8. toString

//===================================================================

public class Usuario extends Pessoa {
    protected String username;
    protected String password;

    public Usuario(String nome, String doc, Data data_nasc, String username, String password) {
        super(nome, doc, data_nasc);
        this.setUsername(username);
        this.setPassword(password);
    }

    public void setUsername(String username) {
        // if (this.username == username) {
        this.username = username;
        // }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    void login(String password) {
        if (password == this.password) {
            this.password = password;
            System.out.println("Logado com sucesso!");
        } else {
            System.out.println("Senha inválida!");
        }
    }

    public String toString() {
        String dados_user;
        dados_user = super.toString() + "\nUsername: " + getUsername() + "Senha: ******"; // +getSenha();
        return dados_user;
    }
}
