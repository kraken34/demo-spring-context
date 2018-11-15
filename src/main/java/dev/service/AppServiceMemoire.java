package dev.service;

import org.springframework.stereotype.Component;


public class AppServiceMemoire implements IAppService {

	@Override
	public String getData() {
		return "Data Mémoire";
	}
	

}
