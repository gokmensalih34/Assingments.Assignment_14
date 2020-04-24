package Assingments.Assignment_14.Question12_Phone;

public class CameraPhone extends Phone{
	
	
	int imageSize;
	int memorySize;
	
	public CameraPhone (int imageSize, int memorySize) {
		this.imageSize = imageSize;
		this.memorySize = memorySize;
		
	}

	public int numPictures () {
		int numPics = memorySize/imageSize*1000;
		return numPics;
	}
}
