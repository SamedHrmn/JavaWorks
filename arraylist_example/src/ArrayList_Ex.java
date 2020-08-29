import java.util.ArrayList;

public class ArrayList_Ex {

	public static void main(String[] args) {
		ArrayList<String>group = new ArrayList<String>();
		
		group.add("Metallica");
		group.add("Iron Maiden");
		group.add("Black Sabbath");
		
		for(String s:group) {
			System.out.println("Eleman : "+s);
		}

	}

}
