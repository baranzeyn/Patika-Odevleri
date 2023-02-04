
public class Main {

	public static void main(String[] args) {
		Fighter f1= new Fighter("Tyler", 15, 100, 90, 55);
		Fighter f2=new Fighter("Dylan", 20, 100, 95, 50);
		Match match=new Match(f1, f2, 90, 100);
		match.run();
	}

}
