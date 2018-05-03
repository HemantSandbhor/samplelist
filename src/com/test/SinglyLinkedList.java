package com.test;

import java.util.Scanner;

public class SinglyLinkedList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList list = new LinkedList();
		System.out.println("Singly Linked List : \n");
		char ch;
		do {
			System.out.println("\nSingly Linked List Operations\n");
			System.out.println("1. add element in list");
			System.out.println("2. delete tail element");
			System.out.println("3. Remove all element in the linkedlist that is great than a target value");
			int choice = scanner.nextInt();
			switch (choice) {
		
			case 1:
				System.out.println("Enter integer element to add in list :");
				if(list.getSize()== 0){
					list.insertAtStart(scanner.nextInt());
				}else{
					list.insertAtEnd(scanner.nextInt());
				}
				break;
			case 2:
				if (list.getSize() > 0){
					System.out.println("Deleted tail element at position "+(list.getSize()));
					list.deleteAtPos(list.getSize());
				}else{
					System.out.println("List is empty, can't delete element");
				}
				break;	
				
			 case 3 : 
                System.out.println("Enter target number to delete other elements :");
                int p = scanner.nextInt() ;
                int[] elementsArr = list.toArray();
                int length = list.getSize();
                for(int i=0;i<length;i++){
                	if(elementsArr[i] > p){
                		int tempCnt = i+1;
                		list.deleteAtPos(tempCnt);
                	}
                }
                break;
			default:
				System.out.println("Wrong Input Given \n ");
				break;
			}
			/* Display List */
			list.display();
			System.out.println("\n To Continue Type 'y' or 'n' to stop \n");
			ch = scanner.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		
		scanner.close();
	}
}