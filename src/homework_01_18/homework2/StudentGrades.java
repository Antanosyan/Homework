package homework_01_18.homework2;

/* Ենթադրենք ունեք StudentGrades օբյեկտ։ Էդ կլասն ունի մի շարք փռոփերթիներ՝
 mathKnowledge, physicsKnowledge, historyKnowledge, ու մեկ էլ ուսանողի անունը՝ name։ */

public class StudentGrades {
    private String name;
    private int mathKnowledge;
    private int physicsKnowledge;
    private int historyKnowledge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathKnowledge() {
        return mathKnowledge;
    }

    public int getPhysicsKnowledge() {
        return physicsKnowledge;
    }

    public int getHistoryKnowledge() {
        return historyKnowledge;
    }

    public StudentGrades(String name, int physicsKnowledge, int mathKnowledge, int historyKnowledge) {
        this.name = name;
        this.physicsKnowledge = physicsKnowledge;
        this.mathKnowledge = mathKnowledge;
        this.historyKnowledge = historyKnowledge;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", mathKnowledge=" + mathKnowledge +
                ", physicsKnowledge=" + physicsKnowledge +
                ", historyKnowledge=" + historyKnowledge +
                '}'+"\n";
    }
}
