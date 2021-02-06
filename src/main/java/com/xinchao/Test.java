package com.xinchao;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        /**
         * 				BigDecimal price = BigDecimal.valueOf(lowestPrice).multiply(BigDecimal.valueOf(propertyPercentage)).multiply(BigDecimal.valueOf(0.008));
         * 				map.put("propertyPrice",price.setScale(5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toPlainString());
         */
        BigDecimal price =  BigDecimal.valueOf(0.25).multiply(BigDecimal.valueOf(50)).multiply(BigDecimal.valueOf(0.008));
        System.out.println(price.setScale(5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toPlainString());

    }
}
