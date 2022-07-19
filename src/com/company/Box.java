package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Box  {
    int money = 0;
    private   Integer price;
    private  String name;

    public Box(Integer price, String name) {
        this.price = price;
        this.name = name;
    }
    public String getName(){return name;}

    public Integer getPrice() {
        return price;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Box box = (Box) o;
//        return Objects.equals(price, box.price) && Objects.equals(name, box.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(price, name);
//    }

    @Override
    public String toString() {
        return String.format("[%s] \t %-10s  ", price,name);
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

}
