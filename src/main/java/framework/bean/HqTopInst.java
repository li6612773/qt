package framework.bean;


import java.util.Date;

public class HqTopInst {

  private Date tradeDate;
  private String tsCode;
  private String exalter;
  private double buy;
  private double buyRate;
  private double sell;
  private double sellRate;
  private double netBuy;
  private double side;
  private String reason;


  public Date getTradeDate() {
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


  public String getExalter() {
    return exalter;
  }

  public void setExalter(String exalter) {
    this.exalter = exalter;
  }


  public double getBuy() {
    return buy;
  }

  public void setBuy(double buy) {
    this.buy = buy;
  }


  public double getBuyRate() {
    return buyRate;
  }

  public void setBuyRate(double buyRate) {
    this.buyRate = buyRate;
  }


  public double getSell() {
    return sell;
  }

  public void setSell(double sell) {
    this.sell = sell;
  }


  public double getSellRate() {
    return sellRate;
  }

  public void setSellRate(double sellRate) {
    this.sellRate = sellRate;
  }


  public double getNetBuy() {
    return netBuy;
  }

  public void setNetBuy(double netBuy) {
    this.netBuy = netBuy;
  }


  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

}
