/*Reginah Chuhi
	CIS221
	Tuesday and Thursday 2:10pm*/
//this is another subclass that extends movie class
public class Rating extends Movie {
	public final int age ;
	
	Rating(int age, String name, double yearReleased){

		super (name,yearReleased);
		this.age=age;
		
}
}