import com.stocker.Stock;
import com.sun.glass.ui.SystemClipboard;
import com.sun.tools.javac.file.SymbolArchive;
import com.sun.tools.javac.tree.JCTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by localadmin on 7/28/16.
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Stock> stocks = new ArrayList<>();
        Stock s1 = new Stock("ALL", 68.0f, 100);
        Stock s2 = new Stock("AAPL", 98.0f, 50);
        Stock s3 = new Stock("GOOG", 78.0f, 20);
        stocks.add(s1);
        stocks.add(s2);
        stocks.add(s3);
    // Map

        Float[] total1 = stocks.stream().map(n -> n.getShares() * n.getPrice()).toArray(size -> new Float[size]);
        List<Float> total2 = stocks.stream()
                .map(n -> n.getShares() * n.getPrice())
                .collect(Collectors.toList());
        ArrayList<Float> total3 = stocks.stream()
                .map(n -> n.getShares() * n.getPrice())
                .collect(Collectors.toCollection(ArrayList::new));
        Float[] total4 = stocks.stream().map(n -> n.getShares() * n.getPrice()).toArray(Float[]::new);
    //Filter

        Stock[] stock2 = stocks.stream().filter(stock -> stock.getSymbol() == "ALL").toArray(Stock[]::new);
    //Reduce

        float totalsum = stocks.stream().parallel()
                .reduce(0f, (t, stock) -> {
                return t + (stock.getPrice() * stock.getShares());
                },(total, value) -> {
                    return total + value;
                });

        System.out.println("totalsum: " + totalsum);
    }
}
