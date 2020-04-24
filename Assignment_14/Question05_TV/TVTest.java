package Assingments.Assignment_14.Question05_TV;

public class TVTest extends TV{

	public static void main(String[] args) {
		
		TV tv = new TV ();
		
		tv.setOn(false);
		
		System.out.println(tv.isOn());
		tv.channelDown();
		tv.channelUp();
		tv.volumeDown();
		tv.volumeUp();
		tv.setVolumeLevel(1);
		System.out.println(tv.getVolumeLevel());
		tv.setChannel(1);
		System.out.println(tv.getChannel());
		
		System.out.println("-------------");
		
		tv.setOn(true);
		System.out.println(tv.isOn());
		tv.setChannel(1);
		System.out.println(tv.getChannel());
		tv.channelUp();
		tv.channelUp();
		System.out.println(tv.getChannel());
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		System.out.println(tv.getVolumeLevel());
	
		System.out.println("-------------");

		tv.setOn(false);
		System.out.println(tv.getChannel());
		
		tv.setBrand("Samsung");
		System.out.println(tv.getBrand());

		

		
		
//		System.out.println(tv.isOn());
//		
//		tv.setChannel(2);
//		System.out.println(tv.getChannel());
//		
//		System.out.println(tv.getVolumeLevel());
//		tv.volumeUp();
//		System.out.println(tv.getVolumeLevel());
		
		

		
	}

}
