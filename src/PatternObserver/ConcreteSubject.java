package PatternObserver;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private final List<Observer> ObserverList = new ArrayList<>();
    private String smth;

    public void setSmth(String smth) {
        this.smth = smth;
        notify2();
    }

    @Override
    public void attach(Observer observer) {
        ObserverList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        ObserverList.remove(observer);
    }

    @Override
    public void notify2() {
        for (Observer observer : ObserverList){
            observer.update(smth);
        }
    }
}
