package com.aypc.composite;

//File implements the "lowest common denominator"
public class File implements AbstractFile {
	private String name;

	public File(String name) {
		this.name = name;
	}

	public void ls() {
		System.out.println(CompositeDemo.compositeBuilder + name);
	}
}