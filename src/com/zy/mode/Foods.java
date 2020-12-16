package com.zy.mode;

import java.util.Scanner;

public class Foods extends Goods
{

    public Foods(Scanner input)
    {
        super(input);
        System.out.print("请输入商品的生产日期：");
        this.productDate = input.next();
        System.out.print("请输入商品的保质期：");
        this.effTime = input.next();
    }
    private String productDate;
    private String effTime;

    @Override
    public String getInfo(int i)
    {
        return super.getInfo(i) + "\t商品生产日期为：" + this.productDate + "\t商品保质期为：" + this.effTime;
    }
}
