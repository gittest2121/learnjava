public class MainEng {

    public static void main(String[] args) {
	Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1l 86-91");
	System.out.println(engine.getEngineType());
	System.out.println(engine.getManufacturer());
    }
}
