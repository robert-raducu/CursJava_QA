package curs11package3;

public class Mobile extends Product{

	private int tva;
	private int buyingPrice;
	
	public Mobile(int tva, int buyingPrice) {
		//nu ar avea sens this pentru ca imi invalidez getteri si setteri
		setBuyingPrice(buyingPrice);
		setTva(tva);
	}
	
	@Override
	public int calculatePrice() {
		return tva + buyingPrice;
	} //clasa concreta
	
	public int getTva() {
		return tva;
	}

	public int getBuyingPrice() {
		return buyingPrice;
	}

	private void setBuyingPrice(int buyingPrice) {
		//logica de verificare pret
		this.buyingPrice = buyingPrice;
	}

	private void setTva(int tva) {
		//logica de TVA
		this.tva = tva;
	}

}
