public class Fogao {
    private String marca;
    private int queimadores;
    private String tipo; // Elétrico ou a gás

    // Construtor padrão
    public Fogao() {
        this.marca = "Atlas";
        this.queimadores = 4;
        this.tipo = "a gás";
    }

    // Construtor com parâmetros
    public Fogao(String marca, int queimadores, String tipo) {
        this.marca = marca;
        this.queimadores = queimadores;
        this.tipo = tipo;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQueimadores() {
        return queimadores;
    }

    public void setQueimadores(int queimadores) {
        this.queimadores = queimadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static void main(String[] args) {
        Fogao fogao1 = new Fogao();
        Fogao fogao2 = new Fogao("Brastemp", 5, "elétrico");

        System.out.println("Fogão 1 é da marca " + fogao1.getMarca());
        System.out.println("Fogão 1 tem " + fogao1.getQueimadores() + " queimadores e é " + fogao1.getTipo());

        fogao1.setMarca("Electrolux");
        fogao1.setQueimadores(6);
        fogao1.setTipo("a gás");

        System.out.println("\nFogão 1 agora é da marca " + fogao1.getMarca());
        System.out.println("Tem " + fogao1.getQueimadores() + " queimadores e é " + fogao1.getTipo());

        System.out.println("\nFogão 2 é da marca " + fogao2.getMarca());
        System.out.println("Tem " + fogao2.getQueimadores() + " queimadores e é " + fogao2.getTipo());
    }
}
