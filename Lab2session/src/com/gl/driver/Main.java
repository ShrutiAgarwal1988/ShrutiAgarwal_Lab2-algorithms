package com.gl.driver;
import com.gl.service.MergeSortImplementation;
import com.gl.service.NotesCount;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] noteArray = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			noteArray[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amt = sc.nextInt();
		mergeSortImplementation.sort(noteArray,0,noteArray.length-1);
		notesCount.notesCountImplementation(noteArray,amt);
	}
}