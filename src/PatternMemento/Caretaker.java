package PatternMemento;

public class Caretaker {
    private int data;
    private String text_data;

    public Caretaker(int data, String text_data) {
        this.data = data;
        this.text_data = text_data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getText_data() {
        return text_data;
    }

    public void setText_data(String text_data) {
        this.text_data = text_data;
    }

    public Memento makeMemento(){
        return new Memento(data, text_data);
    }

    public void restore(Memento memento){
        this.data = memento.data();
        this.text_data = memento.text_data();
    }
}
