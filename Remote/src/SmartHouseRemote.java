
public class SmartHouseRemote {


		  private boolean isOn = false;
		  private int temperature = 22;
		  private int lightLevel = 50; // percentage
		  
		  public void powerOn() {
		    isOn = true;
		    System.out.println("Smart house powered on");
		  }
		  
		  public void powerOff() {
		    isOn = false;
		    System.out.println("Smart house powered off");
		  }
		  
		  public void increaseTemp() {
		    temperature++;
		    System.out.println("Temperature increased to: " + temperature);
		  }
		  
		  public void decreaseTemp() {
		    temperature--;
		    System.out.println("Temperature decreased to: " + temperature);
		  }

		  public void setTemp(int newTemp) {
		    temperature = newTemp;
		    System.out.println("Temperature set to: " + temperature);
		  }
		  
		  public void increaseLight() {
		    lightLevel++;
		    System.out.println("Light level increased to: " + lightLevel);
		  }
		  
		  public void decreaseLight() {
		    lightLevel--;
		    System.out.println("Light level decreased to: " + lightLevel);
		  }

		  public void setLight(int newLevel) {
		    lightLevel = newLevel;
		    System.out.println("Light level set to: " + lightLevel); 
		  }

		}

		public class Main {
		  public static void main(String[] args) {
		    SmartHouseRemote remote = new SmartHouseRemote();
		    remote.powerOn();
		    remote.increaseTemp();
		    remote.setLight(75);
		    remote.decreaseLight();
		    remote.powerOff();
		  }
		}
	}
}
