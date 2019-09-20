package simple;

public class Customer 
{
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;
	
	public Customer (String name,String address,String contactNumber,String email,String proofType,String proofId)

	{
	this.name=name;
	this.address=address;
	this.contactNumber=contactNumber;
	this.email=email;
	this.proofType=proofType;
	this.proofId=proofId;


	}
	void register(String name,String address,String contactNumber,String email,String proofType,String proofId)
	{
	System.out.println("Name : "+this.name);
	System.out.println("Address : "+this.address);
	System.out.println("Number : "+this.contactNumber);
	System.out.println("Email : "+this.email);
	System.out.println("Proof Type : "+this.proofType);
	System.out.println("Proof ID : "+this.proofId);
	}

}
