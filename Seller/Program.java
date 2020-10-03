package InterJet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        String[] dataSeller;

        FinancialCompany gov = new FinancialCompany();

        BufferedReader bf = new BufferedReader(new FileReader("financial-company.txt"));

        int qtyCompanies = Integer.parseInt(bf.readLine());

        for(int i=0; i<qtyCompanies; i++) {
            dataSeller = bf.readLine().split(",");
            Seller seller = new seller(dataSeller[0],Float.parseFloat(dataSeller[1]),Float.parseFloat(dataSeller[2]),Float.parseFloat(dataSeller[3]),Float.parseFloat(dataSeller[4]),Float.parseFloat(dataSeller[5]), Float.parseFloat(dataSeller[6]));
            
            gov.addSeller(seller);
        }

        // 6. Total 
        float total = company.getTotal();
        System.out.println("Total: " + total);
    }
}
