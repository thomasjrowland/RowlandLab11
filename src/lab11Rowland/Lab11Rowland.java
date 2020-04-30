package lab11Rowland;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Lab11Rowland {
	
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Movie> filmLibrary = new ArrayList<>();
		TreeSet<String> categories = new TreeSet<>();
		
		for (int i = 1 ; i <= 100 ; i++) {
			filmLibrary.add(MovieIO.getMovie(i));
			categories.add(filmLibrary.get(i - 1).getGenre());
		}
		
		
		do {
			
			System.out.println();
			System.out.println("WELCOME TO YOUR FILM LIBRARY");
			System.out.println("FILMS ARE DIVIDED INTO THE FOLOWING GENRES:");
			System.out.println();
			
			int catNum = 1;
		
			for (String s : categories) {
				System.out.printf("(%d) %-10s\n", catNum, s);
				catNum++;
			}
			
			System.out.println();
			
			int menuSelection = Validator.getInt(scnr, "Please enter your selection: ");
		
			printFilmList(filmLibrary, menuSelection);
		
			} while (Validator.getYesNo(scnr, "Would you like to continue? "));
		
		
	}
	
	
	private static void printFilmList(ArrayList<Movie> filmLibrary, int menuSelection) {
		
		String genre = "";
		
		switch (menuSelection) {
			case 1:
				genre = "animated";
				break;
			case 2:
				genre = "comedy";
				break;
			case 3:
				genre = "drama";
				break;
			case 4:
				genre = "horror";
				break;
			case 5:
				genre = "musical";
				break;
			case 6:
				genre = "scifi";
				break;
			default:
				System.out.println("Invalid input!");
				return;
		}
		
		System.out.println();
		for (Movie m : filmLibrary) {
			if (genre.equals(m.getGenre())) {
				System.out.printf("Title: %-35s Genre: %-8s\n",m.getTitle(), m.getGenre());
			}
		}
		System.out.println();
	}
	
	

}
