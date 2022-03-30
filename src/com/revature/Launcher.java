package com.revature;

import java.io.PrintStream;
import java.util.Scanner;

public class Launcher { 
public static void main(String[] args) {
	Scanner Scan = new Scanner(System.in);
	String[] Batch = {"Xavery", "Tia", "Terrell","Chad","Adrienne","Josh M","Samantha","Peyton","Perry","Melba","Rabin","Jacob","Kokou","Rakan","Valorie","Josh D","Timothy","You","Dillon","Tyler","Michael","Matthew","Jeremy"};
	System.out.println("Hey Ben");
	System.out.println("How many people are you going to be causing pain?");
	int size;
	size = Scan.nextInt();
	for(int i = 0; i <= size - 1;i++) {
		System.out.println("Victim #" + (i+1) + " " + Batch[(int) (Math.random()*23)]);
	}
	
	


}}
