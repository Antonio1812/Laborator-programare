public class NewIntCalculator extends ACalculator {

    public NewIntCalculator(int state){
        super(state);
    }

    public NewIntCalculator add(int a){
        state=(Integer)state+a;
        return this;
    }

    public NewIntCalculator subtract(int a){
        state=(Integer)state-a;
        return this;
    }

    public NewIntCalculator multiply(int a){
        state=(Integer)state*a;
        return this;
    }

    public NewIntCalculator divide(double a) {
        if (a == 0) {
            state = Double.POSITIVE_INFINITY;
        } else {
            state = (Integer) state / a;
        }
        return this;
    }
}
