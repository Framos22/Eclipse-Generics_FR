package main;
import linkedlist.Node;
import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;
import linkedlist.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

        GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
        GenericNode<Integer> intNode1 = new GenericNode<>();
        intNode1.setData(22);
        integerList.addNode(intNode1);

        GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
        GenericNode<Double> doubleNode1 = new GenericNode<>();
        doubleNode1.setData(15.0);
        doubleList.addNode(doubleNode1);

        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        GenericNode<String> stringNode1 = new GenericNode<>();
        stringNode1.setData("Hello New World");
        stringList.addNode(stringNode1);

        System.out.println("Integer List: " + integerList.getList().getData());
        System.out.println("Double List: " + doubleList.getList().getData());
        System.out.println("String List: " + stringList.getList().getData());
        
	}//end main

}//end class
