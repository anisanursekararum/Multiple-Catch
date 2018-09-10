/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikummodul5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sekar Arum
 */
public class UjiDemoPraktikum 
    {         
        public static void main(String[] args) throws DemoPraktikum
        {
            try
            {
                System.out.print("Nomor Presensi    = ");
                String nomor;
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                nomor = br.readLine();
                System.out.print("Nama              = ");
                String nama;
                nama = br.readLine();
                System.out.print("Nilai             = ");
                String temp;
                int bilangan = 0;
                temp = br.readLine();
                try
                {
                    bilangan = Integer.parseInt(temp);
                }
                catch (NumberFormatException nfe)
                {
                    System.out.println("Data yang dimasukkan bukan bilangan bulat");
                    System.exit(1);
                }
                catch (IllegalArgumentException e)
                {}
                catch (Exception e)
                {}
                System.out.println("=========DATA NILAI SISWA=========");
                System.out.println("= Nomor   = " + nomor);
                System.out.println("= Nama    = " + nama);
                System.out.println("= Nilai   = " + bilangan);
            }
            catch (IOException ex)
            {
                Logger.getLogger(UjiDemoPraktikum.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
        
    
