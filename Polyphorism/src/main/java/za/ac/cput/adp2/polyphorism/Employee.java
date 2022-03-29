/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2.polyphorism;

/**
 *
 * @author 218247370
 */
 public abstract class Employee { 
   private String name; 

   public Employee(String name)  { 
      setName(name); 
   } 
   public String getName()  { 
      return name; 
   } 
  
   private void setName(String nm)  { 
      name = nm; 
   } 
    
   public abstract double pay();//does absolutely nothing
   

   @Override
   public String toString()  { 
      return "name is " + name; 
   } 
  
} 