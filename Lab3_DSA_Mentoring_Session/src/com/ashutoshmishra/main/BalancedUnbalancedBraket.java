package com.ashutoshmishra.main;

import com.ashutoshmishra.service.BalanceBraketCheck;

public class BalancedUnbalancedBraket {

	public static void main(String[] args) {

		String str = "( [ [ { } ] ] )";
		boolean isBalanced = false;
		BalanceBraketCheck obj1 = new BalanceBraketCheck(str);

		isBalanced = obj1.isStringBalanced(str);

		if (isBalanced)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}
}