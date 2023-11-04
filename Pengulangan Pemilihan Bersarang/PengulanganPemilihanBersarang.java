package com.mycompany.learnalgorithm;

/**
 *
 * @author Ikhwan
 */
public class LearnAlgorithm {

    public static void main(String[] args) {
        record Person(String code, String name, int age, int health, String[] hobbies) {}
        
        Person[] people = new Person[5];
        String[] hobbies = {"Tulis", "Baca"};
        people[0] = new Person("001", "Takno", 16, 1, hobbies);
        people[1] = new Person("002", "Tikno", 17, 0, hobbies);
        people[2] = new Person("003", "Tukno", 17, 1, hobbies);
        people[3] = new Person("004", "Tokno", 15, 0, hobbies);
        people[4] = new Person("005", "Tekno", 17, 1, hobbies);
        
        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].name);
            System.out.println(people[i].code);
            if(people[i].age >= 17){
                System.out.println("Sudah bisa nyoblos");
                if(people[i].health == 1){
                    System.out.println("Silahkan nyoblos, anda sehat");
                }else if(people[i].health == 0){
                    System.out.println("Maaf belum bisa nyoblos, anda tidak sehat");
                }
            }else{
                System.out.println("Belum bisa nyoblos");
            }
            
            System.out.println("Hobi : ");
            for(int j = 0;j < people[i].hobbies.length; j++){
                System.out.print(people[i].hobbies[j]);
                System.out.print(", ");
            }
            System.out.println();
        }
    }
}