package framework.interfacedefine;

import java.util.Date;

public interface TradeProvider {
    public abstract void buy(Date buyDate,double buyPrice);
    public abstract void sell(Date sellDate,double sellPrice);
}
