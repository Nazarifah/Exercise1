//Author: Nazarifah Nazurah Ronzi
//shark subclass, fish superclass
public class Shark extends Fish {
	private int sharpTeeth = 50;

	public void Eat() {
		System.out.println("Eat with " + sharpTeeth + " number or teeth");
	}

	public void SetSharpTeeth(int teeth) {
		sharpTeeth = teeth;
	}
}