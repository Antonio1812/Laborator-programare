public class ACalculator {
    protected Object state;

    public ACalculator(int state) {
        this.state = state;
    }

    public int result() {
        return (Integer) state;
    }

    public int clear(){
        state = 0;
        return 0;
    }
}
