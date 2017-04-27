package domen;


// BMI = (Weight in Kilograms / (Height in Meters x Height in Meters)) * 10000
public class BodyMassIndex {
	private int id;
	private double bmiValue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBmiValue() {
		return bmiValue;
	}
	public void setBmiValue(double height, double weight) {
		this.bmiValue = (weight / (height*height)) * 10000;
	}
	
	

}
