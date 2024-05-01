public class SmartTV {
    boolean ligada = false;
    int volume = 50;
    int canal = 11;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void desligarVolume(){
        volume--;
    }

    public void avancarCanal(){
        canal++;
    }

    public void voltarCanal(){
        canal--;
    }

    public void alterarCanal(int novoCanal){
        canal = novoCanal;
    }
}
