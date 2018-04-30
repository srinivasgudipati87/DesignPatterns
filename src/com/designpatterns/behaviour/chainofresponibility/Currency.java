package com.designpatterns.behaviour.chainofresponibility;

public class Currency {
	private int amount;

	public Currency(int amt) {
		this.amount = amt;

	}

	public int getAmount() {
		return this.amount;
	}
}
