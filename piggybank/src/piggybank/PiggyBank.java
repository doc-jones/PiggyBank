package piggybank;

import java.util.ArrayList;

public class PiggyBank
{
    private ArrayList<Coin> coinList = new ArrayList<>();

        public int getNumOfCoins()
        {
            return coinList.size();
        }

    public double getMoney()
    {
        double sum = 0;
        for (Coin c : coinList)
        {
            sum = sum + c.getValue();
        }
        return sum;
    }

    public void getNum()
    {
        for (Coin c : coinList)
        {
            if (c.getName().equals ("dollar")) {
                System.out.println("$ " + c.getNum());
            }else
            {
                if (c.getNum() > 1) {
                    System.out.println(c.getNum() + " " + c.getName() + "s");
                }else
                System.out.println(c.getNum() + " " + c.getName());
            }

        }
    }

    public void addCoins(int num, Coin c)
    {
        coinList.add(new Coin(c.getValue(), num, c.getName()));
    }
}
