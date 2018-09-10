/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikummodul5;

/**
 *
 * @author Sekar Arum
 */
public class DemoPraktikum extends Exception
    {
        private int bilangan;
       //default constructor
       DemoPraktikum(){}
       //constructor dengan parameter bertipe string
       DemoPraktikum (String pesan)
       {
            super(pesan);
       }
       //constructor dengan parameter bertipe string dan int
       DemoPraktikum(String pesan, int nilai)
       {
           super(pesan);
           bilangan = nilai;
       }
       public int getBilangan()
       {
           return bilangan;
       }
    }
