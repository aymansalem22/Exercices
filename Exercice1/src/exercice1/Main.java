package exercice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Movies movie1=new Movies("Cubrick", "clockwork orange");
		
		System.out.println(movie1);
		Documentaries documentary1=new Documentaries("Blue Planet");
		System.out.println(documentary1);
		TvSeries series1=new TvSeries("Stranger Things");
		System.out.println(series1);
		
		List<Content> contents=new ArrayList<>();
		
		contents.add(movie1);
		contents.add(documentary1);
		contents.add(series1);
		System.out.println("***************");
		System.out.println("**what the content he show until know: ** \n");
		for (Content content : contents) {
			System.out.println(content);
		}
		
		
		series1.setRate("LIKE");
		
		System.out.println("***que la serie me gusta***");
		System.out.println();
		System.out.println(series1);
		List<TvSeriesSeasion> tv=new ArrayList<TvSeriesSeasion>();
		TvSeriesSeasion tvv=new TvSeriesSeasion(2, 0);
		tv.add(tvv);
		series1.setSessionsWithRate(tv);
		System.out.println("la segunda temporada no le gusta\n");
		System.out.println(series1+"\n");
		System.out.println("oops, la naranja mecánica es de Kubrick. Lo corrijo.");
		movie1.setDirectorName("Kubrick");
		System.out.println("esta actualizado "+movie1);
		System.out.println("Mi hermana me roba la cuenta de Netflix y mira the Notebook (Y lo registra)");
		Movies movie2=new Movies( "Notebook");
		System.out.println(movie2);
		System.out.println("Revisando el registro, me doy cuenta de ello y "
				+ "lo borro inmediatamente. Doy valoraciones a las películas que no tienen.");
		contents.add(movie2);
		System.out.println("***registes update with new movie***");
		for (Content content : contents) {
			System.out.println(content);
		}
		contents.remove(movie2);
		
		System.out.println("***after remove Notebook***");
		for (Content content : contents) {
			System.out.println(content);
		}
		System.out.println("Doy valoraciones a las películas que no tienen");
		movie1.setRate("LIKE");
		System.out.println(movie1);
		System.out.println("**Ayer hice maratón de Stephen King y vi the Shining y Pet Sematary. "
				+ "Ambas me gustaron mucho, aunque la primera más que la segunda.");
		Movies movie3=new Movies("Stephen King", "the Shining");
		movie3.setRate("BIGLIKE");
		System.out.println(movie3.getRate());
		Movies movie4=new Movies("Stephen King", "Pet Sematary");
		movie4.setRate("LIKE");
		System.out.println(movie4.getRate());
		contents.add(movie3);
		contents.add(movie4);
		
		System.out.println("***Filtro las peliculas por valoración: solo busco las que me han gustado más.***");
		
		List<Movies> movie=new ArrayList<>();
		movie.add( movie4);
		movie.add( movie3);
		movie.add( movie1);
		Collections.sort(movie);
		System.out.println(movie);
	}

}
