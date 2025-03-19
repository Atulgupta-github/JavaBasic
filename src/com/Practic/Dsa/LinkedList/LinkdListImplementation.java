package com.Practic.Dsa.LinkedList;

public class LinkdListImplementation {
	public static void main(String [] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next= new Node(23);
		printList(head);
		System.out.println("firstinsertion");
		head=insertFist(head, 5);
		printList(head);
		System.out.println("lastinsertion");
		head= insertLast(head, 29);
		printList(head);
		System.out.println("Print Mid element");
		System.out.println(findMidElement(head));
		System.out.println("dELETE FIRST");
		head = deleteFirst(head);
		printList(head);
		System.out.println("DElete last");
		head= deleteLast(head);
		printList(head);
		
		
		
		
		
	}
	
	public static void printList(Node head) {
		Node curr =head;
		while(curr!= null) {
			System.out.println(curr.data);
			curr= curr.next;
		}
	}
	
	
	public static Node insertFist(Node head,int x) {
		Node temp = new Node(x);
		temp.next=head;
		return temp;
	}
	
	public static Node insertLast(Node head, int x) {
		Node curr =head;
		Node temp = new Node(x);
		while(curr.next!= null) {
			curr= curr.next;
		}
		curr.next=temp;
		return head;
	}
	
	public static Node deleteFirst(Node head) {
		return head.next;
	}
	
	public static Node deleteLast(Node head) {
		Node curr =head;
		while (curr.next.next!= null) {
			curr= curr.next;
		}
		curr.next= null;
		return head;
	}
	
	public static int findMidElement(Node head) {
		Node slow=head;
		Node fast =head;
		while(fast.next!= null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}

}
class Node{
	int data;
	Node next;
	Node(int x){
		data =x;
		next = null;
	}
}