package com.ashutoshmishra.tree.main;

import com.ashutoshmishra.tree.service.FindFirstPairWithMatchingSum;

import com.ashutoshmishra.tree.service.Node;

public class SearchPairDriver {

	public static void main(String[] args) {

		Node root = null;

		FindFirstPairWithMatchingSum findSumPair = new FindFirstPairWithMatchingSum();

		root = findSumPair.insert(root, 40);
		root = findSumPair.insert(root, 20);
		root = findSumPair.insert(root, 60);
		root = findSumPair.insert(root, 10);
		root = findSumPair.insert(root, 30);
		root = findSumPair.insert(root, 50);
		root = findSumPair.insert(root, 70);

		int sumValue = 130;

		findSumPair.findPairWithGivenSum(root, sumValue);
	}
}
