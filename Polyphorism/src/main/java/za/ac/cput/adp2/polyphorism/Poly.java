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
public class Poly {
    public static final int MAX_EMPLOYEES = 10; 

   public static double payIncrease(Employee emp, double amt){
		return amt += emp.pay();
   }

   public static void main(String[] args)  { 
      Employee employee1 = new Hourly("Dussen Mata", 55.00, 3.5);
      Employee employee2 = new Salary("Isabelle Ringin", 10000);
      
//      Employee employee2 = new Employee("Mike Rohsoft");
      System.out.println("employee1:  " + employee1.toString());
      System.out.println("employee2:  " + employee2);
      System.out.println("employee1 pay:  " + employee1.pay());
      System.out.println("employee2 pay:  " + employee2.pay());
 
      
      
      Employee[] employees = new Employee[MAX_EMPLOYEES]; 
  
      int emp = 0; 
      employees[emp++] = new Hourly("Jay Shee", 75.00, 10.5); 
      employees[emp++] = new Salary("Stu Padasol", 125.00); 
      employees[emp++] = new Hourly("Maxie Dlamini", 785.00, 3.0); 
      employees[emp++] = new Salary("Kulio Roberts", 150.00); 
      employees[emp++] = new Hourly("Aletta Bezuidenhout", 65.00, 2.0); 
  
      for (int i = 0; i < emp; ++i)  { 
         System.out.println("employee:  " + employees[i]); 
         System.out.println("pay:  " + employees[i].pay()); 
         System.out.println(); 
      } 
      
      
      Employee emp1 = new Hourly("Jimmy Jungle", 20.00, 2); 
      System.out.println("Employee "+ emp1.getName()+ " new salary:R"+Poly.payIncrease(emp1, 100));
   } 
    
}
