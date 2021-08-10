package exercice1;

public class Movies extends Content implements Comparable<Movies> {

	private String directorName;
	private String publicationYearMovie;
	
	
	public Movies(String name) {
		super.setName(name);
	}
	public Movies(String name,String directorName) {
		super.setName(name);
		this.directorName = directorName;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getPublicationYearMovie() {
		return publicationYearMovie;
	}
	public void setPublicationYearMovie(String publicationYearMovie) {
		this.publicationYearMovie = publicationYearMovie;
	}
	
	
	@Override
	public String toString() {
		return "Movies [directorName= " + directorName 
				+ ", movieName= " + super.getName() + " rateMovie: "+super.getRate()+"]";
	}
	@Override
	public int compareTo(Movies o) {
		int diff=this.rate.compareTo(o.rate);
		return diff;
	}
	
	

	

}
