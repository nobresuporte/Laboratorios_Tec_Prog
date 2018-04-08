public class Main{


  public static void main (String args[]) {
	Sistema s = new Sistema();
	s.criarContaXPTOBasic(1);
	s.criarContaXPTOPlus(2);
	s.criarContaXPTOExtreme(3);
	
	for(int i = 1; i<=3; i++) s.creditar(i,1000);
	
	for(int i = 1; i<=3; i++) s.debitar(i,10);
	
	//todas as igualdades devem ser verdadeiras
	System.out.println(s.consultarSaldo(1) == 990);
	System.out.println(s.consultarSaldo(2) == 995 );
	System.out.println(s.consultarSaldo(3) == 992.02);
	
	System.out.println(s.consultarSaldo(1));
	System.out.println(s.consultarSaldo(2));
	System.out.println(s.consultarSaldo(3));
	

	s.toString(1);
	s.toString(2);
	s.toString(3);


  }
}