
public class ShadowingExamp {
	
	public int x=0;
	
	class FirstLevel{
		public int x=1;
		
		void methodInFirstLevel(int x) {
			System.out.println("x= "+x);
			System.out.println("this.x= "+this.x);
			System.out.println("ShadowingExamp.this.x= "+ShadowingExamp.this.x);
		}
		
	}
	
	

	public static void main(String[] args) {
		ShadowingExamp se=new ShadowingExamp();
		ShadowingExamp.FirstLevel f1=se.new FirstLevel();
		f1.methodInFirstLevel(23);

	}

}
