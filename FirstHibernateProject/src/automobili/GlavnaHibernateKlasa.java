package automobili;

import controller.HibernateDAO;
import model.Car;
import model.User;
import model.VisitCard;
import model.VrstaVozila;

public class GlavnaHibernateKlasa {

	public static void main(String[] args) {
		
		HibernateDAO dao = new HibernateDAO();
		
		dao.linkujUseraIauto(1, 1);
		
		
		/*
		 * Car car = new Car("land rover",
		 * "discovery",2018,39990,false,VrstaVozila.SUV);
		 * 
		 * VisitCard visitCard = new VisitCard(); visitCard.setIme("ruzica");
		 * visitCard.setEmail("ruza@gmail.com");
		 * visitCard.setBrojTelefona("0641234567");
		 * 
		 * User user = new User(); user.setUserName("ruza");
		 * user.setPassword("ruzaprogramer123"); user.setNovcanik(100000);
		 * user.setVisitCard(visitCard);
		 * 
		 * 
		 * dao.snimiUseraUbazu(user); dao.snimiAutoUbazu(car);
		 */
		
		

	}

}
