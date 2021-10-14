package Session;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie{
	int rating;
	String name;
	int year;
	public Movie(int rating, String name,  int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Rating: "+rating+"\tName: "+name+"\tYear: "+year;
	}
		
}

public class Program_12_comparator {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		ArrayList<Movie> movie=new ArrayList<Movie>();
		movie.add(new Movie (3,"Aaaaa",1999));
		movie.add(new Movie(4,"Bbbbb",1998));
		movie.add(new Movie(5,"Ccccc",2021));
		movie.add(new Movie(4,"Ddddd",2010));
		movie.add(new Movie(4,"Eeeee",2012));
		
		for(Movie mv:movie) {
			System.out.println(mv);
		}
		
		System.out.print("\n");
		
		Collections.sort(movie,new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				
				return o1.name.compareTo(o2.name);
			}
		});
		for(Movie mv:movie) {
			System.out.println(mv.name);
		}
		s.close();	
		
	}

}