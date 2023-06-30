package day1;

import java.util.Scanner;

public class StackExample {
	
	//parts
	int stack[],tos,Maxsize;
	void createStack(int size) {
		
		//create array
		stack =new int[size];
		//init Maxsize
		Maxsize =size;
		//init tos
		tos =-1;
		
	}
	void push(int e) {
		tos++;
		stack[tos] =e;
	}
	boolean is_Full() {
		if(tos==Maxsize-1) {
			return true;
		}
		return false;
	}
	int pop() {
		int temp =stack[tos]; //copy old data
		tos--;  //reduce tos
		return temp;
	}
	int peek() {
		return stack[tos];
	}
	boolean is_Empty() {
		if(tos==-1) {
			return true;
		}
		return false;
	}
	void printStack() {
		for(int i=tos;i>-1;i--) {
			System.out.println(stack[i]);
		}
	}
	public static void main(String args[]) {
		StackExample obj = new StackExample();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter size of stack");
		int size = sc.nextInt();
		obj.createStack(size);
		do {
			System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Print\n5. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(obj.is_Full()!=true) {
					System.out.println("Enter Element");
					int e = sc.nextInt();
					obj.push(e);
				}else {
					System.out.println("Stack Full");
				}
				break;
			case 2:
				if(obj.is_Empty()!=true) {
					int result = obj.pop();
					System.out.println("Result = "+result);
				}else {
					System.out.println("Stack Empty");
				}
				break;
			case 3:
				if(obj.is_Empty()!=true) {
					int result = obj.peek();
					System.out.println("Result = "+result);
				}else {
					System.out.println("Stack Empty");
				}
				break;
			case 4:
				if(obj.is_Empty()!=true) {
					obj.printStack();
				}else {
					System.out.println("Stack Empty");
				}
				break;
			case 5:
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}while(choice!=5);
	}
}
