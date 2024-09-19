public class Geladeira {
	
	private String marca;
	private int modelo;
	private boolean temFreezer;

	Geladeira() {

		marca = "Electrolux";
		modelo = 590;
		temFreezer = true;

	}

	Geladeira(String m, int c, boolean t) {

		marca = m;
		modelo = c;
		temFreezer = t;

	}

	public String getMarca() {

		return marca;
	
	}

	public void setMarca(String marca) {
	
		this.marca = marca;
	
	}

	public int getModelo() {
	
		return modelo;
	
	}

	public void setModelo(int modelo) {
	
		this.modelo = modelo;
	
	}

	public boolean getFreezer() {
	
		return temFreezer;
	
	}

	public void setFreezer(boolean temFreezer) {
	
		this.temFreezer = temFreezer;
	
	}
	
	public static void main(String args[]) {
		
		Geladeira ge1 = new Geladeira();
		Geladeira ge2 = new Geladeira(new String("Gambiarra"), 22, false);
		
		System.out.println("A marca da ge1 é " + ge1.getMarca());
		System.out.println("A marca da ge2 é " + ge2.getMarca());
		
		ge1.setMarca("Brastemp");
		ge1.setModelo(69);
		ge1.setFreezer(true);
		
		System.out.println("\n A geladeira ge1 é " + ge1.getMarca());
		System.out.println("Do modelo " + ge1.getModelo());
		System.out.println("Têm freezer? " + ge1.getFreezer());
		
		ge2.setMarca("Bosch");
		ge2.setModelo(24);
		ge2.setFreezer(false);
		
		System.out.println("\n A geladeira ge2 é " + ge2.getMarca());
		System.out.println("Do modelo " + ge2.getModelo());
		System.out.println("Têm freezer? " + ge2.getFreezer());
	
	}

}