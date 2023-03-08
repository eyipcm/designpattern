package com.aypc.behavioral.mediator4;

import javax.swing.*;

import com.aypc.behavioral.mediator4.components.*;
import com.aypc.behavioral.mediator4.mediator.Mediator;
import com.aypc.behavioral.mediator4.mediator.Editor;

// https://refactoring.guru/design-patterns/mediator
public class MediatorDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Mediator mediator = new Editor();

		mediator.registerComponent(new Title());
		mediator.registerComponent(new TextBox());
		mediator.registerComponent(new AddButton());
		mediator.registerComponent(new DeleteButton());
		mediator.registerComponent(new SaveButton());
		mediator.registerComponent(new List(new DefaultListModel()));
		mediator.registerComponent(new Filter());

		mediator.createGUI();
	}
}
