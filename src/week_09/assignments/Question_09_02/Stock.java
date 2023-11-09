package week_09.assignments.Question_09_02;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock() {

    }

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent() {
        return (currentPrice - previousClosingPrice) * 100 / previousClosingPrice;
    }

    void setPreviousClosingPrice(double newPreviousClosingPrice) {
        previousClosingPrice = newPreviousClosingPrice;
    }

    void setCurrentPrice(double newSetCurrentPrice) {
        currentPrice = newSetCurrentPrice;
    }
}
