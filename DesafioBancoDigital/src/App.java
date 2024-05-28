public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaPoupanca(new Cliente("Cliente A"));
        Conta cp = new ContaPoupanca(new Cliente("Cliente B"));
        Banco banco = new Banco("Banco");

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(10);
        cc.transferir(10, cp);

        banco.imprimirContas();
    }
}
