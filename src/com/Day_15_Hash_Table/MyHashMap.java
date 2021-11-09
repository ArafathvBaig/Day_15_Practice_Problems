package com.Day_15_Hash_Table;

public class MyHashMap<K, V>
{
	MyLinkedList<K> MyLinkedList;
	public MyHashMap()
	{
		this.MyLinkedList = new MyLinkedList<>();
	}
	
	public V get(K key)
	{
		MyMapNode<K, V> MyMapNode = (MyMapNode<K, V>) this.MyLinkedList.search(key);
		return (MyMapNode == null) ? null : MyMapNode.getValue();
	}
	
	public void add(K key, V value)
	{
		MyMapNode<K, V> MyMapNode = (MyMapNode<K, V>) this.MyLinkedList.search(key);
		if(MyMapNode == null)
		{
			MyMapNode = new MyMapNode<> (key, value);
			this.MyLinkedList.append(MyMapNode);
		}
		else 
		{
			MyMapNode.setValue(value);
		}
	}
	
	public String toString()
	{
		return "MyHashMapNodes(" + MyLinkedList + '}';
	}
			
}
