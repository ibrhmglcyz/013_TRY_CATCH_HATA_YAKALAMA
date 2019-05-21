package com.vektorel;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("Lütfen Seçiniz..:");
		Scanner sc = new Scanner(System.in);
		int secim =99;
		try {
			
		secim = sc.nextInt();
		
		}catch(Exception ex) {
		
			System.out.println("Lütfen Rakamsal Değer Girin.");
		}	
		
		if(secim==1) {
			System.out.println("Aferin");
			
		}
		else if(secim==99) {
			System.out.println("ÇIKTIN....");
		}

	}

}
