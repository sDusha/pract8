package PatternObserver;

public class ConcreteObserver implements Observer {
    private final String obs;

    public ConcreteObserver(String obs, ConcreteSubject subject) {
        this.obs = obs;
        subject.attach(this);
    }

    public ConcreteObserver(String obs) {
        this.obs = obs;
    }

    @Override
    public void update(String smth) {
        System.out.println("Ну типо " + obs + " узнал о " + smth);
    }
}
