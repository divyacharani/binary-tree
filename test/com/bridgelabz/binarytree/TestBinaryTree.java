package com.bridgelabz.binarytree;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBinaryTree {

	@Test
	public void gievn3IntegerswhenAddedShouldReturnSize3() {

		BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		assertEquals(3, size);
	}

}
