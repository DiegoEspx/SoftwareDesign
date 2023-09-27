package Ejercicio1;

public class Date {
	//atributos
	private int year;
	private int month;
	private int day;
	
	//contructor
	public Date() {
		
	}

	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year<= 0) {
			
		}
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	

	@Override
	public String toString() {
		return "00/00/00, para que no aparezca error digite una fecha verdadera";
	}
	
	public void setDate(int year, int month, int day) {
		
	}
}
