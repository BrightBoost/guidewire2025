### **1. Create a Simple Interface**
Create an interface `Animal` with a method in a package called `main`:
- `void makeSound();`

In a `main` method in a class called `App`:
- Create a class `Dog` that implements `Animal` and defines `makeSound()` to print `"Woof!"`.
- Create a `Dog` object and call `makeSound()`.

---

### **2. Add a Second Class**
Extend Exercise 1:
- Create a `Cat` class that also implements `Animal` and defines `makeSound()` to print `"Meow!"`.
- In `main`, create a `Dog` and a `Cat`, then call `makeSound()` on both.

---

### **3. Add Multiple Methods**
Update the `Animal` interface to include:
- `void eat();`

Update the `Dog` and `Cat` classes to implement the new method:
- For `Dog`, `eat()` prints `"Dog is eating."`
- For `Cat`, `eat()` prints `"Cat is eating."`

In `main`, call both `makeSound()` and `eat()` for each animal.

---

### **4. Default Methods in Interfaces**
Modify the `Animal` interface to include a default method:
- `default void sleep() { System.out.println("This animal is sleeping."); }`

In `main`, call `sleep()` on a `Dog` and a `Cat`.

---

### **5. Add a New Interface**
Create another interface `Pet` with methods:
- `void play();`

Make `Dog` and `Cat` implement both `Animal` and `Pet`. Define `play()`:
- For `Dog`, it prints `"Dog is playing fetch."`
- For `Cat`, it prints `"Cat is playing with a toy."`

In `main`, test all methods on both animals.

---

### **6. Use an Array of Objects**
In `main`:
- Create an array of `Animal` objects containing `Dog` and `Cat`.
- Loop through the array and call `makeSound()` for each.

---

### **7. Create a Specific Interface**
Create an interface `Vehicle` with methods:
- `void startEngine();`
- `void stopEngine();`

Create a class `Car` that implements `Vehicle` and defines:
- `startEngine()` prints `"Car engine started."`
- `stopEngine()` prints `"Car engine stopped."`

Test it in `main`.

---

### **8. Interface Constants**
Add a constant to the `Vehicle` interface:
- `int MAX_SPEED = 120;`

In `Car`, print the value of `MAX_SPEED` in `startEngine()`.

---

### **9. Interface Inheritance**
Create an interface `FlyingVehicle` that extends `Vehicle`:
- Add a method `void fly();`

Create a class `Airplane` that implements `FlyingVehicle` and defines:
- `startEngine()`, `stopEngine()`, and `fly()`.

In `main`, create an `Airplane` object and test all methods.

--- 

### **11. Combining Interfaces**
Create two interfaces:
- `Movable` with `void move();`
- `Drawable` with `void draw();`

Create a `Robot` class that implements both interfaces:
- `move()` prints `"Robot is moving."`
- `draw()` prints `"Robot is drawing."`

Test in `main`.

---

### **12. Interface as a Parameter**
Use the `Animal` interface:
- Write a method `public static void makeAnimalSpeak(Animal animal)` that calls `animal.makeSound()`.

In `main`, pass a `Dog` and a `Cat` to this method.

---
## BONUS

### **10. Interface with Generics**
Create a generic interface `Storage<T>` with:
- `void store(T item);`
- `T retrieve();`

Create a class `Box` that implements `Storage<T>`. Test storing and retrieving strings and integers.

### **13. Interface References**
Create an interface `Printer` with:
- `void print(String message);`

In `main`, implement it using an anonymous inner class:
```java
Printer printer = new Printer() {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
};
printer.print("Hello, Interface!");
```

---

### **15. Interface Implementation in Abstract Classes (Bonus Explanation)**
**Explanation:** Abstract classes can implement interfaces but may not provide implementation for all methods. This allows a mix of abstraction and flexibility.

Create an abstract class `AbstractAnimal` that implements `Animal`.
- Provide a default implementation for `sleep()`.
- Leave `makeSound()` abstract.

Create a `Dog` class that extends `AbstractAnimal` and implements `makeSound()`.

In `main`:
- Test the `Dog` class and call both `sleep()` and `makeSound()`.