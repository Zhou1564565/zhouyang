package com.zy.mode;

import java.util.Scanner;

public class Electrical extends Goods
{
    public Electrical(Scanner input)
    {
        super(input);
        System.out.print("请输入品牌：");
        this.brand = input.next();
        System.out.print("请输入功率：");
        this.power = input.next();
    }
    private String brand;//品牌
    private String power;//功率

    @Override
    public String getInfo(int i)
    {
        return super.getInfo(i) + "\t品牌为：" + this.brand + "\t功率为：" + this.power;
    }
}
