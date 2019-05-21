package com.vektorel;

import java.util.Scanner;

public class Runner2 {

	public static void main(String[] args) {
		
		do {
			System.out.println("Lütfen Deger Giriniz..:");
			Scanner sc = new Scanner(System.in);
			try {
			int secim = sc.nextInt();
			}catch(Exception ex) {
				System.out.println("Olmadı. Sayı degeri gir lütfen");
			}
		}while(true);
		

	}

}
