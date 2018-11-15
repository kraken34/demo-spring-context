package dev.ihm;

import dev.service.IAppService;

public class Ecran {
	
	private IAppService appService;

	public Ecran(IAppService appService) {
		super();
		this.appService = appService;
	}
	
	
	public void afficher() {
		
		System.out.println(this.appService.getData());
	}
	

}
