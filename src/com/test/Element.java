package com.test;

class Element {
	protected int data;
	protected Element link;

	public Element() {
		link = null;
		data = 0;
	}

	public Element(int d, Element n) {
		data = d;
		link = n;
	}

	public void setLink(Element n) {
		link = n;
	}

	public void setData(int d) {
		data = d;
	}

	public Element getLink() {
		return link;
	}

	public int getData() {
		return data;
	}
}