package com.arkhipov.hw5;

public class KnapItem {
    private String name;
    private int weight;
    private int cost;
    private double costWeightRatio;
    private boolean isViable = true;

    public KnapItem(String n, int w, int c)
    {
        name = n;
        weight = w;
        cost = c;
        costWeightRatio = (double)cost/weight;
    }

    public boolean viable()
    {
        return isViable;
    }

    public void notViable()
    {
        isViable = false;
    }

    public double getRatio()
    {
        return costWeightRatio;
    }

    public int getCost()
    {
        return cost;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "Item: " + name + "\tWeight: " + weight + "\tCost: " + cost + "\tRatio: " + costWeightRatio +"\n";
    }
}
