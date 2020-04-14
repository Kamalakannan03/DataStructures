package com.lambda.samples;
@FunctionalInterface
public interface FunctionalInt {
public void setUp();
public default void printSetup() {
	System.out.println("trial print");
}
}
