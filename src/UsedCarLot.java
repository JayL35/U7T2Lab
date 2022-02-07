import java.util.ArrayList;

/**
 * This is a helper class for the Car class that ultlizes and perform several actions on the Car array
 *
 * @author Jay Li
 */
public class UsedCarLot {
    /** Array List of Cars */
    private ArrayList<Car> inventory;

    /** Instantiates the Array List of Car */
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the elements inside the Car List
     *
     * @return the elements inside the Car List
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /**
     * Adds an additional car to the Car List
     *
     * @param car Car being added
     */
    public void addCar(Car car) {
        inventory.add(car);
    }

    /**
     * Returns whether the swap between the cars was successful
     * <p>
     * A swap method that takes two ints as parameters which represent two indices in the inventory.
     * The method should then swap the Car objects at the two indices and return true to indicate the swap was successful.
     *
     * @param indice1 index of the first car
     * @param indice2 index of the second car
     * @return whether a boolean indicating whether the switch between the cars was succesful or not
     */
    public boolean swap(int indice1, int indice2) {
        if (indice1 > inventory.size() || indice2 > inventory.size() || indice1 < 0 || indice2 < 0)
        {
            return false;
        }
        else {
            Car replacedCar = inventory.get(indice1);
            Car replacedCar2 = inventory.get(indice2);
            inventory.set(indice1, replacedCar2);
            inventory.set(indice2, replacedCar);
            return true;
        }
    }

    // ADD THESE FOUR NEW METHODS TO UsedCarLot

    /**
     * Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
     * <p>
        PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd the index of add the car in
     * @param carToAdd the car desired to be added
    */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Returns the car that is being removed from the Car List
     * "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell index of the car being sold or removed
     * @return the Car that is being "sold" (removed from lot)
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /**
     * Returns the car that is being removed
     * "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell index of the car being removed
     * @return the car that is being "sold" (replaced with null)
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car soldCar = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return soldCar;
    }

    /**
     * moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex &lt; indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly
     * <p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
                      destinationIndex &lt; inventory.size()
     * @param indexOfCarToMove index of the car being moved to a different index
     * @param destinationIndex index at which the car should be moved to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car carToMove = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, carToMove);
    }
}
