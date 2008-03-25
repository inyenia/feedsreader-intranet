package lector.feed;

public class News {
	
	private String title;
	private String description;
	private String URL;
	private String date;
	
	public News(){
		this.title = "";
		this.description = "";
		this.URL = "";
		this.date = "";
	}

	public News(String title, String description, String URL, String date){
		this.title = title;
		this.description = description;
		this.URL = URL;
		this.date = date;
	}

	public String getURL()
	{
		return URL;
	}

	public void setURL(String URL ){
		this.URL = URL;
	}

	
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date ){
		this.date = date;
	}
 

	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description ){
		this.description = description;
	}
 

	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title ){
		this.title = title;
	}
	
	public String toString()
	{
		return "titulo: " + title + ", descripcion: " + description + ", URL: " + URL + ", fecha: " + date;
	}

}
