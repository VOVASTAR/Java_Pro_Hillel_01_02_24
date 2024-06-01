package homework.hw9;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class MainProduct {

    public static void main(String[] args) {
        LocalDate currentDay = LocalDate.now();

        Shop shop = new Shop();
        List<Product> shopItems = shop.getShopItems();
        shopItems.add(new Product("Book", 100, true, currentDay, 1));
        shopItems.add(new Product("Book", 250, false, currentDay.minusDays(3), 2));
        shopItems.add(new Product("Book", 165, true, currentDay.minusDays(1), 3));
        shopItems.add(new Product("Book", 59, true, currentDay.minusDays(5), 4));
        shopItems.add(new Product("Book", 333, true, currentDay.minusDays(4), 5));
        shopItems.add(new Product("Book", 242, true, currentDay.minusMonths(4), 6));
        shopItems.add(new Product("Book", 444, false, currentDay.minusMonths(5), 7));
        shopItems.add(new Product("Toy", 500, true, currentDay.minusDays(7), 8));
        shopItems.add(new Product("Toy", 599, false, currentDay.minusDays(2), 9));
        shopItems.add(new Product("Toy", 350, true, currentDay.minusDays(3), 10));

        List<Product> book = shop.filterByTypeAndPrice("Book", 250);
        System.out.println(book);

        System.out.println(shop.getProductWithDiscount("Book", 10));
        System.out.println(book);

        Product minPrice = shop.minProductPrice("Book");
        System.out.println(minPrice);

        System.out.println(shop.threeLastAddedProduct());

        System.out.println(shop.totalFilteredProductAmount(LocalDate.of(2024, 1, 1), "Book", 200));

        Map<String, List<Product>> groupingByType = shop.groupingByType();
        System.out.println(groupingByType);
    }
}
