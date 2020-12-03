package InnerClassEx;

import java.util.Random;

/**
 * @author MarkChern
 * date 2020/12/2 8:27
 */
public class Body
{
    private String owner;
    private double weight;
    private boolean health;
    private Organ heart;

    public Body()
    {
        heart = new Heart();
    }

    public Body(String owner, double weight, boolean health)
    {
        this.owner = owner;
        this.weight = weight;
        this.health = health;
        this.heart = new Heart();
    }


    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
        Heart heart = (Heart) this.heart;
        heart.setSize();
    }

    public boolean isHealth()
    {
        return health;
    }

    public void setHealth(boolean health)
    {
        this.health = health;
        Heart heart = (Heart) this.heart;
        heart.setColour();
        heart.setHeartRate();
    }

    public Organ getHeart()
    {
        return heart;
    }

    public void setHeart(Organ heart)
    {
        this.heart = heart;
    }

    @Override
    public String toString()
    {
        return "Body{" +
                "owner='" + owner + '\'' +
                ", weight=" + weight + "kg" +
                ", health=" + health +
                ", " + heart +
                '}';
    }

    private class Heart extends Organ
    {
        private int heartRate;
        private String colour;
        private double size;
        private final int heartRateLowerBound = 60;
        private final int heartRateUpperBound = 100;
        private final int maxRate = 220;

        @Override
        public void doWork()
        {
            System.out.println(this + "为血液流动提供动力，把血液运行至"+ owner +"身体各个部分。");
        }

        @Override
        public String toString()
        {
            return "heart{" +
                    "heartRate=" + heartRate +
                    ", colour='" + colour + '\'' +
                    ", size=" + size + "kg" +
                    '}';
        }

        public Heart()
        {
            setSize();
            setColour();
            setHeartRate();
        }
        public int getHeartRate()
        {
            return heartRate;
        }

        public void setHeartRate()
        {
            Random random = new Random();
            if (health)
            {

                int gap = heartRateUpperBound - heartRateLowerBound;
                heartRate = heartRateLowerBound + random.nextInt(gap + 1);
            }
            else
            {
                int interval = random.nextInt(2);
                if (interval == 0)
                {
                    heartRate = random.nextInt(heartRateLowerBound);
                }
                else
                {
                    int gap = maxRate - heartRateUpperBound;
                    heartRate = heartRateUpperBound + 1 + random.nextInt(gap + 1);
                }
            }
        }

        public String getColour()
        {
            return colour;
        }
        public void setColour()
        {
            if (health)
            {
                colour = "bright red";
            }
            else
            {
                colour = "dark red";
            }
        }

        public double getSize()
        {
            return size;
        }

        public void setSize()
        {
            this.size = weight * 0.005;
        }
    }
}
