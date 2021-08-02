package framework.bean;


import java.util.Date;

public class HqStockBasic {

  private String tsCode;
  private String symbol;
  private String name;
  private String area;
  private String industry;
  private String market;
  private Date listDate;


  public String getTsCode() {
    return tsCode;
  }

  public void setTsCode(String tsCode) {
    this.tsCode = tsCode;
  }


  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }


  public Date getListDate() {
    return listDate;
  }

  public void setListDate(java.sql.Date listDate) {
    this.listDate = listDate;
  }

}
