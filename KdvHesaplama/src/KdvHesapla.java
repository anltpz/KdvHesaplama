
public class KdvHesapla implements KdvHesaplaService{

	
	double tutar;
	double kdv;
	@Override
	public void hesapla() {
		
		double kdvtutar =this.tutar*this.kdv;
		double kdvlitutar=kdvtutar+this.tutar;
		System.out.println("kdvsiz tutar:"+this.tutar);
		System.out.println("Kdvli tutar"+kdvlitutar);
		System.out.println("kdv oraný:"+kdvtutar);
		
	}
	public KdvHesapla(double tutar, double kdv) {
		super();
		this.tutar = tutar;
		this.kdv = kdv;
	}
	public KdvHesapla() {
		super();
	}
	public KdvHesapla(double tutar) {
		super();
		this.tutar = tutar;
	}
	
	
}
