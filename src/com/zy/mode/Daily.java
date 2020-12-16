package com.zy.mode;

import java.util.Scanner;

public class Daily extends Goods
{

    public Daily(Scanner input)
    {
        super(input);
        System.out.print("请输入重量：");
        this.weight = input.next();
    }
    private String weight;

    @Override
    public String getInfo(int i)
    {
        return super.getInfo(i) + "\t重量为：" + this.weight;
    }
}
