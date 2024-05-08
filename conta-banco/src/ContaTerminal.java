public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCLiente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCLiente;
        this.saldo = saldo;
    }

    public void exibirInformacoes(){
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

}
