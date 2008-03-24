package lector.feed;

public class News {

	public News(){
	
	}

	public News(String title, String description, String URL, String date){
	
	}

/*
 * (non-javadoc)
 */
private String URL;
 
/**
 * Getter of the property <tt>URL</tt>
 *
 * @return Returns the URL.
 * 
 */
public String getURL()
{
	return URL;
}

/**
 * Setter of the property <tt>URL</tt>
 *
 * @param URL The URL to set.
 *
 */
public void setURL(String URL ){
	this.URL = URL;
}

/*
 * (non-javadoc)
 */
private String date;
 
/**
 * Getter of the property <tt>date</tt>
 *
 * @return Returns the date.
 * 
 */
public String getDate()
{
	return date;
}

/**
 * Setter of the property <tt>date</tt>
 *
 * @param date The date to set.
 *
 */
public void setDate(String date ){
	this.date = date;
}

/*
 * (non-javadoc)
 */
private String description;
 
/**
 * Getter of the property <tt>description</tt>
 *
 * @return Returns the description.
 * 
 */
public String getDescription()
{
	return description;
}

/**
 * Setter of the property <tt>description</tt>
 *
 * @param description The description to set.
 *
 */
public void setDescription(String description ){
	this.description = description;
}

/*
 * (non-javadoc)
 */
private String title;
 
/**
 * Getter of the property <tt>title</tt>
 *
 * @return Returns the title.
 * 
 */
public String getTitle()
{
	return title;
}

/**
 * Setter of the property <tt>title</tt>
 *
 * @param title The title to set.
 *
 */
public void setTitle(String title ){
	this.title = title;
}

}
