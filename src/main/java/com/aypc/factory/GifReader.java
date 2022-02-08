package com.aypc.factory;

public class GifReader implements ImageReader {
	private DecodedImage decodedImage;

	public GifReader(String image) {
	    this.decodedImage = new DecodedImage(image);
	}

	@Override
	public DecodedImage getDecodeImage() {
	    return decodedImage;
	}
}
