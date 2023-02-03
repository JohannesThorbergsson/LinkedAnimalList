public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
        next=null;
    }

    public AnimalListItem(Animal value, AnimalListItem next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "AnimalListItem{" +
                "value=" + value +
                '}';
    }

    public Animal getValue() {
        return value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }
}
