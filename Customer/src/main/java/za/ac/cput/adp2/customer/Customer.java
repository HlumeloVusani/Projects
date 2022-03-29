/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2.customer;

import java.io.*;

import java.util.ArrayList;

/**
 *
 * @author 218247370
 */
public class Customer {

    public static void writeFile(String fileName, ArrayList<String> data) {
        try {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < data.size(); i++) {

            pw.println(data.get(i));
        }
            pw.close();

        } catch (IOException e) {
            System.out.println("Error - Cannot write to file" + fileName);

        }
    }

    public static void main(String[] args) {
        ArrayList<String> tr = new ArrayList<String>();
        tr.add("Cashflow");
        tr.add("Cashflow");
        tr.add("Cashflow");
        tr.add("Cashflow");
        tr.add("Cashflow");

        for (int i = 0; i < tr.size(); i++) {

            System.out.println(tr.get(i));
        }
        
    }
}
