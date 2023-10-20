//1. Input berupa bilangan bulat:

import java.util.Scanner;

class Hello {
 public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int usia;
   System.out.print("Masukkan usia anda: ");
   usia = sc.nextInt();
   System.out.print("Usia anda adalah: " + usia);
 }
}
//Hasil

//Masukkan usia anda: 20
//Usia anda adalah 20

//2. Input berupa dua buah bilangan:

import java.util.Scanner;

class Hello {
 public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int panjang, lebar;
   System.out.print("Masukkan panjang: ");
   panjang = sc.nextInt();
   System.out.print("Masukkan lebar: ");
   lebar = sc.nextInt();
   System.out.print("Nilai dari panjang: " + panjang);
   System.out.print("Nilai dari lebar: " + lebar);
 }
}
//Hasil

//Masukkan panjang: 15
//Masukkan lebar: 7
//Nilai dari panjang: 15
//Nilai dari lebar: 7