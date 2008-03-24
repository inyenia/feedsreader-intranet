package lector.feed;

import java.util.Set;

public class WatchLocal implements lector.feed.IWatchNews {

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

	public void connectLocal(){
	
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
