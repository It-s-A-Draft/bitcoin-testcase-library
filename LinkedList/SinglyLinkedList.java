/**
* A class that models a SinglyLinkedList with add(), addByIndex(), removeByElement(),
* removeByIndex(), and toString() methods. A SinglyLinkedList "knows" only its head node.
* It contains an inner Node class. A Node object "knows" only its data (e.g., an int in this case)
* and the next node.
*
* @author	Kevin Murphy
* @version	11/12/2019
*/
public class SinglyLinkedList {

	private String listName;
	private Node head;
	private static int counter;

	public SinglyLinkedList(String listName) {
		this.listName = listName;
		this.head = null;
	}

	/**
	* Adds an element to the end of the list.
	*
	* @param	int 	element
	*/
	public void add(int element) {
		// Node newNode = new Node(element);

		if (head == null) {
			//Provide implementation where element is added at the head node.
			this.head = new Node(element);
		}
		else {
			Node temp = new Node(element);
			//Provide implementation where element is added to a list that is not empty.
			//One way is to make the head node the tail node and "iterate" through by
			//making the tail node's next node the new tail and then assigning the new
			//node as the tail node's next node.
			Node current = this.head;
			while(current.getNext() != null) {
				current = current.getNext();
				counter++;
			}
			current.setNext(temp);
		}
	}

	/**
	* Adds an element to the list at a specified index.
	*
	* @param 	int 	index
	* @param	int 	element
	*/
	public void addByIndex(int index, int element) {
		int printIndex = index;
		Node temp = new Node(element);
		Node current = head;

		//Provide implementation where the index at which to add an element is 0.
		if (index == 0) {
			this.head = new Node(element);
			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element " + element + " was added at index " + index + ".");
		}

		else {
			//Provide implementation where the index at which to add an element is greater than 0.
			// crawl to the requested index or the last element in the list, whichever comes first
			for (int i = 0; i < index && current.getNext() != null; i++) {
				current = current.getNext();
			}

			Node newNode = new Node(element);
			temp.setNext(current.getNext());

			current.setNext(temp);

			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element " + element + " was added at index " + printIndex + ".");
		}
	} // end addByIndex() method

	/**
	* Removes an element from the list.
	*
	* @param	int 	element
	*/
	public void removeByElement(int element) {
		Node current = this.head;
		Node previous = null;

		if(current != null && current.data == element) {

			//Provide implementation when removing the element from the head.
			// current.data = element;
			this.head.data = element;

			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element " + element + " was found and removed.");
		} else {
			while(current != null && current.data != element) {

				//Provide implementation to "iterate" through your linked list.
				previous = current;
				current = current.next;
			}
			//If element was found, then it is at the current node.  Remove it.
			if (current != null) {

				//Provide implementation to remove the desired element--e.g., the current node.
				//element = current;
				previous.next = current.next;
				//KEEP THIS LINE TO PRINT RESULT!
				System.out.println("Element " + element + " was found and removed.");
			}
			//If element was not found, then the current node should be null.
			if (current == null) {
				//KEEP THIS LINE TO PRINT RESULT!
				System.out.println("Element " + element + " was not found.");
			}
		}
	}

	/**
	* Removes an element specified by index from the list.
	*
	* @param	int 	index
	*/



	public void removeByIndex(int index) {
		Node current = this.head;
		Node previous = null;

		if (index == 0 && current != null) {

			//Provide implementation where the index from which to remove is 0.
			for (int i = 0; i < index - 2; i++) {
				current = current.getNext();
			}
			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element at index " + index + " removed.");
		} else {
			int counter = 0;

			while(current != null) {
				if (counter == index) {

					//Provide implementation to remove the element from the specified index.
					current.setNext(current.getNext());
					//KEEP THIS LINE TO PRINT RESULT!
					System.out.println("Element at index " + index + " removed.");
					break;
				} else {

					//Continue "iterating" through your linked list and increment the counter.
					counter++;
				}
			}
			//If the element at the specified index was found, then it should be at the current node.
			if (current == null) {
				//KEEP THIS LINE TO PRINT RESULT!
				System.out.println("The element at index " + index + " was not found.");
			}
		}
	}

	@Override
	public String toString() {
		String list = "LinkedList: ";
		Node current = this.head;

        while (current != null) {
            list = list + current.data + " ";
            current = current.next;
        }
		return list + "\n";
	}

	public class Node {

		private int data;
		private Node next;

		public Object getData() {
			return data;
		}
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		public Node getNext() {
			return this.next;
		}
		public void setNext(Node node) {
			this.next = node;
		}
	}
}
