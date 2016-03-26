package inheritance;

public class main {

	public static void main(String[] args) {
		
		ImportedCar c1= new ImportedCar();
		c1.name="wagonr";
		
		c1.runMode="auto";
		c1.importFrom("Germany");
		
		IndianCar c2=new IndianCar();
		c2.economy="yes";
		
		

	}

}
