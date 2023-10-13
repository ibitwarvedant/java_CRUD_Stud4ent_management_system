// Java Program to Illustrate Record Class

package College;

// Class
public class Record {

	// Instance variables
	private String name;
	private int GRNumber;
	private int RollNumber;

	// Default Constructor
	public Record() {}

	// Parameterized Constructor
	// @param name
	// @param GRNumber
	// @param RollNumber
	public Record(String name, int GRNumber,
				int RollNumber)
	{

		// this keyword refers to current instance itself
		this.name = name;
		this.GRNumber = GRNumber;
		this.RollNumber = RollNumber;
	}

	// Getting the value of RollNumber
	// @return the value of RollNumber
	public int getRollNumber() { return RollNumber; }

	// Set the value of RollNumber
	// @param RollNumber new value of RollNumber
	public void setRollNumber(int RollNumber)
	{

		this.RollNumber = RollNumber;
	}

	// Getting the value of GRNumber
	// @return the value of GRNumber
	public int getGRNumber() { return GRNumber; }

	// Setting the value of GRNumber
	// @param GRNumber new value of GRNumber
	public void setGRNumber(int GRNumber)
	{
		this.GRNumber = GRNumber;
	}

	// Getting the value of name
	// @return the value of name
	public String getName() { return name; }

	// Setting the value of name
	// @param name new value of name
	public void setName(String name) { this.name = name; }

	// toString() Method
	// @return
	@Override public String toString()
	{

		// Returning the record
		return "Records{"
			+ "Name=" + name + ", GR Number=" + GRNumber
			+ ", Roll Number=" + RollNumber + '}';
	}
}
