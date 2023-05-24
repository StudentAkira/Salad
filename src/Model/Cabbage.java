package Model;

public class Cabbage extends Ingredients {
    {
        System.out.println("You chose a cabbage, a great choise!");
    }

    public Cabbage() {
        super.name = "Cabbage";
        super.calories = 28;
        super.weight = 100;
    }

    public Cabbage(String name, int calories, int weight) {
        super.name = name;
        super.calories = calories;
        super.weight = weight;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void print_salad() {
        System.out.print(name + " ");
    }

    @Override
    public void SetName(String name) {
        super.name = name;
    }

    @Override
    public String GetName() {
        return name;
    }

    @Override
    public void SetWeight(int weight) {
        super.weight = weight;
    }

    @Override
    public int GetWeight() {
        return weight;
    }

    @Override
    public void SetCalories(int calories) {
        super.calories = calories;
    }

    @Override
    public int GetCalories() {
        return calories;
    }
}
