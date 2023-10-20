int x = 5;
int y = 10;

// Operator Perbandingan
boolean lebihBesar = x > y;
boolean lebihKecil = x < y;
boolean samaDengan = x == y;

System.out.println("Apakah x lebih besar dari y? " + lebihBesar); // Apakah x lebih besar dari y? false
System.out.println("Apakah x lebih kecil dari y? " + lebihKecil); // Apakah x lebih kecil dari y? true
System.out.println("Apakah x sama dengan y? " + samaDengan); // Apakah x sama dengan y? false

// Operator Logika
boolean hasilLogika = (x > 3) && (y < 15);
System.out.println("Hasil dari (x > 3) && (y < 15): " + hasilLogika); // Hasil dari (x > 3) && (y < 15): true