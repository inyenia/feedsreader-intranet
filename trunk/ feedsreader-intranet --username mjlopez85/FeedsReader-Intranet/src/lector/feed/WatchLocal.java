package lector.feed;

import java.util.LinkedList;
import java.util.List;

public class WatchLocal implements lector.feed.IWatchNews {


	private News news;
	private List<News> listNews;
 
	public News getNews()
	{
		return news;
	}

	public void setNews(News news ){
		this.news = news;
	}

	public void connectLocal(String canal){
		/*Este metodo es el encargado de conectarse a la base de datos local
		 * y obtener todas las noticias del canal que se le pasa como parametro
		 * de entrada "canal"*/
		listNews = new LinkedList<News>();
		
		if (canal == "canal1")
		{
			News new1 = new News("nota de isg3 para canal1 ", "Se ha publicado las notas correspondiente a la primera convocatoria", "http://url.com", "24/03/08");
			News new2 = new News("beca sicue para canal1", "Nueva fecha para las solicitudes para la beca sicue", "http://url2.com", "23/03/08");
			News new3 = new News("corte de luz para canal1", "Por motivos de mantenimiento se cortara el suministro de luz en el aula 2", "http://url3.com", "25/03/08");
			News new4 = new News("asamblea para canal1", "Para mañana nueva asamblea de alumnos para tratar tema de tratado de Bolonia", "http://url4.com", "22/03/08");
			
			listNews.add(new1);
			listNews.add(new2);
			listNews.add(new3);
			listNews.add(new4);
		}
		else
		{
			News new1 = new News("notas, para canal2 ", "Se ha publicado las notas correspondiente a la primera convocatoria", "http://url.com", "21/03/08");
			News new2 = new News("beca seneca para canal2", "Nueva fecha para las solicitudes para la beca sicue", "http://url2.com", "23/03/08");
			News new3 = new News("nuevos ordenadores canal2", "Ya estan disponibles los nuevos ordenadores para el aula 2", "http://url3.com", "22/03/08");
			News new4 = new News("huelga","Se convoca una huelga de estudiantes para mañana", "http://url4.com", "22/03/08");
			
			listNews.add(new1);
			listNews.add(new2);
			listNews.add(new3);
			listNews.add(new4);
		}
		
	}
 

	public List<News> getListNews(String canal)
	{
		connectLocal(canal);
		return listNews;
	}

	public void setListNews(List<News> listNews ){
		this.listNews = listNews;
	}

}
