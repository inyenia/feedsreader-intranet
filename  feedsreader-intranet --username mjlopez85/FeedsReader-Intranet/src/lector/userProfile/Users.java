package lector.userProfile;

import java.util.List;

public class Users {
	private String name;
	private String surname;
	private String address;
	private int dni;
	private List<String> channels;

	public Users()
	{
		name = "";
		surname = "";
		address = "";
		dni = 0;
		channels = null;
	}
	
	public Users(String name, String surname, String address, int dni, List<String> channels)
	{
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.dni = dni;
		this.channels = channels;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public int getDni()
	{
		return dni;
	}
	
	public void setDni(int dni)
	{
		this.dni = dni;
	}
	
	public List<String> getChannels()
	{
		return channels;
	}
	
	public void setChannels(List<String> channels)
	{
		this.channels = channels;
	}
}
