package com.ashutoshmishra.service;

import java.util.Stack;

public class BalanceBraketCheck {

	String input;

	public BalanceBraketCheck(String str) {
		input = str;
	}

	public boolean isStringBalanced(String str) {

		Stack<Character> element = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			char character = str.charAt(i);

			if (character == '[' || character == '{' || character == '(') {
				element.push(character);
				continue;
			}

			if (element.isEmpty())
				return false;

			char ch;
			switch (character) {
			case ']':

				ch = element.pop();

				if (ch == '{' || ch == '(')
					return false;
				break;

			case '}':

				ch = element.pop();

				if (ch == '[' || ch == '(')
					return false;
				break;

			case ')':

				ch = element.pop();

				if (ch == '[' || ch == '{')
					return false;
				break;

			}
		}
		return (element.isEmpty());
	}
}
