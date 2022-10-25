public class SmartTv {
  boolean tvOn = false;
  int channel = 1;
  int volume = 25;

  public void changeChannel(int newChannel) {
    channel = newChannel;
    System.out.println("Aumentando volume para: " + volume);
  }

  public void upChannel() {
    channel++;
    System.out.println("Subindo canal para: " + volume);
  }

  public void downChannel() {
    channel--;
    System.out.println("Descendo canal para: " + volume);
  }

  public void upVolume() {
    volume++;
    System.out.println("Aumentando volume para: " + volume);
  }

  public void downVolume() {
    volume--;
    System.out.println("Diminuindo volume para: " + volume);
  }

  public void on() {
    tvOn = true;
  }

  public void off() {
    tvOn = false;
  }

}
  
