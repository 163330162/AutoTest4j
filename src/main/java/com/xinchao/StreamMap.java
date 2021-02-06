package com.xinchao;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMap {

        public static void main(String[] args) {
            List<Item> items = Arrays.asList(
                    new Item("apple", 10, new BigDecimal(23.5)),
                    new Item("apple", 20, new BigDecimal(32.5)),
                    new Item("orange", 30, new BigDecimal(13.9)),
                    new Item("orange", 20, new BigDecimal(32.5)),
                    new Item("orange", 10, new BigDecimal(63.5)),
                    new Item("orange", 50, new BigDecimal(41.5)),
                    new Item("peach", 20, new BigDecimal(26.5)),
                    new Item("peach", 30, new BigDecimal(32.5)),
                    new Item("peach", 40, new BigDecimal(24.5)),
                    new Item("peach", 10, new BigDecimal(12.5)),
                    new Item("peach", 11, new BigDecimal(12.5))
            );
            // 分组
            Map<BigDecimal, List<Item>> groupByPriceMap = items.stream().collect(Collectors.groupingBy(Item::getPrice));
            System.out.println(groupByPriceMap);

            // 分组 转化List->Set
            Map<BigDecimal, Set<String>> result = items.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName , Collectors.toSet())));
            Map<String, Long> result1 = items.stream().map(Item::getName).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(result);
            System.out.println(result1);

            items.parallelStream().forEach(item -> System.out.println(items.contains(item) + Thread.currentThread().getName()));

            System.out.println(items.size());

        }

}


 class Item {

    private String name;

    private int qty;

    private BigDecimal price;

    public Item() {
    }

    public Item(String name, int qty, BigDecimal price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}