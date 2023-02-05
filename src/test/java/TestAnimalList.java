import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestAnimalList {
    //GIVEN
    AnimalList testListTwoItems;
    @BeforeEach
    void setUp (){
        testListTwoItems = new AnimalList(
                new AnimalListItem(new Animal("Puma"),(
                new AnimalListItem(new Animal("Giraffe")))));
    }

    @Test
    void TestAddAndRemove(){
        //GIVEN
        AnimalList listExpected = new AnimalList(
                 new AnimalListItem(new Animal("Giraffe"),
                 new AnimalListItem(new Animal("Dog"),
                (new AnimalListItem(new Animal("Ape"),
                (new AnimalListItem(new Animal("Cat"))))))));
        //WHEN
        testListTwoItems.add(new Animal("Dog"));
        testListTwoItems.add(new Animal("Ape"));
        testListTwoItems.add(new Animal("Cat"));
        testListTwoItems.add(new Animal("Puma"));
        System.out.println(testListTwoItems);
        testListTwoItems.remove(new Animal("Puma"));
        System.out.println(testListTwoItems);
        //THEN
        assertEquals(listExpected.toString(), testListTwoItems.toString());
    }
    @Test
    void testRemoveFromEmptyList(){
        //GIVEN
        AnimalList empty = new AnimalList();
        //WHEN
        empty.remove(new Animal("Puma"));
        //THEN
        assertNull(empty.getHead());
    }
    @Test
    void addFirstElement (){
        //GIVEN
        AnimalList empty = new AnimalList();
        AnimalList puma = new AnimalList(new AnimalListItem(new Animal("Puma")));
        //WHEN
        empty.add(new Animal("Puma"));
        //THEN
        assertEquals(puma.toString(), empty.toString());
    }

}
