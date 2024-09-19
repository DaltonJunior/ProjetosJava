public class TelevisorComDVD {
    private int canal;
    private String tamanho;
    private String modelo;
    
    // Construtor padrão
    public TelevisorComDVD() {
        canal = 55;
        tamanho = "25 polegadas";
        modelo = "PHILCO";
    }
    
    // Construtor com parâmetros
    public TelevisorComDVD(int canal, String tamanho, String modelo) {
        this.canal = canal;
        this.tamanho = tamanho;
        this.modelo = modelo;
    }

    // Métodos de controle do DVD
    public String eject() {
        return "Eject ativado";
    }

    public String play() {
        return "Função Play ativada";
    }

    public String stop() {
        return "Função Stop ativada";
    }

    public String pause() {
        return "Função Pause ativada";
    }
    
    // Getters e Setters
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        TelevisorComDVD tvdvd1 = new TelevisorComDVD();
        
        System.out.println("O modelo do TelevisorComDVD é " + tvdvd1.getModelo());
        System.out.println("Canal atual: " + tvdvd1.getCanal());
        System.out.println("Tamanho da TV: " + tvdvd1.getTamanho());
        
        // Testando as funções do DVD
        System.out.println(tvdvd1.eject());
        System.out.println(tvdvd1.stop());
        System.out.println(tvdvd1.play());
        System.out.println(tvdvd1.pause());
    }
}
