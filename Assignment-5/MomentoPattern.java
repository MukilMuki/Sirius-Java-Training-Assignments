package day_5;

import java.util.Scanner;
import java.util.Stack;

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
	Stack<EditorMemento> states = new Stack<>();
	private final String content;

	public EditorMemento(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void save(EditorMemento state) {
		states.push(state);
	}

	public void revert(Editor editor) {
		if (!states.isEmpty())
			editor.restore(states.pop());
	}
}

/**
 * Originator class that restores the state of an object by fetching the saved
 * state from memento and sets it to the current state of the object.
 */
class Editor {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public EditorMemento createState() {
		return new EditorMemento(getContent());
	}

	public void restore(EditorMemento state) {
		content = state.getContent();
	}

}

public class MomentoPattern {
	public static void main(String args[]) {
		try (Scanner scan = new Scanner(System.in)) {
			var editor = new Editor();
			EditorMemento editorMemento = new EditorMemento("");
			;
			boolean flag = true;
			boolean entryFlag = true;
			String retrieve = "yes";
			while (flag == true) {

				System.out.println("Enter firstname");
				String firstName = scan.nextLine();
				System.out.println("Enter lastname");
				String lastName = scan.nextLine();
				String fullName = firstName + lastName;
				System.out.println("Full name is " + fullName);
				editorMemento.save(editor.createState());
				editor.setContent(fullName);
				while (entryFlag == true) {
					System.out.println("retrieve the last state: yes or no?");
					retrieve = scan.nextLine();
					if (retrieve.equals("yes")) {
						editorMemento.revert(editor);
						if (editor.getContent() != null) {
							System.out.print("Restored previous state is: ");
							System.out.println(editor.getContent());
						} else
							System.out.println("Cannot revert! This is the last state");
					} else if (retrieve.equals("no"))
						break;
					else
						continue;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
