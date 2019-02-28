package ua.lviv.iot.pharmacy.managers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.pharmacy.goods.GoodsOfPharmacy;

public class PharmacyWriter {
    public static void writeToFile(List<GoodsOfPharmacy> pharmacy)
            throws IOException {
        
        File myFile = new File("Pharmacy Goods");
        try (FileOutputStream fos = new FileOutputStream(myFile);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bufWriter = new BufferedWriter(osw);) {
            
            for (int i = 0; i < pharmacy.size(); i++) {
                
                bufWriter.write(pharmacy.get(i).getHeaders() + "\n");
                bufWriter.write(pharmacy.get(i).toCSV() + "\n" + "\n");
            }
        } finally {
            System.out.println("Information is written");
        }
    }
}
