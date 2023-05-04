package com.aypc.structural.composite;

import java.util.ArrayList;


//Composite
//Directory implements the "lowest common denominator"
public class Directory implements AbstractFile {
	private ArrayList includedFiles = new ArrayList();   // Container has leaves or other containers
	private String name;

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
