package com.aypc.creational.factory;

public class DecodedImage {
	private String image;

	public DecodedImage(String image) {
		    this.image = image;
		}

	@Override
	public String toString() {
		return image + ": is decoded";
	}
}
