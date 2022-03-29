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
public class Salary extends Employee  { 
   double salary; 

   public Salary(String nam, double sal)  { 
      super(nam); 
      setSalary(sal); 
   } 
  
   public void setSalary(double s)  { 
      salary = s; 
   } 
  
   public double getSalary()  { 
      return salary; 
   } 
  
   public double pay()  { 
      return salary; 
   } 
  
   public String toString()  { 
      return super.toString() + " (salary is " + salary + ")"; 
   } 

} 
  