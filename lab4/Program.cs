class Animal
{
    public string Name { get; set; }
    public double FoodConsumptionPerDay { get; set; }

    public Animal(string name, double foodConsumptionPerDay)
    {
        Name = name;
        FoodConsumptionPerDay = foodConsumptionPerDay;
    }

    // Конструктор-копирование
    public Animal(Animal other)
    {
        Name = other.Name;
        FoodConsumptionPerDay = other.FoodConsumptionPerDay;
    }

    public override string ToString()
    {
        return Name;
    }

    public virtual void voice()
    {
        Console.WriteLine("animal voice");
    }
}

class Lion : Animal
{ 
    public Lion() : base ("Lion", 20) { }
    public override void voice()
    {
        Console.WriteLine("Lion voice");
    }
}

class Elephant : Animal
{
    public Elephant() : base ("Elephant", 40) { }
    public override void voice()
    {
        Console.WriteLine("Elephant voice");
    }
}

class Giraffe : Animal
{
    public Giraffe() : base ("Giraffe", 30) { }
    public override void voice()
    {
        Console.WriteLine("Giraffe voice");
    }
}

class Zoo
{
    private static int zooCount; // Статическая переменная
    private List<Animal> animals;

    static Zoo()
    {
        zooCount = 0;
    }

    public static int GetZooCount()
    {
        return zooCount;
    }

    // Конструктор по умолчанию
    public Zoo()
    {
        animals = new List<Animal>();
        zooCount++; // Увеличиваем счетчик при создании нового зоопарка
    }

    // Конструктор с параметрами
    public Zoo(List<Animal> initialAnimals)
    {
        animals = new List<Animal>(initialAnimals);
        zooCount++;
    }

    public void AddAnimal(Animal animal)
    {
        animals.Add(animal);
    }

    public Animal getAnimal(int index)
    {
        return animals[index];
    }
    public double CalculateDailyFoodRequirement()
    {
        double totalFood = 0;
        foreach (Animal animal in animals)
        {
            totalFood += animal.FoodConsumptionPerDay;
        }
        return totalFood;
    }

    public Animal GetMostHungryAnimal()
    {
        return animals.OrderByDescending(a => a.FoodConsumptionPerDay).FirstOrDefault();
    }

    public Animal GetLeastHungryAnimal()
    {
        return animals.OrderBy(a => a.FoodConsumptionPerDay).FirstOrDefault();
    }
}

class Food
{
    public string Name { get; set; }
    public double QuantityPerMeal { get; set; }

    public Food(string name, double quantityPerMeal)
    {
        Name = name;
        QuantityPerMeal = quantityPerMeal;
    }
}

class Program
{
    static void Main(string[] args)
    {
        Animal lion = new Lion();
        Animal lionCopy = new Animal(lion); // Использование конструктора-копирования

        Animal elephant = new Elephant();
        Animal giraffe = new Animal("Giraffe", 7);

        List<Animal> initialAnimals = new List<Animal>
    {
        new Lion(),
        new Giraffe()
    };

        List<Zoo> zoos = new List<Zoo>(); // Создание списка зоопарков

        Zoo zoo1 = new Zoo(); // Вызов конструктора по умолчанию
        Zoo zoo2 = new Zoo(initialAnimals); // Вызов конструктора с параметрами

        zoos.Add(zoo1); // Добавление зоопарков в список
        zoos.Add(zoo2);

        zoos[0].AddAnimal(lion);
        zoos[0].AddAnimal(elephant);
        zoos[0].AddAnimal(giraffe);
        zoos[0].AddAnimal(lionCopy);

        // Получение количества созданных зоопарков
        int zooCount = Zoo.GetZooCount();
        Console.WriteLine("Number of zoos created: " + zooCount);

        for (int i = 0; i < zooCount; i++)
        {
            Console.WriteLine();
            Console.WriteLine("Zoo number: " + (i+1));

            double totalFoodRequired = zoos[i].CalculateDailyFoodRequirement();
            Console.WriteLine("Total food required per day: " + totalFoodRequired);

            Animal mostHungry = zoos[i].GetMostHungryAnimal();
            Console.WriteLine("Most hungry animal: " + mostHungry);

            Animal leastHungry = zoos[i].GetLeastHungryAnimal();
            Console.WriteLine("Least hungry animal: " + leastHungry);
        }


        zoo2.getAnimal(0).voice();
    }

}
