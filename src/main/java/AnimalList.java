import com.sun.source.tree.WhileLoopTree;

public class AnimalList {
     AnimalListItem head;

    public AnimalList(AnimalListItem head) {
        this.head = head;
    }

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
        AnimalListItem lastItem = head;
        if (lastItem == null) {
            head = new AnimalListItem(added);
        }
        while (lastItem.getNext() != null) {
             lastItem=lastItem.getNext();
        }
        lastItem.setNext(new AnimalListItem(added));
    }
    public void remove (Animal removedAnimal) {
        AnimalListItem currentItem =head;
        while(currentItem.getNext()!=null){
            if(currentItem.getValue().equals(removedAnimal)) {
                currentItem.setValue(currentItem.getNext().getValue());
                currentItem.setNext(currentItem.getNext().getNext());
            }else if(currentItem.getNext()!=null) {
                currentItem=currentItem.getNext();
            }
        }
        AnimalListItem currentItem2 = head;
        while(currentItem2.getNext()!=null) {
            if(currentItem2.getNext().getNext()==null ||currentItem2.getNext().getValue().equals(removedAnimal)) {
                currentItem2.setNext(null);
            }
            if(currentItem2.getNext()!=null) {
                currentItem2=currentItem2.getNext();
            }
        }
    }
}
