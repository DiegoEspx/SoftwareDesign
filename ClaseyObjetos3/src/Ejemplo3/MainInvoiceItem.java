package Ejemplo3;

public class MainInvoiceItem {
	public static void main(String[]args) {
		//String id, String desc, int qty, double unitPrice
		InvoiceItem itemone=new InvoiceItem("1234","papas",3,2000);
		
		System.out.println("Descripcion item 1: ");
		System.out.println("ID: "+itemone.getId() );
		System.out.println("Desc: "+itemone.getDesc() );
		System.out.println("Cantidad: "+itemone.getQty() );
		System.out.println("Precio unitario: "+itemone.getUnitPrice() );
		System.out.println("Total: "+itemone.getTotal() );
	}
}
