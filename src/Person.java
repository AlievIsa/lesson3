public class Person {
    private String name;
    private double height;

    public Person(String name) {
        if (name == null) {
            name = "Defaul Name";
        }
        this.name = name;
    }

    public void setName(String name) {
        if (name == null) {
            return;
        }
        this.name = name;
    }
    public String getName () {
        return name;
    }
}

