package dev.ihm;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.service.IAppService;

@Component
public class Ecran2 {

	@Autowired
	private IAppService appService;
	
	@Autowired
	private Scanner scan;

	public void afficher() {
		System.out.println("Ecran 2" + appService.getData());
	}

	public void afficherSaisie() {
		String saisie = scan.next();
		System.out.println("Saisie =" + saisie);
	}

	public void setAppService(IAppService appService) {
		this.appService = appService;
	}

}
