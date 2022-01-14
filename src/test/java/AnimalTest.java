import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalTest {
    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void animals_instantiatesCorrectly_true() {
        Animal rex = new Animal("Rex");
        assertTrue(true);
    }

    @Test
    public void getName_animalInstantiatesWithName_string() {
        Animal rex = new Animal("Rex");
        rex.getName();
        assertEquals("Rex", rex.getName());
    }

    @Test
    public void equals_returnsTrueIfNameAndIdAreEqual() {
        Animal rex = new Animal("Rex");
        Animal alpha= new Animal("Rex");
        assertTrue(rex.equals(alpha));
    }

    @Test
    public void save_insertsObjectIntoDatabase_Animal() {
        Animal rex = new Animal("Rex");
        rex.save();
        assertTrue(Animal.all().get(0).equals(rex));
    }

    @Test
    public void all_returnsAllInstancesOfAnimal_true() {
        Animal rex = new Animal("Rex");
        rex.save();
        Animal alpha = new Animal("Alpha");
        alpha.save();
        Animal skipper = new Animal("Skipper");
        skipper.save();
        assertTrue(Animal.all().get(0).equals(rex));
        assertTrue(Animal.all().get(1).equals(alpha));
        assertTrue(Animal.all().get(2).equals(skipper));
    }

    @Test
    public void save_assignsIdToObject() {
        Animal unsavedLucky = new Animal("Lucky");
        unsavedLucky.save();
        Animal savedLucky = Animal.all().get(0);
        assertEquals(unsavedLucky.getId(), savedLucky.getId());
    }

    @Test
    public void find_returnsAnimalWithSameId_secondAnimal() {
        Animal lucky = new Animal("Lucky");
        lucky.save();
        Animal becky = new Animal("Becky");
        becky.save();
        assertEquals(Animal.find(becky.getId()), becky);
    }

    @Test
    public void getSightings_retrievesAllSightingsFromDatabase_sightingsList() {
        Animal rex = new Animal("rex");
        rex.save();
        Sighting nairobi = new Sighting(rex.getId(), "Nairobi", "Becky");
        nairobi.save();
        Sighting kisumu = new Sighting(rex.getId(), "Kisumu", "Bucky");
        kisumu.save();
        Sighting[] sightings = {nairobi, kisumu};
        assertTrue(rex.getSightings().containsAll(Arrays.asList(sightings)));
    }
}
