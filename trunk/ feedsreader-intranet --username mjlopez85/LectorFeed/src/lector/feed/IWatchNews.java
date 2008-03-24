package lector.feed;

import java.util.Set;
import lector.filter.Decorator;

public interface IWatchNews {

	/*
 * (non-javadoc)
 */
public static final Decorator decorator = null;

/*
 * (non-javadoc)
 */
public static final Watch watch = null;

	public abstract Set<News> getListNews();

}
