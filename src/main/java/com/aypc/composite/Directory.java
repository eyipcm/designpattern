package com.aypc.composite;

import java.util.ArrayList;

//Directory implements the "lowest common denominator"
public class Directory implements AbstractFile {
	private String name;
	private ArrayList includedFiles = new ArrayList();

	public Directory(String name) {
		this.name = name;
	}

	public void add(Object obj) {
		includedFiles.add(obj);
	}

	public void ls() {
		System.out.println(CompositeDemo.compositeBuilder + name);
		CompositeDemo.compositeBuilder.append("   ");
		for (Object includedFile : includedFiles) {
			// Leverage the "lowest common denominator"
			AbstractFile obj = (AbstractFile) includedFile;
			obj.ls();
		}
		CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
	}
}
