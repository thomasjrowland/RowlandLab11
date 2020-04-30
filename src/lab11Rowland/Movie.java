package lab11Rowland;

public class Movie {
	
	private String title = "Title Not Assigned";
	private String genre = "Genre Not Assigned";
	
	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	public Movie() {}
	
	//setters
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	//getter
	
	public String getTitle() {
		return this.title;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	
}
