package exercice1;

public class TvSeriesSeasion {

	private int seassion;
	private double rating;
	
	
	public TvSeriesSeasion(int seassion, double rating) {
		
		this.seassion = seassion;
		this.rating = rating;
	}
	
	public int getSeassion() {
		return seassion;
	}
	public void setSeassion(int seassion) {
		this.seassion = seassion;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "TvSeriesSeasion [seassion=" + seassion + ", rating=" + rating + "]";
	}
	
	
}
