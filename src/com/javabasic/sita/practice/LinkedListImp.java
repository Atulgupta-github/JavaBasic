package com.javabasic.sita.practice;

public class LinkedListImp {
	public static void main(String [] args) {
		Node head =new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		
		printList(head);
		
		head = instertionFirst(head, 5);
		printList(head);
		head = insertionLast(head, 35);
		printList(head);
		head= deleteFirst(head);
		printList(head);
		head = deleteLast(head);
		printList(head);
		System.out.println(midelemet(head));
		
	}
	
	
	public static void printList(Node head) {
		Node curr= head;
		while(curr!= null) {
			System.out.println(curr.data);
			curr= curr.next;
		}
	}
	
	public static Node instertionFirst(Node head, int x) {
		Node temp = new Node(x);
		temp.next =head;
		return temp;
	}
	
	public static Node insertionLast(Node head , int x) {
		Node temp= new Node(x);
		Node curr= head;
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
		Node curr = head;
		while(curr.next.next!= null) {
			curr= curr.next;
				
		}
		curr.next= null;
		return head;
	}
	
	public static int midelemet(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!= null && fast.next!= null) {
			slow=slow.next;
			fast= fast.next.next;
		}
		return slow.data;
	}
}

class Node{
	int data;
	Node next;
	Node(int x){
		data=x;
		next = null;
	}
}