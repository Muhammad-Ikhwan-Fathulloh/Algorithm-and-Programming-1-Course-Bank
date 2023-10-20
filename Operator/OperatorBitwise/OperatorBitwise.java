int a = 60; //ubah ke biner 00111100
int b = 13; //ubah ke biner 00001101
int c = 0;

/*      00111100
        00001101
a & b = 00001100*/

c = a & b;
System.out.println(c); //hasilnya 12

/*      00111100
        00001101
a | b = 00111101*/

c = a | b;
System.out.println(c); //hasilnya 61

/*      00111100
        00001101
a ^ b = 00110001*/

c = a ^ b;
System.out.println(c); //hasilnya 49

/*   00111100
!a = 11000011*/

c = ~a;
System.out.println(c); //hasilnya -61

/*       00111100
a << 2 = 11110000*/

c = a << 2;
System.out.println(c); //hasilnya 240

/*       00111100
a << 2 = 00001111*/

c = a >> 2;
System.out.println(c); //hasilnya 15
c = a >>> 2;
System.out.println(a >>> 2); //hasilnya 15