package com.Practic.webee;

public class LinkedListImp {
	public static void main(String args[]) {
		Node head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(15);
		
		printLinkedList(head);
		
		Node head1= insertFirst(head, 2);
		
		Node head2= insertLast(head, 20);
		printLinkedList(head2);
		
		
	}
	public static void printLinkedList(Node head) {
		Node curr =head;
		while(curr!= null) {
			System.out.println(curr.data);
			curr= curr.next;
		}
	}
	
	
	public static Node insertFirst (Node head, int x) {
		Node temp = new Node(x);
		temp.next=head;
		return temp;
	}	
	
	
	public static Node insertLast(Node head , int x) {
		Node temp = new Node(x);
		Node curr = head;
		while(curr.next!= null) {
			curr= curr.next;
		}
		curr.next=temp;
		return head;
	}
	public Node deleteFitst(Node head) {
		return head.next;
	}
	
	public Node deleteLatNode(Node head) {
		Node curr = head;
		while(curr.next.next!= null) {
			curr=curr.next;
		}
		curr.next= null;
		return head;
	}

}
class Node {
	Node next;
	int data;
	Node(int x){
		data=x;
		next= null;
	}
}