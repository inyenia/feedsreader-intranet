package lector.feed.test;

import java.util.Iterator;
import java.util.Set;
import org.junit.Test;
import lector.feed.Watch;
import lector.feed.News;

public class WatchTest {
	
	@Test
	public void constructorDefault(){
		Watch w1 = new Watch();
		assert w1.getType() == false;
	}
	
	@Test
	public void otherConstructor(){
		Watch w2 = new Watch(true);
		assert w2.getType() == true;
		
	}
	
	@Test
	public void setTypeWatch(){
		Watch w3 = new Watch();
		w3.setType(true);
		assert w3.getType() == true;
	}
	
	/*Si el atributo type de la clase Watch es false debe obtener las noticias
	 desde la base de datos*/
	@Test
	public void connectWatch(){
		Watch w4 = new Watch();
		News n;
		Set<News> lt = w4.selectAndConnect();
		
		assert lt != null;
		Iterator it = lt.iterator();
		
		if (it.hasNext()){
			n = (News) it.next();
			assert n.getTitle().equals("noticia1");
		}
		
		if (it.hasNext()){
			n = (News) it.next();
			assert n.getTitle().equals("noticia2");
		}
	}
}
