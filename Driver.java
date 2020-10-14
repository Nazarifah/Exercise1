//Author: Nazarifah Nazurah Ronzi
public class Driver {

	public static void main(String[] arg) {
		//Fish actually data type
		//Fish nemo; == int x;
		Fish nemo = new Fish(); //nemo adalah objek, Fish adalah class

		nemo.Swim();
		//nemo.color = "red"; //tukar value
		nemo.SetColor("red");
		nemo.Swim();
		//nemo.Eat(); //superclass call subclass method - not possible

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();

		//Fish dory = new Fish();
		//dory.Swim();
		//dory.color = "yellow";
		//dory.SetColor("yellow");
		//dory.Swim();

		//Aquirium fancyAquirium = new Aquirium();
		//fancyAquirium.fillFish();

	}
}