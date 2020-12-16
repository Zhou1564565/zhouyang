package com.zy.main;

import com.zy.mode.Daily;
import com.zy.mode.Electrical;
import com.zy.mode.Foods;
import com.zy.mode.Goods;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Goods[] goodsArray = new Goods[1000];
        int arrIndex = 0;
        loop:while (true)
        {
            System.out.println("===================================================================================");
            System.out.println("                           欢迎使用畅畅商品管理系统");
            System.out.println("===================================================================================");
            System.out.println("[1.添加新商品 2.展示已有信息 3.删除商品信息 4.退出]");
            System.out.print("请输入：");
            int inputnum = input.nextInt();
            switch(inputnum)
            {
                case 1:
                    System.out.print("请输入您想要增加的商品类别[1.食品 2.生活用品 3.电器]: ");
                    Goods newGoods = null;
                    switch (input.nextInt())
                    {
                        case 1:
                            newGoods = new Foods(input);
                            break;
                        case 2:
                            newGoods = new Daily(input);
                            break;
                        case 3:
                            newGoods = new Electrical(input);
                            break;
                    }
                    goodsArray[arrIndex++] = newGoods;
                    System.out.println("保存成功！！！");
                    break;

                case 2:
                    System.out.println("");
                    for (int i = 0; i < arrIndex; i++)
                    {
                        Goods temp = goodsArray[i];
                        System.out.println(temp.getInfo(i));
                    }
                    System.out.println("展示完毕！");
                    break;

                case 3:
                    System.out.print("请输入想删除商品的编号：");
                    int number = input.nextInt();
                    for (int i = number - 1;i < arrIndex;i ++)
                    {
                        goodsArray[i] = goodsArray[i + 1];
                    }
                    arrIndex --;
                    System.out.println("删除完成。");
                    break;

                case 4:
                    System.out.println("感谢使用！！");
                    break loop;
                default:
                    System.out.println("输入错误，请重新输入。");
            }
        }
    }
}
