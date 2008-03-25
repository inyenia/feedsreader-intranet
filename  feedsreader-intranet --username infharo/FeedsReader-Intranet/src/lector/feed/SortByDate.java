package lector.feed;

import java.util.Comparator;

public class SortByDate implements Comparator<News>{

	public int compare(News new1, News new2) {
			
		return new1.getDate().compareTo(new2.getDate());
		
	}

	
}
