package com.example.vivianle.diningtogo;

/**
 * represents a LinkedListNode
 * @author Linh Le
 *
 */
public class LinkedListNode<T> {
	
	/** a String representation of the node **/
	private T data;
	
	/** the following node being pointed to **/
	private LinkedListNode<T> next;
	
	/**
	 * Get the data stored at this node
	 * @return the data
	 */
	public T getData() {
		
		return data;
	}
	
	/**
	 * Set the data stored at this node
 	 * @param data a new data to store at this node
	 */
	public void setData (T data) {
		
		this.data = data;
	}
	
	/**
	 * Set the next pointer to passed node
	 * @param node the following node
	 */
	public void setNext (LinkedListNode<T> node) {
		
		this.next = node;
	}
	
	/**
	 * Get (pointer to) next node
	 * @return a LLNode
	 */
	public LinkedListNode<T> getNext() {
		
		return next;
	}
	
	/**
	 * returns a String representation of this node
	 * @return a String
	 */
	public String toString() {
		
		return data.toString();
	}
}
