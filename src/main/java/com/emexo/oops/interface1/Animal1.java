package com.emexo.oops.interface1;

public interface Animal1 {
    String ANIMAL_TYPE = "Mammal"; // public, static, final by default

    void move(); // public and abstract by default


   default void food(){
       System.out.println("food");
       privateMethod();
   }

   public  static void getAnimalType(){
       System.out.println("Pet Animal");
   }

   private void privateMethod(){
       System.out.println("private method");
   }
}
