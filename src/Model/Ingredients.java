package Model;

public abstract class Ingredients {

    protected String name = "Default";
    protected int weight = 0;
    protected int calories = 0;

    public  abstract void print_salad();
    public abstract  void SetName (String name);
    public abstract String GetName();
    public abstract  void SetWeight (int weight);
    public abstract int GetWeight();
    public abstract  void SetCalories (int calories);
    public abstract int GetCalories();
}

