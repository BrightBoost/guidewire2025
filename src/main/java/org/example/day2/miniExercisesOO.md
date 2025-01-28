### **1. Create a Simple Class**
Create a class `Person` with the following:
- A private property `String name`.
- A public getter `getName()` and setter `setName(String name)`.
- In the `main` method (in a separate file), create an instance of `Person`, set its name, and print it.

---

### **2. Add Another Property**
Extend the `Person` class:
- Add a private property `int age`.
- Add a getter and setter for `age`.
- In the `main` file, set the name and age, and print: `"Name: [name], Age: [age]"`.

---

### **3. Add a Constructor**
Modify the `Person` class:
- Add a constructor that takes `name` and `age` as parameters.
- Use the constructor to initialize the properties.
- In the `main` file, create and print a `Person` object using the constructor.

---

### **4. Add a Method**
Add a method to the `Person` class:
- `String greet()` that returns `"Hello, my name is [name] and I am [age] years old."`.
- Call this method from the `main` file and print the result.

---

### **5. Add Conditional Logic**
Update the `Person` class:
- Add a method `boolean isAdult()` that returns `true` if the age is 18 or older, and `false` otherwise.
- In `main`, print whether a person is an adult.

---

### **6. Add Static Properties and Methods**
Add a static property and method:
- A static property `int population` that tracks the number of `Person` instances.
- Increment `population` in the constructor.
- Add a static method `int getPopulation()` to return the current population.
- In `main`, create multiple `Person` objects and print the population.

---

### **7. Combine with String Methods**
Modify the `Person` class:
- Add a method `String getInitials()` that returns the initials of the `name`.
- Use `.toUpperCase()` and `.charAt()` in the method.
- Test it in `main`.

---

### **8. Create Another Class**
Create a `Car` class:
- Properties: `String brand`, `String model`, `int year`.
- Add a constructor, getters, and setters.
- Add a method `String getCarInfo()` that returns `"Brand: [brand], Model: [model], Year: [year]"`.
- Create a `Car` object in `main` and print its information.

---

### **9. Use Methods with Parameters**
Add a method to the `Person` class:
- `void buyCar(Car car)` that prints: `[name] bought a [brand] [model].`
- In `main`, create a `Person` and a `Car`, then call `buyCar()`.

---

### **10. Add Loops**
Add a method to the `Person` class:
- `void listCars(Car[] cars)` that prints all the cars owned by the person.
- In `main`, create a `Person` and an array of `Car` objects. Call `listCars()`.

---

### **11. Array of Objects**
In `main`, create an array of `Person` objects.
- Print the name and age of each person in the array using a loop.

---

### **12. Encapsulation and Validation**
Add validation to `setAge(int age)` in the `Person` class:
- If `age < 0`, print: `"Age cannot be negative."` and do not update the property.
- Test the validation in `main`.

---

### **13. Use Arrays in a Class**
Add a property `Car[] ownedCars` to the `Person` class.
- Add a method `void addCar(Car car)` to add a car to the array (resize the array if needed).
- In `main`, test by adding multiple cars to a person and listing them.

---

### **14. Inheritance**
Create a subclass `Student` that extends `Person`:
- Add a private property `String studentId`.
- Add a getter, setter, and constructor.
- Override the `greet()` method to include the student ID:  
  `"Hello, my name is [name], I am [age] years old, and my student ID is [studentId]."`
- In `main`, create a `Student` object and call `greet()`.

---
### **1. Basic Pet Class and Subclasses**
Create a base class `Pet` with the following:
- Properties:
  - `String name`
  - `int age`

- Methods:
  - A constructor to initialize `name` and `age`.
  - A method `String describe()` that returns `"This is [name], aged [age]."`

Create two subclasses:
- `Dog` (inherits `Pet`)
- `Cat` (inherits `Pet`)

In `main`:
- Create a `Dog` and a `Cat`, then call `describe()` for each.

---

### **2. Adding Specific Methods in Subclasses**
Extend the `Dog` and `Cat` classes:
- Add a specific method to each subclass:
  - `Dog`: `void bark()` that prints `"Woof! Woof!"`.
  - `Cat`: `void meow()` that prints `"Meow!"`.

In `main`:
- Create a `Dog` and a `Cat`. Call their `describe()` and specific methods (`bark()` and `meow()`).

---

### **3. Adding Unique Properties to Subclasses**
Modify the `Dog` and `Cat` classes to include unique properties:
- `Dog`: `String breed`
- `Cat`: `boolean likesToClimb`

Update the constructors to initialize these properties and modify `describe()` to include them:
- For `Dog`: `"This is [name], aged [age]. Breed: [breed]."`
- For `Cat`: `"This is [name], aged [age]. Likes to climb: [likesToClimb]."`

In `main`:
- Create a `Dog` and a `Cat` with their specific properties. Call `describe()` for each.

---

### **4. Array of Pets**
Create an array of `Pet` objects in `main` (include `Dog` and `Cat` objects).

- Loop through the array and print the `describe()` output for each pet.
- Challenge: Try adding specific methods like `bark()` or `meow()` to all the pets in the array. If you can't call them directly, explain why this happens (hint: their type is `Pet`, not `Dog` or `Cat`).

---

### **5. Adding a New Subclass and Filtering Pets**
Add a new subclass `Bird` that inherits from `Pet` with the following:
- A unique property: `boolean canFly`.
- Override the `describe()` method to include `"Can fly: [canFly]"`.

In `main`:
1. Create an array of mixed `Dog`, `Cat`, and `Bird` objects.
2. Write a method `void printOnlyDogs(Pet[] pets)` that loops through the array and prints details only for `Dog` objects (hint: use `instanceof`).

**Bonus Explanation:**
- `instanceof` is a keyword used to check the type of an object. For example, `if (pet instanceof Dog)` checks if the `pet` is a `Dog`.



