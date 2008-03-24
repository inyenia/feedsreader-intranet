package lector.feed;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class WatchWeb implements lector.feed.IWatchNews {

	/*
 * (non-javadoc)
 */
private News news;
 
/**
 * Getter of the property <tt>news</tt>
 *
 * @return Returns the news.
 * 
 */
public News getNews()
{
	return news;
}

/**
 * Setter of the property <tt>news</tt>
 *
 * @param news The news to set.
 *
 */
public void setNews(News news ){
	this.news = news;
}

	/**
 *
 */
private Collection<IFeedType> iFeedType = null;

/**
 * Getter of the property <tt>iFeedType</tt>
 *
 * @return Returns the iFeedType.
 * 
 */
public Collection<IFeedType> getIFeedType()
{
	return iFeedType;
}
 
/**
 * Setter of the property <tt>iFeedType</tt>
 *
 * @param iFeedType the iFeedType to set.
 *
 */
public void setIFeedType(Collection<IFeedType> iFeedType){
	this.iFeedType = iFeedType;
}

/*
 * (non-javadoc)
 */
private String listURL;
 
/**
 * Getter of the property <tt>listURL</tt>
 *
 * @return Returns the listURL.
 * 
 */
public String getListURL()
{
	return listURL;
}

/**
 * Setter of the property <tt>listURL</tt>
 *
 * @param listURL The listURL to set.
 *
 */
public void setListURL(String listURL ){
	this.listURL = listURL;
}

	public void connectWeb(String URL){
	
	}

/*
 * (non-javadoc)
 */
private Set<News> listNews;
 
/**
 * Getter of the property <tt>listNews</tt>
 *
 * @return Returns the listNews.
 * 
 */
public Set<News> getListNews()
{
	return listNews;
}

/**
 * Setter of the property <tt>listNews</tt>
 *
 * @param listNews The listNews to set.
 *
 */
public void setListNews(Set<News> listNews ){
	this.listNews = listNews;
}

}
