package lector.filter;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import lector.feed.IWatchNews;
import lector.feed.News;

public abstract class Decorator implements lector.feed.IWatchNews {

	/**
 *
 */
private Collection<IWatchNews> iWatchNews = null;

/**
 * Getter of the property <tt>iWatchNews</tt>
 *
 * @return Returns the iWatchNews.
 * 
 */
public Collection<IWatchNews> getIWatchNews()
{
	return iWatchNews;
}
 
/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param elements collection to be checked for containment in this collection.
 * @see	java.util.Collection#containsAll(Collection)
 *
 */
public boolean containsAllIWatchNews(Collection<IWatchNews> iWatchNews){
	return this.iWatchNews.containsAll(iWatchNews);
}

/**
 * Setter of the property <tt>iWatchNews</tt>
 *
 * @param iWatchNews the iWatchNews to set.
 *
 */
public void setIWatchNews(Collection<IWatchNews> iWatchNews){
	this.iWatchNews = iWatchNews;
}

public Set<News> getListNews() {
		return null;
	}

public void filtering(Set<News> OldSet){}

}
