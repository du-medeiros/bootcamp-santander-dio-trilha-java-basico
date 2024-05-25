public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal( int novoCanal){
        canal = novoCanal;

    }
    public void aumentarCanal() {
        // aumenta o Canal em +1
        canal++;
    }
    public void diminuirCanal() {
        // diminuir o Canal em +1
        canal--;
    }
    public void aumentarVolume() {
        // aumenta o volume em +1
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        // diminuir o volume em +1
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);

    }

     public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
