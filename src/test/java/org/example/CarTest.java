package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CarTest {

    private Car[] carArray;
    private List<Car> carList;
    private Set<Car> carSet;
    private Map<String, Car> carMap;
    private Collection<Car> carCollection;

    @Before
    public void setUp() throws Exception {

        carArray = new Car[3];
        carArray[0] = new Car("Toyota", 2007, 1.4);
        carArray[1] = new Car("Audi", 2019, 2.5);
        carArray[2] = new Car("BMW", 2015, 3.0);

        //List
        carList = new ArrayList<>();
        carList.add(carArray[0]);
        carList.add(carArray[1]);
        carList.add(carArray[2]);

        //Set
        carSet = new HashSet<>();
        carSet.add(carArray[0]);
        carSet.add(carArray[1]);
        carSet.add(carArray[2]);

        //Map
        carMap = new HashMap<>();
        carMap.put("1", carArray[0]);
        carMap.put("2", carArray[1]);
        carMap.put("3", carArray[2]);

        //Collection
        carCollection = new LinkedList<>();
        carCollection.add(carArray[0]);
        carCollection.add(carArray[1]);
        carCollection.add(carArray[2]);

    }

    @Test
    public void list() {
        assertEquals(carList.size(), 3);
    }

    @Test
    public void set() {
        assertFalse(carSet.contains(new Car("GTI", 2010, 2.0)));
    }

    @Test
    public void map() {
        assertSame(carMap.get("1"), carArray[0]);
    }

    @Test
    public void collection() {
        assertTrue(carCollection.contains(carArray[2]));
    }
}