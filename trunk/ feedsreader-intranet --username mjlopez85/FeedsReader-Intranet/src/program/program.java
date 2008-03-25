package program;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lector.feed.Watch;
import lector.feed.News;
import lector.userProfile.Users;

public class program {

	
	public static void main(String[] args) {
		Watch buscar;
		List<News> listaDeNoticias;
		Users usuario;
		Iterator<News> it;
		int i = 0;
		
		buscar = new Watch();
		
		//Preparamos usuario
		List<String> listaCanales = new LinkedList<String>();
		listaCanales.add("canal1");
		listaCanales.add("canal2");
		usuario = new Users("Pepe","Garcia","C/Sol", 12345678, listaCanales);
		
		//Obtengo las noticias correspondientes al usuario que se introduce como parametro de entrada
		listaDeNoticias = buscar.WatchPersonalChannels(usuario);
		it = listaDeNoticias.iterator();
		
		while(it.hasNext())
		{
			i++;
			System.out.println("NOTICIA" + i + ": " + it.next().toString());
		}

	}

}
