package dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.ihm.Ecran;
import dev.ihm.Ecran2;
import dev.service.AppServiceMemoire;
import dev.service.AppServiceSQL;
import dev.service.IAppService;

public class App {

	public static void main(String[] args) {

		// sans Spring
		
//		IAppService appService = new AppServiceSQL();
//		Ecran ecran = new Ecran(appService );
//		ecran.afficher();
		
		
		
		// Principe : déléguer à un framework la création de vos objets (structure)

		
		// Créer un contexte
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo.xml")) {

			Ecran2 ecran = context.getBean(Ecran2.class);
			
			ecran.afficher();
			
			
			
		}

	}

}
