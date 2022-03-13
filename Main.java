/*Reginah Chuhi
	CIS221
	Tuesday and Thursday 2:10pm*/

// gets the information from the super and subclasses
public class Main {

	public static void main(String[] args) {
		Movie m =new Movie("Shadows", 2019);
		Rating r= new Rating(18,"Shadows", 2019);
		Genre g= new Genre(true,"Shadows", 2019);
		
System.out.println(m.getName());
System.out.println(r.age);
System.out.println(g.thriller);
	}

}
