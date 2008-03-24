package lector.feed.test;

import java.util.Iterator;
import java.util.Set;

import lector.feed.IWatchNews;
import lector.feed.News;
import lector.feed.Watch;
import lector.feed.WatchLocal;

import org.junit.Test;

public class IWatchNewsTest {
	
	@Test
	public void checkIWatch(){
		IWatchNews w = new WatchLocal();
		News n;
		
		Set<News> st = w.getListNews();
		
		assert st != null;
		
		Iterator it = st.iterator();
		
		if (it.hasNext()){
			n = (News) it.next();
			assert n.getTitle().equals("noticia1");
		}
		
		if (it.hasNext()){
			n = (News) it.next();
			assert n.getTitle().equals("noticia2");
		}
		
		assert it.hasNext() == false;
	}
}
