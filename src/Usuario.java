public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV tv = new SmartTV();
        
        tv.ligar();
        tv.avancarCanal();
        tv.alterarCanal(23);
        tv.desligarVolume();
        // tv.desligar();

        if(tv.ligada == false){
            System.out.println("A TV está desligada.");
            System.exit(0);
        } else {
            System.out.println("Canal atual: " + tv.canal);
            System.out.println("Volume: " + tv.volume);
        }
    }
}
