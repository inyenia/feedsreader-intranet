package lector.filter.test;

import java.util.Set;
import java.util.Iterator;
import lector.feed.News;
import lector.feed.Watch;
import lector.filter.FilterOne;
import org.junit.Test;

//El FilterOne filtra por fecha
public class FilterOneTest {
	
	@Test
	public void checkFilter(){
		FilterOne filter = new FilterOne();
		Watch w = new Watch();
		News n;
		Set<News> st = w.selectAndConnect();
		filter.filtering(st);
		
		Iterator it = st.iterator();
		
		assert st != null;
		
		if (it.hasNext()){
			n = (News) it.next();
			assert n.getTitle().equals("noticia1");
		}
		
		assert it.hasNext() == false;
	}
	
}
