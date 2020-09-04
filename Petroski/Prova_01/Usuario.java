//================================================================

// Sumário
// 1. Classe Usuario que exetende (herda) a classe pessoa
// 2. Atributos 
// 3. Construtor 
// 4. setUsername
// 5. setPassword
// 6. Getters
// 7. toString

//===================================================================

public class Usuario extends Pessoa {
    private String username;
    private String password;

    public Usuario(String nome, String doc, Data data_nasc, String username, String password) {
        tsuper(nome, doc, data_nasc);
        this.setUsername(username);
        this.setPassword(password);
    }

    public void setUsername(String username) {
        // if (this.username == username) {
        this.username = username;
        // }
    }

    public void setPassword(String password) {
        if (password == this.password) {
            this.password = password;
            System.out.println("Logado com sucesso!");
        }else{
            System.out.println("Senha inválida!");
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String toString(){
        String dados_user;
        dados_user = super.toString+"\nUsername: "+getUsername()+ "Senha: ******"; //+getSenha();
        return dados_user;
    }
}
