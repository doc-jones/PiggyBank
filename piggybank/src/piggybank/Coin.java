package piggybank;

public class Coin
{
    private  int num;
    private String name;
    private double value;
    public Coin(double value, int num, String name)
    {
        this.name = name;
        this.num = num;
        this.value = value;
    }
    public double getValue()
    {
        return this.value * num;
    }
    public String getName()
    {
        return this.name;
    }
    public int getNum()
    {
        return num;
    }
}