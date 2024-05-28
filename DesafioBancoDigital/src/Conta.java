public abstract class Conta implements InterfaceConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int CONTAS_CRIADAS = 1;

    private int agencia;
    private int numeroConta;
    private double saldo;

    private Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.saldo = 0;
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = CONTAS_CRIADAS;
        CONTAS_CRIADAS++;
    }
    
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if(valor <= this.saldo){
            this.saldo -= valor;
        }else{
            throw new SaldoInsuficienteException("Valor do saque é maior que o saldo");
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, InterfaceConta contaDestinataria) {
        try {
            this.sacar(valor);
            contaDestinataria.depositar(valor);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    protected void imprimirInformacoes(){
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Numero da agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
    }
    public int getAgencia(){
        return agencia;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }
}