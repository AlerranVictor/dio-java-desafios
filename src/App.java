
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente alerran = new Cliente("Alerran Sousa");

        ContaCorrente cc = new ContaCorrente(alerran);
        ContaPoupanca cp = new ContaPoupanca(alerran);

        List<Conta> contas = Arrays.asList(cc, cp);

        Banco bancoStd = new Banco("Santander");
        bancoStd.setContas(contas);

        cc.depositar(234);
        cc.transferir(cp, 233);

        cc.extrato();
        cp.extrato();

        System.out.println(bancoStd.getContas());
    }
}
