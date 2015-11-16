package edu.edu.iut.app;

import java.util.ArrayList;

public class ApplicationWarningLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationWarningLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
	}

	@Override
	public String getMessage() {
		
		return message;
	}

	@Override
	public void addListener(IApplicationLogListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IApplicationLogListener[] getApplicationLogListeners() {
		// TODO Auto-generated method stub
		return listeners;
	}
}
