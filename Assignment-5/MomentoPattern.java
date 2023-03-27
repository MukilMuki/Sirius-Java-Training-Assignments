package day_5;

/**
 * <p>
 * Memento pattern is used to restore state of an object to a previous state. As
 * your application is progressing, you may want to save checkpoints in your
 * application and restore back to those checkpoints later. Intent of Memento
 * Design pattern is without violating encapsulation, capture and externalize an
 * object’s internal state so that the object can be restored to this state
 * later.
 * </p>
 * 
 * @author mukilan
 */

/**
 * Memento class that holds the memento object with the saved state of the
 * object.
 */
class EditorMemento {
	private final String editorState;

	public EditorMemento(String state) {
		editorState = state;
	}

	public String getSavedState() {
		return editorState;
	}
}

/**
 * Originator class that restores the state of an object by fetching the saved
 * state from memento and sets it to the current state of the object.
 */
class Editor {

	public String editorContents;

	public void setState(String contents) {
		this.editorContents = contents;
	}

	public EditorMemento save() {
		return new EditorMemento(editorContents);
	}

	public void restoreToState(EditorMemento memento) {
		editorContents = memento.getSavedState();
	}
}

public class MomentoPattern {
	public static void main(String args[]) {
		Editor editor = new Editor();
		String firstName = "Mukilan";
		String lastName = "Shanmugasundaram";
		String fullName = firstName + lastName;
		EditorMemento editorMemento = new EditorMemento(fullName);
		System.out.println(fullName);
		editor.save();
		fullName = "Mukilan Shan";
		System.out.println(fullName);
		fullName = editorMemento.getSavedState();
		System.out.println(fullName);

	}
}