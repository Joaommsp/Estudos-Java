public class Usuario {
  public static void main(String[] args) {
    
    SmartTv smartTv = new SmartTv();

    System.out.println("Tv Ligada? " + smartTv.ligada);
    System.out.println("Canal Atual: " + smartTv.canal);
    System.out.println("Volume: " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo Status Tv Ligada? " + smartTv.ligada);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    System.out.println("Novo Status Volume " + smartTv.volume);

    smartTv.mudarCanal(23);
    smartTv.aumentarCanal();
    System.out.println("Canal Atual: " + smartTv.canal);
  }
}
