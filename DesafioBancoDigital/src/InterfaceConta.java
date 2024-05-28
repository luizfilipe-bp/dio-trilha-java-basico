public interface InterfaceConta {
    public void sacar(double valor) throws SaldoInsuficienteException;
    public void depositar(double valor);
    public void transferir(double valor, InterfaceConta contaDestinataria);
    public void imprimirExtrato();
}
