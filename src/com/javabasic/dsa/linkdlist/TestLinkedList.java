package com.javabasic.dsa.linkdlist;

public class TestLinkedList {

	public static void main(String[] args) {
		Node head = new Node(19);
		head.next= new Node(20);
		head.next.next= new Node(30);
		head.next.next.next= new Node(40);
		head.next.next.next.next= new Node(50);
		
		LinkedList list = new LinkedList();
		list.printList(head);
		list.insertFirst(head, 5);
		
		list.printList(list.insertFirst(head, 5));
		System.out.println(list.midElement(head));
		
		
		
		
		System.out.println(list.search(head, 20));
		
		list.printList(list.insertLast(head, 12));
		

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

class LinkedList{
	public  void printList(Node head) {
		Node curr = head;
		while(curr!= null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	public  int search(Node head,int x) {
		Node curr = head;
		int pos=1;
		while(curr!= null) {
			
			if(curr.data==x) {
				return pos;
			}else {
				curr=curr.next;
				pos++;
			}
		
			
		}
		return -1;
		
	}
	
	
	
	public  Node insertFirst(Node head, int x) {
		Node temp = new Node(x);
		temp.next=head;
		return temp;
		
	}
	public  Node insertLast(Node head, int x) {
		Node temp = new Node(x);
		Node curr= head;
		while(curr.next!= null) {
			curr= curr.next;
		}
		curr.next=temp;
		return head;
		
	}
	
	public int midElement(Node head) {
		Node slow =head;
		Node fast =head;
		while(fast.next!=null && fast.next.next!= null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	
	public Node deleteFirst(Node head) {
		if(head.next== null) {
			return null;
		}
		return head.next;
	}
	
	public Node deleteLast(Node head) {
		if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }
		Node curr =head;
		while(curr.next.next!= null) {
			curr= curr.next;
		}
		curr.next= null;
		return head;
	}
}