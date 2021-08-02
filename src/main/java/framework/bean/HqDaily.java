package framework.bean;


import java.util.Date;

public class HqDaily {

  private String tsCode;
  private Date tradeDate;
  private double open;
  private double high;
  private double low;
  private double close;
  private double preClose;
  private double change;
  private double pctChg;
  private double vol;
  private double amount;


  public String getTsCode() {
    return tsCode;
  }

  public void setTsCode(String tsCode) {
    this.tsCode = tsCode;
  }


  public Date getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(java.sql.Date tradeDate) {
    this.tradeDate = tradeDate;
  }


  public double getOpen() {
    return open;
  }

  public void setOpen(double open) {
    this.open = open;
  }


  public double getHigh() {
    return high;
  }

  public void setHigh(double high) {
    this.high = high;
  }


  public double getLow() {
    return low;
  }

  public void setLow(double low) {
    this.low = low;
  }


  public double getClose() {
    return close;
  }

  public void setClose(double close) {
    this.close = close;
  }


  public double getPreClose() {
    return preClose;
  }

  public void setPreClose(double preClose) {
    this.preClose = preClose;
  }


  public double getChange() {
    return change;
  }

  public void setChange(double change) {
    this.change = change;
  }


  public double getPctChg() {
    return pctChg;
  }

  public void setPctChg(double pctChg) {
    this.pctChg = pctChg;
  }


  public double getVol() {
    return vol;
  }

  public void setVol(double vol) {
    this.vol = vol;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

}
