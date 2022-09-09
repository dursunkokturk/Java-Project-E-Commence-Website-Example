
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products product1 = new Products(1,"Lenovo V14",15000,"16 GB Ram",10);
		
		// Parametresiz Constructor Kullanarak Parametre Gonderme Islemini 
		// Degisken Adi Uzerinden Yapariz
		Products product2 = new Products();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(16000);
		product2.setDetail("16 GB");
		product2.setDiscount(10);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Products product3 = new Products();
		
		Categories category1 = new Categories();
		category1.setId(1);
		category1.setName("Drink");
		
		Categories category2 = new Categories();
		category2.setId(2);
		category2.setName("Food");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());

	}
}