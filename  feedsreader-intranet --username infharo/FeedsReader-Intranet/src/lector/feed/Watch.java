package lector.feed;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lector.userProfile.Users;

public class Watch {

	private Users user;
	private List<IWatchNews> iWatchNews;
	private boolean type;
	private IWatchNews typeOfWatch;

	public Watch(boolean type){
		this.type = type;
		iWatchNews = new LinkedList<IWatchNews>();
		IWatchNews type1 = new WatchLocal();
		IWatchNews type2 = new WatchWeb();
		iWatchNews.add(type1);
		iWatchNews.add(type2);
		
	}
	
	public Watch()
	{
		this.type = false;
		iWatchNews = new LinkedList<IWatchNews>();
		IWatchNews type1 = new WatchLocal();
		IWatchNews type2 = new WatchWeb();
		iWatchNews.add(type1);
		iWatchNews.add(type2);
	}
	
	public Users getUsers()
	{
		return user;
	}

	public void setUsers(Users user){
		this.user = user;
	}	

	public List<IWatchNews> getIWatchNews()
	{
		return iWatchNews;
	}
	
	public void setIWatchNews(List<IWatchNews> iWatchNews)
	{
		this.iWatchNews = iWatchNews;
	}
 		
	public List<News> WatchPersonalChannels(Users usuario)
	{
		List<News> noticias;
		List<String> canales;
		Iterator<String> itCanales;
		
		noticias = new LinkedList<News>();
		
		//Identificar el tipo de busqueda
		if (type == true)
			typeOfWatch = new WatchWeb();
		else
			typeOfWatch = new WatchLocal();
		
		
		/*
		//Identificar el tipo de busqueda
		Iterator it; 
		
		if (type == true)
		{
			it = iWatchNews.iterator();
			while (it.hasNext())
			{
				if (it.next() instanceOf WatchWeb)
					typeOfWatch = it.next();
			}
		}
		else if (type == false)
		{
			it = iWatchNews.iterator();
		}
		*/
		
		//Obtener lista de canales del usuario
		user = usuario;
		canales = user.getChannels();
				
		itCanales = canales.iterator();
		
		//Recoger las noticias correspondientes a todos los canales
		while (itCanales.hasNext())
		{
			noticias.addAll(typeOfWatch.getListNews(itCanales.next()));
			//System.out.println ("canal: " + itCanales.next());
		}
		
		//Ordenar por fecha
		SortByDate ordenarPorFecha = new SortByDate();
		Collections.sort(noticias,ordenarPorFecha);
		Collections.reverse(noticias);
		
		return noticias;
	}
	
	public List<News> WatchFavoriteChannels()
	{
		return null;
	}

	public boolean getType()
	{
		return type;
	}

	public void setType(boolean type ){
		this.type = type;
	}

}
