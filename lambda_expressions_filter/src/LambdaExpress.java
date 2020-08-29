import java.util.Arrays;
import java.util.List;

//LAMBDA ÝLE JAVA 8 STREAM APÝ:FÝLTER KULLANIMI

public class LambdaExpress {
	
	 public static class User{
		private String name;
		private int age;
		
		
		public User(String name,int age) {
			this.name=name;
			this.age=age;
		}
		
		public int getAge() {
			return age;
		}
	}

	public static void main(String[] args) {
		
		User user1=new User("John",30);
		User user2=new User("Doe",20);
		User user3=new User("Mark",22);
		
		
		List<User> userList=Arrays.asList(user1,user2,user3);
		
		for(User user:userList) {
			if(user.getAge()>21) {
				System.out.println(user.getAge());
			}
		}
		
		System.out.println("After Lambda Expressions:");
		
		userList.stream().filter(u->u.getAge() >21 ).forEach(u->System.out.println(u.getAge()));		

	}

}
