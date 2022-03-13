//this is a a subclass that gets the values from the superclass movie
public class Genre extends Movie {

	public  boolean thriller;
	
	Genre (boolean thriller, String name, double yearReleased){
	
		super(name,yearReleased);
		this.thriller=thriller;
}
}