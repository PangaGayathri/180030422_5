package wtn;

public class Encapsulation1 {

	private String bname;
	private String bauthor;
	private double price;
	private int qty;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
class Book {

	public static void main(String[] args) {
		
		Encapsulation1 b=new Encapsulation1();
	     b.setBname("Don Quixote");
	     b.setBauthor("Miguel de Cervantes");
	     b.setPrice(1000.50);
	     b.setQty(100);
	     System.out.println("Book Name="+b.getBname());
	     System.out.println("Book Author="+b.getBauthor());
	     System.out.println("Book Price="+b.getPrice());
	     System.out.println("Book Qty="+b.getQty());
		}

}
