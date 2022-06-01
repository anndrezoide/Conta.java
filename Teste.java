
package ContaHerdado;
public class Teste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.0);
        
        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);
        cc.transfere(10.0, cp);
        
        SeguroDeVida seguro = new SeguroDeVida();
        CalculadorDeImposto calc = new CalculadorDeImposto();
        
        calc.registro(cc);
        calc.registro(seguro);
        
        System.out.println("Valor Imposto CC: " + calc.getTotalImposto());
        
        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
        
        
    }
}
