package com.Day_15_Hash_Table;

public interface INode<K>
{
	K getKey();
	void setKey(K key);
	
	INode<K> getNext();
	void setNext(INode<K> next);
}
