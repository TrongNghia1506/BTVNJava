package communityuni.com;

public class Person {
	private String Id;
	private String Name;
	protected int Age;
	private String Address;
	
	public Person(){
	}
	public Person(String Id, String Name, int Age, String Address) {
		this.Id = Id;
		this.Name = Name;
		this.Age = Age;
		this.Address = Address;
	}
	
	public String getID(){
		return Id;
	}
	
	public void setID(String Id) {
		this.Id = Id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getAge() {
		return Age;
	}
	
	public void setAge(int Age) {
		this.Age = Age;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	 public void setAddress(String Address) {
	    this.Address = Address;
	}
}
