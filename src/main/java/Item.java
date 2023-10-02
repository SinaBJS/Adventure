public class Item {
    private String name;
    private String Description;

    public Item(String name, String description){
        this.name = name;
        this.Description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }
}
