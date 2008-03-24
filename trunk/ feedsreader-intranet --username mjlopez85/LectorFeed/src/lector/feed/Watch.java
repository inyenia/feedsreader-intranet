package lector.feed;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Watch {

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
 * Setter of the property <tt>iWatchNews</tt>
 *
 * @param iWatchNews the iWatchNews to set.
 *
 */
public void setIWatchNews(Collection<IWatchNews> iWatchNews){
	this.iWatchNews = iWatchNews;
}

public Set<News> selectAndConnect(){
		return null;
	
	}

	public Watch(){
	
	}

	public Watch(boolean type){
	
	}

/*
 * (non-javadoc)
 */
private boolean type;
 
/**
 * Getter of the property <tt>type</tt>
 *
 * @return Returns the type.
 * 
 */
public boolean getType()
{
	return type;
}

/**
 * Setter of the property <tt>type</tt>
 *
 * @param type The type to set.
 *
 */
public void setType(boolean type ){
	this.type = type;
}

}
