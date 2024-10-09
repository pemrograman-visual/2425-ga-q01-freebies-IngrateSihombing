// 12S24015-LucasPardede
// 12S24022-IngrateJoySihombing
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double bookprice, totalprice, lowestprice, totaltransaction;

        bookprice = Double.parseDouble(input.nextLine());
        totalprice = bookprice;
        lowestprice = bookprice;
        while (bookprice != 0) {
            if (lowestprice < bookprice) {
                lowestprice = lowestprice;
            } else {
                lowestprice = bookprice;
            }
            bookprice = Double.parseDouble(input.nextLine());
            totalprice = totalprice + bookprice;
        }
        if (totalprice >= 100) {
            totaltransaction = totalprice - lowestprice;
        } else {
            totaltransaction = totalprice;
        }
        System.out.println(toFixed(totaltransaction,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
