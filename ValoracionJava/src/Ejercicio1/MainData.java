package Ejercicio1;

public class MainData {

	public static void main(String[]args) {
		Date date=new Date (2233,2,29);
		
		
		
		if(date.getYear()>=1000 && date.getYear()<=9999) {
			System.out.println("___________________________");
			System.out.println("Su fecha es: ");
			System.out.println("su Año: "+date.getYear());
			
		}else {
			System.out.println("año invalido");
		}
		//para los meses que tienen 31 dias
		if(date.getMonth()==1 ||date.getMonth()==3||date.getMonth()==5||date.getMonth()==7||date.getMonth()==8
				||date.getMonth()==10||date.getMonth()==12) {
			System.out.println("su Mes: "+date.getMonth());
			if (date.getDay() >= 1 && date.getDay()<= 31) {
	            System.out.println("su dia es:"+date.getDay());
	            System.out.println("__________________________");
	        } else {
	            System.out.println("El valor de dia no es válido. Debe estar entre 1 y 31 por favor");
	        }
		}
		
		
		//para febrero, solo 28 dias
		
		if(date.getMonth()==2) {
			System.out.println("su Mes: "+date.getMonth());
			if (date.getDay() >= 1 && date.getDay()<= 28) {
				
	            System.out.println("su Dia es: "+date.getDay());
	            System.out.println("_____________________________");
	        } else {
	            System.out.println("El valor de dia no es válido. Debe estar entre 1 y 28 por favor");
	        }
		}
		
		
		//para meses de 30 dias
		if(date.getMonth()==4 ||date.getMonth()==6||date.getMonth()==9||date.getMonth()==11) {
			System.out.println("su Mes: "+date.getMonth());
			if (date.getDay() >= 1 && date.getDay()<= 30) {
	            System.out.println("su dia es:"+date.getDay());
	            System.out.println("__________________________");
	        } else {
	            System.out.println("El valor de dia no es válido. Debe estar entre 1 y 31 por favor");
	        }
		}
		
		
		if(date.getMonth()<1||date.getMonth()>12) {
			System.out.println("error de mes, coloco un mes que no existe");
		}
		
		System.out.println(date);
	}

}
