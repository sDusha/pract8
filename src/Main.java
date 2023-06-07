import PatternMemento.Caretaker;
import PatternMemento.Originator;
import PatternObserver.ConcreteObserver;
import PatternObserver.ConcreteSubject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Memento pattern:\n");
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(12, "Андрей");

        originator.setMemento(caretaker.makeMemento());
        caretaker.setData(20);
        caretaker.setText_data("Чечевица");
        System.out.println(caretaker.getData() + "\t" + caretaker.getText_data());
        caretaker.restore(originator.getMemento());
        System.out.println(caretaker.getData() + "\t" + caretaker.getText_data());

        caretaker.setData(21);
        originator.setMemento(caretaker.makeMemento());
        caretaker.setText_data("вишня");
        System.out.println(caretaker.getData() + "\t" + caretaker.getText_data());
        caretaker.restore(originator.getMemento());
        System.out.println(caretaker.getData() + "\t" + caretaker.getText_data());

        System.out.println("\n\nObserver pattern:\n");

        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver("Кто-то", concreteSubject);
        ConcreteObserver concreteObserver2 = new ConcreteObserver("Кто-то другой", concreteSubject);
        ConcreteObserver concreteObserver3 = new ConcreteObserver("Кто-то третий", concreteSubject);
        ConcreteObserver concreteObserver4 = new ConcreteObserver("Особенный");

        concreteSubject.attach(concreteObserver4);

        concreteSubject.setSmth("другое");
        concreteSubject.setSmth("второе");
        concreteSubject.setSmth("третье");

    }
}