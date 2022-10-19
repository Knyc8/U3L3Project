public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String speak()
    {
        int roll = (int)(Math.random() * 6) + 1;
        if (roll == 1)
        {
            return "meow!";
        }
        if (roll == 2)
        {
            return "bark!";
        }
        else
        {
            return "oink";
        }
    }

    public void introduce()
    {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}
