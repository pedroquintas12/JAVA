package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TestesContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		
		cc.transfere(10.0, cp);
		
		System.out.println("saldo conta corrente"+ cc.getSaldo());
		System.out.println("saldo conta poupan�a" + cp.getSaldo());
		
		
	}
	                  
}
