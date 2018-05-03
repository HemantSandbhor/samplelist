package com.test;

class LinkedList {
	protected Element start;
	protected Element end;
	public int size;

	/* Constructor */
	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	/* Function to check if list is empty */
	public boolean isEmpty() {
		return start == null;
	}

	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to insert an element at begining */
	public void insertAtStart(int val) {
		Element nptr = new Element(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			nptr.setLink(start);
			start = nptr;
		}
	}

	/* Function to insert an element at end */
	public void insertAtEnd(int val) {
		Element nptr = new Element(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			end.setLink(nptr);
			end = nptr;
		}
	}

	/* Function to insert an element at position */
	public void insertAtPos(int val, int pos) {
		Element nptr = new Element(val, null);
		Element ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Element tmp = ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size++;
	}

	/* Function to delete an element at position */
	public void deleteAtPos(int pos) {
		if (pos == 1) {
			start = start.getLink();
			size--;
			return;
		}
		if (pos == size) {
			Element s = start;
			Element t = start;
			while (s != end) {
				t = s;
				s = s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		Element ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Element tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}

	/* Function to display elements */
	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
			return;
		}
		Element ptr = start;
		System.out.print(start.getData() + "->");
		ptr = start.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "\n");
	}
	
	/* Function to display elements */
	public int[] toArray() {
		int[] arr = new int[getSize()];
		if (size == 0) {
			System.out.print("empty\n");
			return arr;
		}
		if (start.getLink() == null) {
			arr[0] = start.getData();
			return arr;
		}
		Element ptr = start;
		arr[0] = start.getData();
		ptr = start.getLink();
		int i = 1;
		while (ptr.getLink() != null) {
			arr[i] = ptr.getData();
			i++;
			ptr = ptr.getLink();
		}
		arr[i] = ptr.getData();
		return arr;
	}
	
	
}