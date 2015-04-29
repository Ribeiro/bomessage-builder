package com.calypso.tk.bo;

import java.util.Date;


public final class BOMessageBuilder {

	private BOMessage instance;

	public BOMessageBuilder() {
		instance = new BOMessage();
	}
	
	public BOMessageBuilder withStatus(String status){
		instance.setStatus(status);
		return this;
	}
	
	public BOMessageBuilder withDate(Date date){
		instance.setCreationDate(date);
		return this;
	}
	
	public BOMessageBuilder withAction(String action){
		instance.setAction(action);
		return this;
	}
	
	public BOMessageBuilder forToday(){
		instance.setCreationDate(new Date());
		return this;
	}

	public BOMessage build() {
		return instance;
	}

}