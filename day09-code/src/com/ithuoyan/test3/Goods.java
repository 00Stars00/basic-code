package com.ithuoyan.test3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Goods {
    private String id;
    private String name;
    private double price;
    private int count;
}

