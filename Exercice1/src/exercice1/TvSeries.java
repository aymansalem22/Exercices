package exercice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class TvSeries extends Content {

	private String nameStudio;
	private List<TvSeriesSeasion> SessionsWithRate;
	private String yearFirstSession;
	
	
	
	
	public TvSeries(String name) {
		super.setName(name);
	}
	public String getNameStudio() {
		return nameStudio;
	}
	public void setNameStudio(String nameStudio) {
		this.nameStudio = nameStudio;
	}

	


	public List<TvSeriesSeasion> getSessionsWithRate() {
		return SessionsWithRate;
	}
	public void setSessionsWithRate(List<TvSeriesSeasion> sessionsWithRate) {
		SessionsWithRate = sessionsWithRate;
	}
	public String getYearFirstSession() {
		return yearFirstSession;
	}
	public void setYearFirstSession(String yearFirstSession) {
		this.yearFirstSession = yearFirstSession;
	}
	@Override
	public String toString() {
		return  getClass().getSimpleName()+"name =" + super.getName() +" "+ SessionsWithRate+ " rateseries:  "+super.getRate()+"]";
	}
	
	

	
	
}
