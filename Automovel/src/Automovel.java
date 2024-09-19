public class Automovel {
    private String modelo;
    private int ano;
    private String tipoCombustivel; // gasolina, elétrico, diesel, etc.

    // Construtor padrão
    public Automovel() {
        this.modelo = "Fiat Uno";
        this.ano = 2020;
        this.tipoCombustivel = "gasolina";
    }

    // Construtor com parâmetros
    public Automovel(String modelo, int ano, String tipoCombustivel) {
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public static void main(String[] args) {
        Automovel auto1 = new Automovel();
        Automovel auto2 = new Automovel("Chevrolet Onix", 2021, "elétrico");

        System.out.println("Automóvel 1 é um " + auto1.getModelo() + " do ano " + auto1.getAno() + " e usa " + auto1.getTipoCombustivel());

        auto1.setModelo("Honda Civic");
        auto1.setAno(2019);
        auto1.setTipoCombustivel("gasolina");

        System.out.println("\nAutomóvel 1 agora é um " + auto1.getModelo() + " do ano " + auto1.getAno() + " e usa " + auto1.getTipoCombustivel());

        System.out.println("\nAutomóvel 2 é um " + auto2.getModelo() + " do ano " + auto2.getAno() + " e usa " + auto2.getTipoCombustivel());
    }
}
