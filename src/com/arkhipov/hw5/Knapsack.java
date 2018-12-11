package com.arkhipov.hw5;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    List<KnapItem> allItems = new ArrayList<KnapItem>();
    List<KnapItem> allItemsRec = new ArrayList<KnapItem>();
    List<KnapItem> takeItems = new ArrayList<KnapItem>();
    List<KnapItem> takeItemsRec = new ArrayList<KnapItem>();
    private final int maxWeight = 50;
    private int totalWeight = 0;
    private int totalWeightRec = 0;
    private int totalCost = 0;
    private int numberOfItems = 0;
    private int numberOfItemsRec = 0;

    public Knapsack()
    {
        allItems.add(new KnapItem("map", 9, 150));
        allItems.add(new KnapItem("compass", 13, 35));
        allItems.add(new KnapItem("water", 153, 200));
        allItems.add(new KnapItem("sandwich", 50, 160));
        allItems.add(new KnapItem("glucose", 15, 60));
        allItems.add(new KnapItem("tin", 68, 45));
        allItems.add(new KnapItem("banana", 27, 60));
        allItems.add(new KnapItem("apple", 39, 40));
        allItems.add(new KnapItem("cheese", 23, 30));
        allItems.add(new KnapItem("beer", 52, 10));
        allItems.add(new KnapItem("suntan cream", 11, 70));
        allItems.add(new KnapItem("camera", 32, 30));
        allItems.add(new KnapItem("T-shirt", 24, 15));
        allItems.add(new KnapItem("trousers", 48, 10));
        allItems.add(new KnapItem("umbrella", 73, 40));
        allItems.add(new KnapItem("waterproof trousers", 42, 70));
        allItems.add(new KnapItem("waterproof overclothes", 43, 75));
        allItems.add(new KnapItem("note-case", 22, 80));
        allItems.add(new KnapItem("sunglasses", 7, 20));
        allItems.add(new KnapItem("towel", 18, 12));
        allItems.add(new KnapItem("socks", 4, 50));
        allItems.add(new KnapItem("book", 30, 10));

        allItemsRec.add(new KnapItem("map", 9, 150));
        allItemsRec.add(new KnapItem("compass", 13, 35));
        allItemsRec.add(new KnapItem("water", 153, 200));
        allItemsRec.add(new KnapItem("sandwich", 50, 160));
        allItemsRec.add(new KnapItem("glucose", 15, 60));
        allItemsRec.add(new KnapItem("tin", 68, 45));
        allItemsRec.add(new KnapItem("banana", 27, 60));
        allItemsRec.add(new KnapItem("apple", 39, 40));
        allItemsRec.add(new KnapItem("cheese", 23, 30));
        allItemsRec.add(new KnapItem("beer", 52, 10));
        allItemsRec.add(new KnapItem("suntan cream", 11, 70));
        allItemsRec.add(new KnapItem("camera", 32, 30));
        allItemsRec.add(new KnapItem("T-shirt", 24, 15));
        allItemsRec.add(new KnapItem("trousers", 48, 10));
        allItemsRec.add(new KnapItem("umbrella", 73, 40));
        allItemsRec.add(new KnapItem("waterproof trousers", 42, 70));
        allItemsRec.add(new KnapItem("waterproof overclothes", 43, 75));
        allItemsRec.add(new KnapItem("note-case", 22, 80));
        allItemsRec.add(new KnapItem("sunglasses", 7, 20));
        allItemsRec.add(new KnapItem("towel", 18, 12));
        allItemsRec.add(new KnapItem("socks", 4, 50));
        allItemsRec.add(new KnapItem("book", 30, 10));

        System.out.println(allItems);
    }

    public int calcTakeItemsRec(int totalWeightRec){
        int temp = findBestRatioRec();
        if(temp == -1 || totalWeightRec >= maxWeight-allItemsRec.get(temp).getWeight()){
            System.out.println("Weight of Items: " + totalWeightRec);
            return  totalWeightRec;
        }
        else {
            if(allItemsRec.get(temp).viable()){
                takeItemsRec.add(allItemsRec.get(temp));
                allItemsRec.get(temp).notViable();
            }
            return calcTakeItemsRec(totalWeightRec + (allItemsRec.get(temp).getWeight()));
        }
    }

    public void calcTakeItems()
    {
        int currentBestRatio = 0;
        boolean complete = false;
        while(!complete)
        {
            currentBestRatio = this.findBestRatio();
            if(currentBestRatio != -1 && ((allItems.get(currentBestRatio).getWeight()) + totalWeight < maxWeight))
            {
                takeItems.add(allItems.get(currentBestRatio));
                totalWeight += allItems.get(currentBestRatio).getWeight();
                totalCost += allItems.get(currentBestRatio).getCost();
                numberOfItems++;
                allItems.get(currentBestRatio).notViable();
            }
            else
            {
                if(currentBestRatio != -1)
                {
                    allItems.get(currentBestRatio).notViable();
                }
            }

            if(currentBestRatio == -1)
            {
                complete = true;
            }
        }
    }

    public int findBestRatio()
    {
        int bestRatioPosition = -1;
        double bestRatio = 0;

        for(int i = 0; i < allItems.size(); i++)
        {
            double tempRatio = allItems.get(i).getRatio();
            if(tempRatio >= bestRatio && allItems.get(i).viable())
            {
                bestRatio = tempRatio;
                bestRatioPosition = i;
            }
        }
        return bestRatioPosition;
    }

    public int findBestRatioRec()
    {
        int bestRatioPosition = -1;
        double bestRatio = 0;

        for(int i = 0; i < allItemsRec.size(); i++)
        {
            double tempRatio = allItemsRec.get(i).getRatio();
            if(tempRatio >= bestRatio && allItemsRec.get(i).viable())
            {
                bestRatio = tempRatio;
                bestRatioPosition = i;
            }
        }
        return bestRatioPosition;
    }

    public void displayPack()
    {
        System.out.println("Max Weight: " + maxWeight + " \nWeight of Items: " + totalWeight + " \nTotal value of items: " + totalCost + "\nNumber of items in pack: " + numberOfItems);
        for(int i = 0; i < takeItems.size(); i++)
        {
            System.out.print(takeItems.get(i));
        }
    }
    public void displayPackRec()
    {
        for(int i = 0; i < takeItemsRec.size(); i++)
        {
            System.out.print(takeItemsRec.get(i));
        }
    }


}
