package com.zy.mode;

import java.util.Scanner;

public class Goods
{
    public Goods(Scanner input)
    {
        System.out.print("请输入商品名称：");
        this.name = input.next();
        System.out.print("请输入商品价格：");
        this.price = input.nextDouble();
        System.out.print("请输入商品库存：");
        this.stock = input.nextInt();
    }
    /** 商品名称*/
    private String name;
    /** 商品价格*/
    private double price;
    /** 商品库存*/
    private int stock;
    public String getInfo(int i)
    {
        return "编号：" + (i + 1) + "\t商品名称：" + this.name + "\t商品价格：" + this.price + "\t商品库存" +this.stock;
    }

}
