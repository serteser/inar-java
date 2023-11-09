package week_09.assignments.Question_09_02;

public class Question_09_02 {
    public static void main(String[] args) {

        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setCurrentPrice(34.35);
        stock.setPreviousClosingPrice(34.5);
        umlForStock(stock);
    }

    public static void umlForStock(Stock s) {
        double p = s.getChangePercent();
        System.out.printf("Stock name  : %s\nStock symbol: %s\nPrice-change percentage: %.15f", s.name, s.symbol, p);
    }
}
