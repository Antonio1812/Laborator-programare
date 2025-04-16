public class DoubleCalculator extends ACalculator{

    public DoubleCalculator(int state){
        super(state);
    }

    public DoubleCalculator add(double b){
        state=(Integer)state+b;
        return this;
    }

    public DoubleCalculator subtract(double b){
        state=(Double)state-b;
        return this;
    }

    public DoubleCalculator multiply(double b){
        state=(Double)state*b;
        return this;
    }

    public DoubleCalculator divide(double b) {
        if (b == 0.0) {
            state = Double.POSITIVE_INFINITY;
        } else {
            state = (Double) state / b;
        }
        return this;
    }


    public double resultDouble() {
        return (Double) state;
    }
}
