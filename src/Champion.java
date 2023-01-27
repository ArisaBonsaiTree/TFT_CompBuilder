import java.util.List;

public class Champion {
    private String name;
    private int cost;
    private List<String> traits;

    public Champion(String name, int cost, List<String> traits) {
        this.name = name;
        this.cost = cost;
        this.traits = traits;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<String> getTraits() {
        return traits;
    }

    public void setTraits(List<String> traits) {
        this.traits = traits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
