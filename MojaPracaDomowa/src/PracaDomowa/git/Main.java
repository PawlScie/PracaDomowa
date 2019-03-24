package PracaDomowa.git;

import java.util.Random;

public class Main {
		public static void bubbleSort(int x[]) {
				for (int j = 0; j < x.length - 1; j++) {
				for (int i = 0; i < x.length - 1; i++) {
				if (x[i] > x[i + 1]) {
				
				int temp = x[i];
				x[i] = x[i + 1];
				x[i + 1] = temp;
					}
				}
			}
		
		System.out.print("Oto Twoja posortoawna tablica: ");
				for(int i=0; i<x.length; i++){
			System.out.print(x[i]+" ");
			}
		}
		public static void main(String[] args) {
		
		 int suma = 0;
		 byte wyk = 100;
		 int cc = 0;
		 int aa = 0;
		 int c = 0 ;
		 int min = 0;
		 int max = 0;
		
		Random randomGen = new Random(); 
		int[] arr = new int[wyk]; 
		System.out.print("Wyniki z tablicy: ");
		for (int i = 0; i < wyk; i++) {
			arr[i] = randomGen.nextInt(10);

				if(i < wyk-1) {
					System .out.print(arr[i] + ", ");
				}
				else {
					System .out.print(  arr[i]);}
			cc++; 
			aa= aa + arr[i];
			}
		
		System .out.println();
		
		for (int i=1; i < 10; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Najmniejszy element w tablicy to " + min);
		 

		for (int i=1; i<10; i++) {
		if (max < arr[i]) {
			max = arr[i];
			}
		}

		System.out.println("Najwiekszy element w tablicy to " + max);
		
		System .out.println("Suma elementów tablicy " + aa);
		
	for (int a=0 ; a < 10; a++) {
		for (int i=0; i<arr.length; i++){
			if (c==arr[i]){
			suma++;
			}
		}
		System.out.println("Element " + c +" wystêpuje "+suma+" razy");
		c++;
		suma = 0;
			}
		
		bubbleSort(arr);
		}
	}
	
