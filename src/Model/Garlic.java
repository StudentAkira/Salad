package Model;

public class Garlic extends Ingredients {
    {
        System.out.println("You chose a garlic, a great choise!");
    }

    public Garlic() {
        super.name = "Garlic";
        super.calories = 65;
        super.weight = 50;
    }

    public Garlic(String name, int calories, int weight) {
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
