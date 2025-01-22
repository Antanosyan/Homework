package homework_01_23;

import java.util.LinkedList;
import java.util.List;

public class State {

    private String name;
    private String capital;
    private String isoCode;
    private String anthem;
    private String coatOfArms;
    private String flag;
    private int population;
    private double area;

    public State(String name, String capital, String isoCode, String anthem,
                 String coatOfArms, String flag, int population, double area) {
        this.name = name;
        this.capital = capital;
        this.isoCode = isoCode;
        this.anthem = anthem;
        this.coatOfArms = coatOfArms;
        this.flag = flag;
        this.population = population;
        this.area = area;
    }

    public static List<State> removeDuplicates(List<State> states) {
        LinkedList<State> resultList = new LinkedList<>();

        for (State state : states) {
            if (!resultList.contains(state)) {
                resultList.add(state);
            }
        }
        return resultList;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return flag.equals(state.flag) &&
                coatOfArms.equals(state.coatOfArms) &&
                anthem.equals(state.anthem);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", isoCode='" + isoCode + '\'' +
                ", anthem='" + anthem + '\'' +
                ", coatOfArms='" + coatOfArms + '\'' +
                ", flag='" + flag + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}
