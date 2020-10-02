package Television;
/**The purpose of this class is to model a television.
 * @author Nicolas Fontes de Mello. 
 *@date 10/1/2020
 */
public class Television {

   private String manufacturer; // it will hold the brand's name
   private int screenSize; // this will hold the size of the television's screen
   private boolean powerOn; // will be attribute to the method "power" and will
	// toggle the power between on and off
   private int volume; // it will hold the value of the station that the television is showing
   private int channel; // it will hold the value a number value representing the loudness (0 being
	// no sounds)

   public Television() {

   }

   public Television(String manufacturer, int screenSize) {
       this.manufacturer = manufacturer;
       this.screenSize = screenSize;
       powerOn = false;
       volume = 20;
       channel = 2;
   }

   public void setChannel(int channel) {
       this.channel = channel;
   }

   public void power() {
     this.powerOn = true;
   }

   void increaseVolume() {
       // Assuming max volume is 100
       if (volume != 100) {
           volume++;
       }
   }

   void decreaseVolume() {
       // if volume is zero can not decrement
       if (volume != 0) {
           volume--;
       }
  
  
  }

   public int getChannel() {
       return channel;
   }

   public int getVolume() {
       return volume;
   
   }

   public String getManufacturer() {
       return manufacturer;
   
   
   }

   public int getScreenSize() {
          return screenSize;
   }

}
