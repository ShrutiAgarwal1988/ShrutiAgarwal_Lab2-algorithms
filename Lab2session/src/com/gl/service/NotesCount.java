package com.gl.service;

public class NotesCount {
		public void notesCountImplementation(int noteArray[], int amt) {

			int[] noteCount = new int[noteArray.length];
			
			try {
				for (int i = 0; i < noteArray.length; i++) {
					if (amt >= noteArray[i]) {
						noteCount[i] = amt / noteArray[i];
						amt = amt - noteCount[i] * noteArray[i];
					}}
				if (amt > 0) {
					System.out.println("exact amount cannot be given with the highest denomination");
				} else {
					System.out.println("Your payment approach in order to give min no of notes will be");
					for (int i = 0; i < noteArray.length; i++) {
						if (noteCount[i] != 0) {
							System.out.println(noteArray[i] + ":" + noteCount[i]);
						}
					}
				}
			} catch (ArithmeticException e) {
				System.out.println(e+ " notes of denomination 0 is invalid");
			}
		}
	}

