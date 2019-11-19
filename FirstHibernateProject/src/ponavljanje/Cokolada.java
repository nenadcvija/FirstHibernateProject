package ponavljanje;

public class Cokolada extends Slatkisi implements KonditorskiProizvod {
	
	@Override
	public void jedi() {
		System.out.println("Ja volim cokoladu");
	}

	@Override
	public void otvoriSlatkis() {
		System.out.println("Otvaram cokoladu");
		
	}

	@Override
	public void barCode() {
		System.out.println("Cokoladda barcode formiran!");
		
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
