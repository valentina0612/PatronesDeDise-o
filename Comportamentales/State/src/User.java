public class User {
    private boolean buying;
    private boolean enable;
    private State state;

    public User() {
        this.buying = false;
        this.enable = false;
        this.state = new ActiveState(this);
    }

    public boolean isBuying() {
        return buying;
    }

    public void setBuying(boolean buying) {
        this.buying = buying;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String startBuy() {
        return "Start buying...";
    }

}
