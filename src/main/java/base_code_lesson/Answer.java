package base_code_lesson;

public class Answer {
    String name;
    private int bull;
    private int cow;
    private int maxTry;

    public Answer(int bull, int cow, int maxTry) {
        this.bull = bull;
        this.cow = cow;
        this.maxTry = maxTry;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "bull=" + bull +
                ", cow=" + cow +
                ", maxTry=" + maxTry +
                '}';
    }

    public int getBull () {
        return bull;
    }

    public void setBull (int bull) {
        this.bull = bull;
    }

    public int getCow () {
        return cow;
    }

    public void setCow (int cow) {
        this.cow = cow;
    }

    public int getMaxTry () {
        return maxTry;
    }

    public void setMaxTry (int maxTry) {
        this.maxTry = maxTry;
    }
}
