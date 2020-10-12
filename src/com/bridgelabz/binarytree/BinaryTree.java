package com.bridgelabz.binarytree;

public class BinaryTree<K extends Comparable<K>> {
	private BinaryNode<K> root;

	// To add an element
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
		if (current == null)
			return new BinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0)
			current.left = addRecursively(current.left, key);
		if (compareResult > 0)
			current.right = addRecursively(current.right, key);
		return current;
	}

	// To get size of tree
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(BinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	// To search a given key()
	public boolean searchKey(K key) {
		return this.searchRecursively(root, key);
	}

	private boolean searchRecursively(BinaryNode<K> current, K key) {
		if (current == null) {
			return false;
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return true;
		}
		if (compareResult < 0) {
			return (searchRecursively(current.left, key));
		}
		if (compareResult > 0) {
			return (searchRecursively(current.right, key));
		}
		return false;
	}
}
