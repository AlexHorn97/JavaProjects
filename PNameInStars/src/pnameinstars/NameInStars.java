package pnameinstars;

public class NameInStars 
{
	private String name;
	
	public NameInStars(String uName) 
	{
		name = uName; 
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void SurroundNameInStars() 
	{
		name = 	"******" + name + "******\n" +
				"******" + name + "******\n" +
				"******" + name + "******";
		
		
	}
}
