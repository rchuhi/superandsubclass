/*Reginah Chuhi
	CIS221
	Tuesday and Thursday 2:10pm*/

public class Movie {

	private String name;
	private double yearReleased;
	

		//creates a constructor for the Movie class
		
		public Movie(String name, double yearReleased) {
			this.name=name;
			this.yearReleased=yearReleased;
		}
//Create a getter and setter to get the name and year of release from the private class
		public String getName() {
			return name;
		}

		public void setName(String name) {
			
			this.name = name;
		}

		public double getYearReleased() {
			return yearReleased;
		}

		public void setYearReleased(double yearReleased) {
			this.yearReleased = yearReleased;
			
		
		}
		

		}		


