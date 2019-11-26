class Car{
	private double speed;
	private String name;
	public Car( double speed, String name ){
		this.speed = speed;
		this.name = name;
	}
	public double getSpeed(){
		return speed;
	}
	public void setSpeed( double speed){
		this.speed = speed;
	}
	public String getName(){
		return name;
	}
	public Car getCar(){
		return this;
	}	
}

public class ThisDemo{
	public static void main(String[]args){
		Car c1 = new Car(70.0, "Merc");
		Car c2 = new Car(80.0, "Car2");
		System.out.println("c1 "+ c1.getName() +" speed "+ c1.getSpeed());
		c1 = c2.getCar();
		System.out.println("c2 "+ c2.getName() +" speed "+ c2.getSpeed());
		c1.setSpeed(90.0);
		System.out.println("c2 "+ c2.getName() +" speed "+ c2.getSpeed());
	}
}

