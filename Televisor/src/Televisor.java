public class Televisor {
       private int canal;
       private String tamanho;
       private String modelo;

       Televisor() { 
              canal = 4;
              tamanho = "15 polegadas";
              modelo = "SEMP TOSHIBA";
       }

       Televisor(int c,String t,String m) { 
              canal = c;
              tamanho = t;
              modelo = m;
       }      

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


       public static void main(String[] args) {
		   	Televisor tv1 = new Televisor();
		    Televisor tv2 = new Televisor(10,new String("10 polegadas"),new String("Gradiente"));
		    
		    System.out.println("O objeto tv1 é " + tv1.getModelo());
		    System.out.println("O objeto tv2 é " + tv2.getModelo());
		    
		    tv1.setModelo("SAMSUNG");
		    tv1.setCanal(5);
		    tv1.setTamanho("70 polegadas");
		    
		    System.out.println("O objeto tv1 agora é " + tv1.getModelo());
		    System.out.println("O objeto tv1 está no canal " + tv1.getCanal());
		    System.out.println("O objeto tv1 tem " + tv1.getTamanho());
		
		}



}
