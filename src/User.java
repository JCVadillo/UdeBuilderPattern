

public class User {
	//mandatory
	private String userName;
	private String email;
	
	//optional
	private String firstName;
	private String lastName;
	private int phoneNo;
	private String address;
	
	//Now is needed to set the variables of the user class with the builder class
	private User(Builder builder) {
		this.userName = builder.userName;
		this.email = builder.email;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.phoneNo = builder.phoneNo;
		this.address = builder.address;
	}
	
	@Override
	public String toString() {
		return "User [ userName = " +userName+ ", email = "+email+ ", firstName = " +firstName+ ", lastName = " +
				lastName+ ", phoneNo = " +phoneNo+ ", address = " +address+ " ]";
	}
	
	//builder pattern inner class
	public static  class Builder{
		
		//mandatory
		private String userName;
		private String email;
		
		//optional
		private String firstName;
		private String lastName;
		private int phoneNo;
		private String address;
		
		//builder constructor with mandatory fields
		public Builder(String userName, String email) {
			
			this.userName = userName;
			this.email = email;
		}
		
		//methods to set the optional fields
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Builder phoneNo(int phoneNo) {
			this.phoneNo = phoneNo;
			return this;
		}
		
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		
		//method to return an instance of user by the builder
		public User userBuilder() {
			return new User(this);
		}
	}
}
