package edu.hillel.homework.hw9;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {

    private List<Product> shopItems = new ArrayList<>();

    public List<Product> filterByTypeAndPrice(String type, double price) {
        return shopItems.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() >= price)
                .toList();
    }

    public List<Product> getProductWithDiscount(String type, double discount) {
        List<Product> shopItemWithDiscount = new ArrayList<>();
        for (Product item : shopItems) {
            shopItemWithDiscount.add(item.clone());
        }

        return shopItemWithDiscount.stream()
                .filter(product -> product.getType().equals(type))
                .filter(Product::isDiscount)
                .map(product -> {
                    product.setPrice(product.getPrice() * (1 - discount / 100));
                    return product;
                })
                .toList();
    }

    public Product minProductPrice(String type) {
        return shopItems.stream()
                .filter(product -> product.getType().equals(type))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new NoSuchElementException("Products are absent in category: " + type));
    }

    public List<Product> threeLastAddedProduct() {
        return shopItems.stream()
                .sorted(Comparator.comparing(Product::getDate).reversed())
                .limit(3)
                .toList();
    }

    public double totalFilteredProductAmount(LocalDate dateFrom, String type, double price) {
        return shopItems.stream()
                .filter(product -> product.getDate().isAfter(dateFrom))
                .filter(product -> product.getType().equals(type))
                .map(Product::getPrice)
                .filter(productPrice -> productPrice < price)
                .reduce(0.0, Double::sum);
    }

    public Map<String, List<Product>> groupingByType() {
        return shopItems.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

    public List<Product> getShopItems() {
        return shopItems;
    }

}
