package dev.service;

import org.springframework.stereotype.Component;

@Component
public class AppServiceSQL implements IAppService {

	@Override
	public String getData() {
		return "Data SQL";
	}
	

}