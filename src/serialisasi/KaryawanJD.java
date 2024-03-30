package serialisasi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.Serializable;
/**
 *
 * @author PF429
 */
public class KaryawanJD implements Serializable {
    String nama;
    double gaji;
    
    public KaryawanJD(String name, double salary){
        this.nama = name;
        this.gaji = salary;
    }
    
    @Override
    public String toString(){
        return "\r\nNama="+ nama + "\r\nGaji" + gaji + "\r\n";
    }
    
}
