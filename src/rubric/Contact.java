package rubric;

public class Contact implements Comparable<Contact>
{
	private String name;	
	private String surname;
	private String number;
	
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
	
	public String getNumber()
	{
		return number;
	}
	
	public void setNumber(String number)
	{
		this.number = number;
	}

	@Override
	public int compareTo(Contact contact)
	{
		if(this.name == contact.name)
			return this.surname.compareToIgnoreCase(contact.surname);
		return 1;
	}
}
