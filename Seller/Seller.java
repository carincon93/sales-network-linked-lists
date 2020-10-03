package FinancialCompany;

public class Seller {
    String name;
    SellerList SellerList;


    public FinancialCompany(String nameValue, float weightTaxPercentValue, float milesTaxPercentValue, float dogTaxPercentValue, float catTaxPercentValue, float vipDiscountPercentValue, float dayDiscountPercentValue) {
       
        dscountPercent  = dscountPercentValue;

        sellerList = new SellerList();
    }

    void addSeller(Seller seller) {
        sellerList.insert(seller);
    }
}
