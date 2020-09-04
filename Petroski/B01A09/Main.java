public class Main {
    public static void main(String args[]){
        Conta Conta = new Conta("Fulano", 15, 500);
        Conta.toString();
        
        ContaCorrente corrente = new ContaCorrente(500, "Ciclano", 25, 30, 1000.0);
        corrente.toString();
        corrente.depositar(100.0);
        corrente.toString();
        corrente.sacar(2000.0);
        corrente.toString();
        corrente.sacar(1150.0);
        corrente.toString();

        Poupanca poupanca = new Poupanca(null, 0.20, "Beltrano", 40, 55);
        poupanca.toString();
        poupanca.depositar(500.0, "30/09/2019");
        poupanca.toString();
        poupanca.adicionaRendimento(0.30);
        poupanca.toString();
        poupanca.depositar(100.0);
        poupanca.toString();
    }
}

