package com.designpatterns.behaviour.chainofresponibility;

public interface DispenseChain {

void setNextChain(DispenseChain nextChain);

void dispense(Currency cur);
}


