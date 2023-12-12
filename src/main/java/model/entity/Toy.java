package model.entity;

public class Toy {
    private static int countToy = 0;
    private int id = 0;
    private String name;
    private int priority;

    public Toy(String name,int priority){
        this.name = name;
        this.priority = priority;
        this.id = countToy+1;
        countToy++;
    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getPriority () {
        return priority;
    }

    public void setPriority (int priority) {
        this.priority = priority;
    }

    @Override
    public String toString () {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
