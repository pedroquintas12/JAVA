
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		
		Administrado adm = new Administrado();
		adm.setSenha(3333);
	
		Cliente cliente = new Cliente();
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
		
		
	}
	
}
