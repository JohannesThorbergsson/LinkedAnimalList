import lombok.Data;

@Data
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
}
