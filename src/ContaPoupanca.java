public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente); //ao chamar 'super', se está referenciando a classe pai
    }

    public void extrato(){
        System.out.println("== Extrato da conta poupança ==");
        super.imprimirInfosComuns();
    }
}
