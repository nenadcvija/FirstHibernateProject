package automobili;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import controller.HibernateDAO;
import model.Car;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {
		
		HibernateDAO dao = new HibernateDAO();
		
		//Car car = new Car("maserati", "ghilbi", 2016, 0.18, true );
		//dao.snimiAutoUbazu(car);
		
		/*
		 * Car car = dao.vratiAuto(2); dao.updateCarPrice(car.getIdCar(), 1800000);
		 * System.out.println("Uzeo si auto " + car.getMarka() + " " + car.getModel());
		 * System.out.println("Nova cena je: " + car.getCena());
		 */
		
		if(dao.deleteCar(2)) {
			System.out.println("Obrisan je auto");
		}else {
			System.out.println("Nije obrisan auto");
		}
		
		

	}

}