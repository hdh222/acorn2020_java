package test.mypac;

public class Sedan extends Car{
	private String modelName;
	private String gasMileage;
	public Sedan(CarInfo carInfo, String modelName, String gasMileage) {
		super(carInfo);
		// TODO Auto-generated constructor stub
		this.modelName = modelName;
		this.gasMileage = gasMileage;
	}
	
	public void ornermodeon() {
		System.out.println("앞좌석을 접는다.");
	}
	
	public void ornermodeoff() {
		System.out.println("앞좌석을 핀다.");
	}
	public String getGasMileage() {
		return gasMileage;
	}
	public String getModelName() {
		return modelName;
	}

}
