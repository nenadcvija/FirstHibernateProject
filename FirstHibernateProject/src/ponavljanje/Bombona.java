package ponavljanje;

public class Bombona extends Slatkisi implements KonditorskiProizvod{

	@Override
	public void otvoriSlatkis() {
		System.out.println("Otvaram bombonu");
		
	}

	@Override
	public void barCode() {
		
		System.out.println("Bombona barcode je sredjen");
	}

	@Override
	public String getIme() {
		return this.ime;
	}

	@Override
	public int getGramaza() {
		return this.gramaza;
	}
	
	
	

}
