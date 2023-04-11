package movieguesser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author mkiel
 *
 */
public class MovieList {
	/**
	 * Class representing a list of movies.
	 * 
	 */

	private ArrayList<String> movies;

	/**
	 * Class constructor that stores the movie titles contained in an ArrayList,
	 * until it scans all the lines in the file, if a valid path to the file exists
	 * or warns the user otherwise.
	 * 
	 * @param pathname Path to the file containing the movies' titles.
	 */
	public MovieList() {

		movies = new ArrayList<>();
		File file = new File("movies.txt");
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				movies.add(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist!");
		}
		
	}

	/**
	 * Method that generates a random int from 0 to the number of movie
	 * titles in the list minus 1, and returns the movie title in the movies
	 * ArrayList with that index.
	 * 
	 * @return random movie title from the list.
	 */
	public String getRandomMovie() {
		// returns a string with the random movie from the list
		int movieIndex = (int) (Math.random() * movies.size());
		return movies.get(movieIndex);
	}
	
	

}
