public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente); //ao chamar 'super', se está referenciando a classe pai
    }

    public void extrato(){
        System.out.println("== Extrato da conta corrente ==");
        super.imprimirInfosComuns();
    }

}
