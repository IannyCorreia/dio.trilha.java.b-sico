public class SmartTv {
    boolean ligada = false;
    int volume = 10;
    int canal = 8;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal = canal - 2;
    }
    public void mudarCanal(int canalNovo){
        canal = canalNovo;
    }
}
