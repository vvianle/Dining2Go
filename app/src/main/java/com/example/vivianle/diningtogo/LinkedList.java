package com.example.vivianle.diningtogo;
/**
 * represents a Linked List
 * @author Linh Le
 *
 */
public class LinkedList<T> {

	/** the first LLNode of the List **/
	private LinkedListNode<T> head;

	/**
	 * Get data stored in head node of list.
	 * @return a generic type
	 */
	public T getFirst() {

		// if the list is not empty
		if (!isEmpty())

			// return data of first node
			return getFirstNode().getData();

		// otherwise
		return null;
	}

	/**
	 * Get the head node of the list.
	 * @return the first LLNode
	 */
	public LinkedListNode<T> getFirstNode() {

		// return the head
		return this.head;
	}

	/**
	 * Get data stored in last node of list.
	 * @return a generic type
	 */
	public T getLast() {

		// if the list is not empty
		if (!isEmpty())

			// return data of last node
			return getLastNode().getData();

		// otherwise
		return null;
	}

	/**
	 * Get the tail node of the list.
	 * @return the last LLNode
	 */
	public LinkedListNode<T> getLastNode() {

		// if the list is empty
		if (isEmpty())
			// return null
			return null;

		// otherwise
		else {
			// initialize a new node represents the last node
			// first set it to the first node
			LinkedListNode<T> lastNode = getFirstNode();

			// if it is not the last node
			while (lastNode.getNext() != null) {

				// set the lastNode to the following node
				lastNode = lastNode.getNext();
			}
			// return lastNode
			return lastNode;
		}
	}

	/**
	 * Insert a new node with data at the head of the list.
	 * @param data of first node
	 */
	public void insertFirst( T data ) {

		// create a new LLNode
		LinkedListNode<T> node = new LinkedListNode<T>();

		// set its data
		node.setData(data);

		// set the first node to follow node
		node.setNext(getFirstNode());

		// set node to be the head
		this.head = node;
	}

	/**
	 * Insert a new node with data after currentNode
	 * @param currentNode the node points to the new node
	 * @param data of the new node
	 */
	public void insertAfter( LinkedListNode<T> currentNode, T data ) {

		// create a new LLNode
		LinkedListNode<T> node = new LinkedListNode<T>();

		// set its data
		node.setData(data);

		// set the pointer of node to the node following currentNode
		node.setNext(currentNode.getNext());

		// set the pointer of currentNode to node
		currentNode.setNext(node);
	}

	/**
	 * Insert a new node with data at the end of the list.
	 * @param data of new node created
	 */
	public void insertLast( T data ) {

		// if the list is empty
		if (isEmpty())

			// add a node to the head of the list
			insertFirst(data);

		// otherwise
		else {
			// create a new LLNode
			LinkedListNode<T> node = new LinkedListNode<T>();

			// set its data
			node.setData(data);

			// initialize a new node represents the last node
			// first set it to the first node
			LinkedListNode<T> lastNode = getFirstNode();

			// if it is not the last node
			while (lastNode.getNext() != null) {

				// set the lastNode to the following node
				lastNode = lastNode.getNext();
			}
			// set pointer of lastNode to node
			lastNode.setNext(node);
		}
	}

	/**
	 * Remove the first node
	 */
	public void deleteFirst() {

		// if the first node exists
		if(this.head != null)

			// make the following node the head
			this.head = this.head.getNext();
	}

	/**
	 * Remove the last node
	 */
	public void deleteLast() {
		
		// if the list is not empty
		if (!isEmpty()) {

			// initialize a new node represents the last node
			// first set it to the first node
			LinkedListNode<T> lastNode = getFirstNode();

			// if it is not the last node
			while (lastNode.getNext() != null) {

				// if the node after it is the last node
				if (lastNode.getNext().getNext() == null)

					// set lastNode to point to be the last node
					lastNode.setNext(null);
				// otherwise
				else
					// set the lastNode to the following node
					lastNode = lastNode.getNext();
			}
		}
	}

	/**
	 * Remove node following currentNode
	 * If no node exists (i.e., currentNode is the tail), do nothing
	 * @param currentNode a node points to the node being deleted
	 */
	public void deleteNext( LinkedListNode<T> currentNode ) {

		// if the currentNode is not the lastNode
		if(currentNode.getNext() != null )

			// delete the following node of currentNode
			currentNode.setNext(currentNode.getNext().getNext());
	}

	/**
	 * Return the number of nodes in this list.
	 * @return an int
	 */
	public int size() {

		// an int to keep track of size
		int size = 0;

		// initialize a node to keep track of the node counted
		LinkedListNode<T> currentNode = getFirstNode();

		// while currentNode exists
		while (currentNode != null) {

			// increment size
			size++;

			// set currentNode to be the following node
			currentNode = currentNode.getNext();
		}
		// return size
		return size;
	}

	/**
	 * Check if list is empty.
	 * @return true if list contains no items.
	 */
	public boolean isEmpty() {

		// if the list is empty
		if (getFirstNode() == null)

			// return true
			return true;

		// otherwise, return false
		return false;
	}

	/**
	 * Return a String representation of the list.
	 * @return a String
	 */
	public String toString() {

		// a String representation of list
		String str = "";

		// a node keeping track of the node counted
		LinkedListNode<T> currentNode = getFirstNode();

		// if currentNode is not empty
		while (currentNode != null) {

			// if currentNode is not the last node
			if (currentNode.getNext() != null)

				// compile data of node into str
				str += currentNode.getData().toString() + " -> ";

			// otherwise
			else
				// compile data of node into str
				str += currentNode.getData().toString();

			// set currentNode to be the next node
			currentNode = currentNode.getNext();
		}

		// return the string representation
		return str;
	}
}
