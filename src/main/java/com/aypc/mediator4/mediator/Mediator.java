package com.aypc.mediator4.mediator;

import javax.swing.*;

import com.aypc.mediator4.components.Component;
import com.aypc.mediator4.components.*;

public interface Mediator {
	void addNewNote(Note note);

	void deleteNote();

	void getInfoFromList(Note note);

	void saveChanges();

	void markNote();

	void clear();

	void sendToFilter(ListModel listModel);

	void setElementsList(ListModel list);

	void registerComponent(Component component);

	void hideElements(boolean flag);

	void createGUI();
}
