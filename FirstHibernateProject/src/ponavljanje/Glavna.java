package ponavljanje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		/*
		 * Cokolada cokolada = new Cokolada(); cokolada.jedi(); cokolada.barCode();
		 * 
		 * Slatkisi s = new Cokolada(); s.jedi(); s.otvoriSlatkis();
		 * 
		 * KonditorskiProizvod k = new Cokolada(); k.barCode(); KonditorskiProizvod k1 =
		 * new Bombona(); k1.barCode();
		 * 
		 * List <KonditorskiProizvod>lista = new LinkedList<KonditorskiProizvod>();
		 * lista.add(cokolada); lista.add(k); lista.add(k1);
		 * 
		 * System.out.println("Klasican for Barkodovi proizvoda............. ");
		 * 
		 * for(int i = 0; i<lista.size();i++) { KonditorskiProizvod kond = lista.get(i);
		 * kond.barCode(); }
		 * 
		 * //drugi prolaz kroz listu
		 * 
		 * System.out.println("ForEach prolaz kroz listu..........");
		 * 
		 * for(KonditorskiProizvod kond : lista) { kond.barCode(); }
		 * 
		 * System.out.println("Iterator priolaz kroz listu............"); Iterator iter
		 * = lista.iterator();
		 * 
		 * while(iter.hasNext()) { KonditorskiProizvod kond =
		 * (KonditorskiProizvod)iter.next(); kond.barCode(); }
		 */
		
		Cokolada a = new Cokolada();
		a.ime = "Milka";
		a.gramaza = 300;
		
		Cokolada b = new Cokolada();
		b.ime = "Najlepse zelje";
		b.gramaza = 280;
		
		Bombona c = new Bombona();
		c.ime = "Haribo";
		c.gramaza = 500;
		
		List<KonditorskiProizvod> proizvodi = new ArrayList<KonditorskiProizvod>();
		proizvodi.add(a);
		proizvodi.add(b);
		proizvodi.add(c);
		
		

		System.out.println("Unesite ime proizvoda: ");
		
		Scanner s = new Scanner(System.in);
		String ime = s.nextLine();
		
		Metode m = new Metode();
		System.out.println(m.vratiGramazu(proizvodi, ime));
		
		
		
		
		

	}

}
