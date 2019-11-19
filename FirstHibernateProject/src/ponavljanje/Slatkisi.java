package ponavljanje;

public abstract class Slatkisi {
	
	public String ime;
	public int gramaza;
	
	public void jedi() {
		System.out.println("Ja volim da jedem slatkise!");
	}
	
	public abstract void otvoriSlatkis();

}
