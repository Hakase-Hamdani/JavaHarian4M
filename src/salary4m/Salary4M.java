/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salary4m;
import penggajian.*;

/**
 *
 * @author Administrator 10
 */
public class Salary4M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        karyawan myobj = new karyawan();
        //myobj.setGolongan("Golongan 3");
        //myobj.setMasaKerja(7);
        //myobj.setStatus("Menikah");
        //myobj.setTunjAnak(2);
        
        System.out.println("Gaji Total "+ myobj.GajiTotal("Golongan 1", "Menikah", 3, 2));
     
    }
    
}
