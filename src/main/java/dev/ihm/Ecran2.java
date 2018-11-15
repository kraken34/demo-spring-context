package dev.ihm;

import dev.service.IAppService;

public class Ecran2 {
	
	private IAppService appService;
	
	
	public void afficher() {
		System.out.println("Ecran 2" + appService.getData());
	}
	
	
	public void setAppService(IAppService appService) {
		this.appService = appService;
	}

}
