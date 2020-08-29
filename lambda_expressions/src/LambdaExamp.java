
//LAMBDA �FADES�N� METHODA PARAMETRE GE��RMEK

public class LambdaExamp {
	
	public interface Hesapla{
		double execute(double first,double second);
	}
	
	private static double getResult(double first,double second,Hesapla hesapla) {
		return first+second;
	}

	public static void main(String[] args) {
		
		double result=getResult(3, 5,new Hesapla() {
			@Override
			public double execute(double first,double second) {
				return first+second;
			}
		});
		
		System.out.println("Java8 Before:  "+result);
		
		
		
		double resultLambda=getResult(3,5,(a,b)->(a+b));  //Tek method i�eren interface'ler fonksiyoneldir.Lambda ifadesi ile bu �ekilde kullan�labilir.
		System.out.println("With Lambda: "+resultLambda);
		

	}

}
