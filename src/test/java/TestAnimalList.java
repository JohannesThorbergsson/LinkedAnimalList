import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAnimalList {
    @Test
    void TestAddAndRemove(){
        //GIVEN
        AnimalList testList = new AnimalList(new AnimalListItem(new Animal("Puma"),(new AnimalListItem(new Animal("Giraffe")))));
        AnimalList listExpected = new AnimalList(new AnimalListItem(new Animal("Giraffe"), new AnimalListItem(new Animal("Dog"), (new AnimalListItem(new Animal("Ape"), (new AnimalListItem(new Animal("Cat"))))))));
        //WHEN
        testList.add(new Animal("Dog"));
        testList.add(new Animal("Ape"));
        testList.add(new Animal("Cat"));
        testList.add(new Animal("Puma"));
        System.out.println(testList);
        testList.remove(new Animal("Puma"));
        System.out.println(testList);
        //THEN
        Assertions.assertEquals(listExpected.toString(), testList.toString());
    }
}
