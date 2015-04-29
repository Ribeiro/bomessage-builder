package com.calypso.tk.bo;

import java.util.Date;

public class BOMessage {
	private Date creationDate;
	private String status;
	private String action;
	
	public BOMessage(){
		
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}