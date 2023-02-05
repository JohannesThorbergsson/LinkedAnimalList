import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AnimalList {
    private AnimalListItem head;

    @Override
    public String toString() {
        AnimalListItem currentItem = head;
        StringBuilder animalList= new StringBuilder(head.getValue().toString());
        while (currentItem.getNext()!=null) {
                   animalList.append("->").append(currentItem.getNext().getValue());
                   currentItem=currentItem.getNext();
        }
        return animalList.toString();
    }

    public void add(Animal added) {
        AnimalListItem currentItem = head;
        if (currentItem == null) {
            head = new AnimalListItem(added);
        } else {
            while (currentItem.getNext() != null) {
                currentItem = currentItem.getNext();
            }
            currentItem.setNext(new AnimalListItem(added));
        }
    }
    public void remove (Animal removedAnimal) {
      while (head !=null && head.getValue().equals(removedAnimal)) { //check head == null?
            head=head.getNext();
      }
      if (head!=null) {
          AnimalListItem currentItem = head;
          while (currentItem.getNext() != null) {
              if (currentItem.getNext().getValue().equals(removedAnimal)) {
                  currentItem.setNext(currentItem.getNext().getNext());
              } else  {
                  currentItem = currentItem.getNext();
              }
          }
      }
    }
}
