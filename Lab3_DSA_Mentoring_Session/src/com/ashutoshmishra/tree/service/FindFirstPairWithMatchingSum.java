package com.ashutoshmishra.tree.service;

import java.util.HashSet;

public class FindFirstPairWithMatchingSum {

	public Node insert(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.data)
			root.left = insert(root.left, key);
		else if (key > root.data)
			root.right = insert(root.right, key);
		return root;
	}

	public boolean findPair(Node root, int sumValue, HashSet<Integer> set) {
		if (root == null)
			return false;

		if (findPair(root.left, sumValue, set))
			return true;

		if (set.contains(sumValue - root.data)) {
			System.out.println("Pair is found (" + (sumValue - root.data) + ", " + root.data + ")");
			return true;
		} else
			set.add(root.data);

		return findPair(root.right, sumValue, set);
	}

	public void findPairWithGivenSum(Node root, int sumValue) {
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findPair(root, sumValue, set))
			System.out.print("Pairs do not exit" + "\n");
	}
}
