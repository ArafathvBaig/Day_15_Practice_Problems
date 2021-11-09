package com.Day_15_Hash_Table;

public class MyLinkedList<K> 
{
	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList() 
	{
		this.head = null;
		this.tail = null;
	}
	  
    public void add(INode<K> myNode) 
    {       
    	if(this.tail == null)
    	{
    		this.tail = myNode;  
    	}
        if(this.head == null) 
        {     
            this.head = myNode;    
        }    
        else 
        {    
        	INode<K> tempNode = this.head;
            this.head = myNode;
            this.head.setNext(tempNode);
        }  
    }    
    
    public void append(INode<K> myNode)
    {
    	if(this.tail == null)
    	{
    		this.tail = myNode;  
    	}
        if(this.head == null) 
        {     
            this.head = myNode;    
        }    
        else 
        {    
        	this.tail.setNext(myNode);
            this.tail = myNode;            
        }  
	}
    
    //popFirst() will pop the first node of list and return it
    public INode<K> popFirst()
    {
    	INode<K> tempNode = this.head;
    	this.head = tempNode.getNext();
    	return tempNode;
    }
    
  //popLast() will pop the last node of list and return it
    public INode<K> popLast()
    {    	
    	INode<K> tempNode = head;
    	while(!tempNode.getNext().equals(tail))
    	{
    		tempNode = tempNode.getNext();
    	}
    	this.tail = tempNode;
    	tempNode = tempNode.getNext();
    	return tempNode;
    }
    
    //search will search the list for the data provided
    public INode<K> search(K key)
    {
    	INode<K> tempNode = head;
    	while((tempNode != null) && (tempNode.getNext() != null))
    	{
    		if(tempNode.getKey().equals(key))
    		{
    			return tempNode;
    		}
    		tempNode = tempNode.getNext();
    	}
    	return null;
    }
    
    public void printMyNodes() 
    {
    	System.out.println("My Nodes: "+ head);
    }
    
    public String toString()
    {
    	return "MyLinkedListNodes{" + head + '}';
    }
}
