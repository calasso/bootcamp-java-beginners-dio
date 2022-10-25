public class User {
  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

    smartTv.downVolume();
    smartTv.downVolume();
    smartTv.downVolume();
    smartTv.upVolume();

    System.out.println("Qual canal está? " + smartTv.channel);

    smartTv.changeChannel(15);
    System.out.println("Qual canal está? " + smartTv.channel);

    System.out.println("Qual volume está? " + smartTv.volume);

    System.out.println("TV esta ligada? " + smartTv.tvOn);

    System.out.println("Qual volume está? " + smartTv.volume);

    smartTv.on();
    System.out.println("Confirmando, a TV esta ligada? " + smartTv.tvOn);

    smartTv.off();
    System.out.println("Confirmando, a TV esta ligada? " + smartTv.tvOn);

  }
}
  
