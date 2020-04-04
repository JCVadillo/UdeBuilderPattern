
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciation of the user using the builder
		User user1 = new User.Builder("JCV", "jcv@gmail.com").firstName("Juan Carlos").lastName("Vadillo")
				.phoneNo(123456).address("Dublin").userBuilder();

		
		System.out.println(user1);
		

	}

}
