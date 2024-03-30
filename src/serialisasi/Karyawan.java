package serialisasi;

import java.io.Serializable;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PF429
 */
public class Karyawan implements Serializable {
    
    private String id;
    private String nama;
    private List<KaryawanJD> jobs;
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setItems(List<KaryawanJD> jobs) {
        this.jobs = jobs;
    }
    
    @Override
    public String toString() {
        String karywan, job = "";
        karywan = "karyawan: \r\n"
                 + "Id=" + id + "\r\n"
                 + "Nama=" + nama + "\r\n"
                 + "=======================\r\n"
                 + "Job Desk:\r\n";
        job = jobs.stream().map((obj) -> 
    obj.toString()).reduce(job, String::concat);
        return karywan + job;
        }
}
