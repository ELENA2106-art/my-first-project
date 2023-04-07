package lv.acodemy.homework;

public class Pez {

    private String name;
    private String seriesName;
    private String color;
    private int candyCount;
    private final int MAX_CANDIES = 12;

    public Pez(String name, String seriesName, String color) {
        this.name = name;
        this.seriesName = seriesName;
        this.color = color;
        this.candyCount = MAX_CANDIES;
    }

    public String getName() {
        return name;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public String getColor() {
        return color;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public void eatCandy() {
        if (candyCount == MAX_CANDIES) {
            System.out.println("The dispenser is full.");
        } else {
            candyCount--;
            System.out.println("Take a candy.");
        }
    }

    public void fillDispenserFull(int candyCount){
        if(candyCount == 7){
            System.out.println("You have now this amount of candies.");
        }else if (candyCount < MAX_CANDIES || candyCount == 0){
            System.out.println("I will add candies.");
        }else {
            candyCount++;
            System.out.println("I added candy.");

        }
        }
        public void fillOne(int candyCount){
        candyCount++;
            System.out.println(candyCount++);
        }
}








