package Assingments.Assignment_14.Question05_TV;

public class TV {

	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on = false;
	private String brand = "undefined";

	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
		
	}

	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 Args- constructor");
	}

	public int getVolumeLevel() {
		
		if (on == true) {
			return volumeLevel;
		}
		else {
			return 0;
		}
	}

	public void setVolumeLevel(int volumeLevel) {
		if (on == true) {
		this.volumeLevel = volumeLevel;
		}
		else {
			this.volumeLevel = 0;	
		}
	}

	public int getChannel() {
		if (on == true) {
		 return channel;
		}
		else {
		 return 0;
		}
	}

	public int setChannel(int channel) {
		if (on == true) {
			this.channel = channel;
			return channel;
		} else {
			this.channel = 0;
		}return 0;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	public void setOn(boolean on) {
		this.on = on;
	}

	public void channelUp() {
		if (on == true) {
			channel++;
		} else {
			channel = 0;
		}
		
	}

	public void channelDown() {
		if (on == true) {
			channel--;
		} else {
			channel = 0;
		}
	}
	

	public void volumeUp() {
		if (on == true) {
			volumeLevel++;
		}
		else {
			volumeLevel = 0;
		}
	}

	public void volumeDown() {
		if (on == true) {
			volumeLevel--;
		}
		else {
			volumeLevel = 0;
		}
		
	}
	
	
	public String isOn() {
		
		if (on == true) {
			return "TV is already ON";
		}
		
		else if (on == false){
			return "TV is already OFF";
		}
		else {
			return null;
		}
		
	}
	
	
	public void turnOn() {
		
		if (on == true) {
			System.out.println("TV is already ON");
		}
		
	}
	
	
	public void turnOff() {
		
		if (on == false){
			System.out.println("TV is already OFF");
		}
	}
	
	
	public int channel () {
		if (on == true) {
			if (channel>0 && channel<=120) {
			}
			return channel;
		}
		else {
			System.out.println("ERROR: TV is either OFF or Invalid Channel");
			return 0;
		}
	}
	
	public int volumeLevel () {
		if (on == true) {
			if (volumeLevel>0 && volumeLevel<=7) {	
			}return volumeLevel;
		}
		else {
			System.out.println("ERROR: TV is either OFF or Invalid Volume Level");
			return 0;
		}
	}
	

}
