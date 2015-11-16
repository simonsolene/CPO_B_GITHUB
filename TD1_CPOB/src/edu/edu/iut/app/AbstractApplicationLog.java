package edu.edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {


	protected String message;
	/** TP1 : Tableau au sens des collections **/
	protected IApplicationLogListener[] listeners;
	protected int nblistener;
	
	public AbstractApplicationLog() {
		message = null;
		listeners = new IApplicationLogListener[10];
		nblistener=0;
		
		//listeners = new ;
	}
	
    /** TP1 : Fonction venant de l'interface par héritage  */
	public abstract void setMessage(String message);
	
	public void ajoutIApplicationLogListener(IApplicationLogListener l){
		listeners[nblistener]=l;
		nblistener++;
	}
	
	public IApplicationLogListener getListeners(int i){
		return listeners[i];
	}
	
	
	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
}
