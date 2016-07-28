package com.stocker;

/**
 * Created by localadmin on 7/28/16.
 */
public class Stock {
    private String symbol;
    private float price;
    private int shares;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public Stock(String symbol, float price, int shares) {
        this.symbol = symbol;
        this.price = price;
        this.shares = shares;
    }

    public String toString() {
        StringBuffer aBuf = new StringBuffer();
        aBuf.append("Stock:\n");
        aBuf.append("\tSymbol: ");
        aBuf.append(this.symbol);
        aBuf.append("\n");
        aBuf.append("\tPrice: ");
        aBuf.append(this.price);
        aBuf.append("\n");
        aBuf.append("\tShares: ");
        aBuf.append(this.shares);
        return aBuf.toString();
    }
}
