//================================================================

// Sumário
// 1. Classe Professor que extende a classe Usuário
// 2. Construtor 
// 3. setFormação
// 4. setDepartamento
// 5. Getters
// 6. Editar
//  6.1 Editar apenas a formação
//  6.2 Editar formação e departamento
// 7. Login
// 8. toString 

//===================================================================

public class Professor extends Usuario {
    private String formacao;
    private String departamento;

    public Professor(String formacao, String departamento, String username, String password, String nome, String doc, Data data_nasc) {
        super(nome, doc, data_nasc,username, password);
        this.setFormacao(formacao);
        this.setDepartamento(departamento);
    }

    public void setFormacao(String formacao) {
        if (formacao == "G" || formacao == "M" || formacao == "D") {
            this.formacao = formacao;
            if(formacao == "G"){
                System.out.println("Graduação ");
            }
            if(formacao == "M"){
                System.out.println("Mestrado ");
            }
            if(formacao == "D"){
                System.out.println("Doutorado ");
            }
        }else{
            System.out.println("Formação desconhecida!");
        }
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    void Editar(String formacao){
        this.formacao = formacao;
    }

    void Editar(String formacao, String departamento){
        this.formacao = formacao;
        this.departamento = departamento;
    }
    void login(String password) {
        if (password == this.password) {
            this.password = password;
            System.out.println("Usuário logado no Professor Online");
        }
    }

    public String toString(){
        String dados_prof;
        dados_prof = super.toString()+"\nFormação: "+getFormacao()+ "\nDepartamento: "+getDepartamento();
        return dados_prof;
    }

}
