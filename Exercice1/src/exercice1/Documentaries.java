package exercice1;

public class Documentaries extends Content {

	private String directorName;
	private String publicationYearMovie;
	
	
	
	public Documentaries(String name) {
		super.setName(name);
		
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
		return  getClass().getSimpleName()+" "+"Name =" + super.getName() + "]";
	}
	
	
	
	
        
	
	
	
}
