package framework.bean;


public class HqTopList {

  private java.sql.Date tradeDate;
  private String tsCode;
  private String name;
  private double close;
  private double pctChange;
  private double turnoverRate;
  private double amount;
  private double lSell;
  private double lBuy;
  private double lAmount;
  private double netAmount;
  private double netRate;
  private double amountRate;
  private double floatValues;
  private String reason;


  public java.sql.Date getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(java.sql.Date tradeDate) {
    this.tradeDate = tradeDate;
  }


  public String getTsCode() {
    return tsCode;
  }

  public void setTsCode(String tsCode) {
    this.tsCode = tsCode;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getClose() {
    return close;
  }

  public void setClose(double close) {
    this.close = close;
  }


  public double getPctChange() {
    return pctChange;
  }

  public void setPctChange(double pctChange) {
    this.pctChange = pctChange;
  }


  public double getTurnoverRate() {
    return turnoverRate;
  }

  public void setTurnoverRate(double turnoverRate) {
    this.turnoverRate = turnoverRate;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public double getLSell() {
    return lSell;
  }

  public void setLSell(double lSell) {
    this.lSell = lSell;
  }


  public double getLBuy() {
    return lBuy;
  }

  public void setLBuy(double lBuy) {
    this.lBuy = lBuy;
  }


  public double getLAmount() {
    return lAmount;
  }

  public void setLAmount(double lAmount) {
    this.lAmount = lAmount;
  }


  public double getNetAmount() {
    return netAmount;
  }

  public void setNetAmount(double netAmount) {
    this.netAmount = netAmount;
  }


  public double getNetRate() {
    return netRate;
  }

  public void setNetRate(double netRate) {
    this.netRate = netRate;
  }


  public double getAmountRate() {
    return amountRate;
  }

  public void setAmountRate(double amountRate) {
    this.amountRate = amountRate;
  }


  public double getFloatValues() {
    return floatValues;
  }

  public void setFloatValues(double floatValues) {
    this.floatValues = floatValues;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

}
