package com.bridgelabz.binarytree;

public class BinaryNode<K extends Comparable<K>> {
	K key;
	BinaryNode<K> left;
	BinaryNode<K> right;

	// Constructors
	public BinaryNode(K key) {
		super();
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
