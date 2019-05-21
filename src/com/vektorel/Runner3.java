package com.vektorel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner3 {

	public static void main(String[] args) {
		do {
			islem();
		}while(true);
	}

	
	public static void islem() {
		
		System.out.println("Bölücek Sayı..:");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("SİSTEM AÇILDI");
		double sayi = sc.nextInt();

		double bolum = sayi/5;
		
		System.out.println("Sonuç....: "+bolum);
		
		}catch(InputMismatchException ex) {
			System.out.println("Rakam Gir");
		
		}catch(ArithmeticException ex) {
			System.out.println("'0' Sıfır a bölme hatası");
		}catch(Exception ex) {
			System.out.println("Sistemde Beklenmeyen bir hata oluştu.");
			System.out.println("Lütfen Yazılımcınız ile ileitişime geçiniz.");
			System.err.println(ex.toString());
		}finally {
			System.out.println("SİSTEM KAPANDI");
		}
		
		//InputMismatchException
		//ArithmeticException
	}
}
