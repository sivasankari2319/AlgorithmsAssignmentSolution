package com.greatlearning.stock;

public class Companies {
	
	
int companyNo; 
double stockPrice;
boolean companySharePrice;

public Companies(int companyNo,double stockPrice,boolean companySharePrice)
{
	this.companyNo=companyNo;
	this.stockPrice=stockPrice;
	this.companySharePrice=companySharePrice;
}


public int getCompanyNo() {
	return companyNo;
}
public void setCompanyNo(int companyNo) {
	this.companyNo = companyNo;
}
public double getStockPrice() {
	return stockPrice;
}
public void setStockPrice(double stockPrice) {
	this.stockPrice = stockPrice;
}
public boolean isCompanySharePrice() {
	return companySharePrice;
}
public void setCompanySharePrice(boolean companySharePrice) {
	this.companySharePrice = companySharePrice;
}

}
