package lector.feed;

import java.util.Collection;
import java.util.List;

public class WatchWeb implements lector.feed.IWatchNews {

	private News news;
	private Collection<IFeedType> iFeedType = null;
	private String listURL;
	private List<News> listNews;

	public News getNews()
	{
		return news;
	}

	public void setNews(News news ){
		this.news = news;
	}


	public Collection<IFeedType> getIFeedType()
	{
		return iFeedType;
	}
 
	public void setIFeedType(Collection<IFeedType> iFeedType){
		this.iFeedType = iFeedType;
	}

	public String getListURL()
	{
		return listURL;
	}

	public void setListURL(String listURL ){
		this.listURL = listURL;
	}

	public void connectWeb(String URL){
	
	}
	
	public List<News> getListNews(String canal)
	{
		return listNews;
	}

	public void setListNews(List<News> listNews ){
		this.listNews = listNews;
	}

}
