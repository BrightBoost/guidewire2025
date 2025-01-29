### **1. Create and Populate an ArrayList**
Create an `ArrayList<String>` and add five names to it. Print the list.

---

### **2. Iterate Over an ArrayList**
Using a `for` loop, iterate over the list from Exercise 1 and print each name on a new line.

---

### **3. Modify an ArrayList**
- Add a new name to the list.
- Remove a name from the list.
- Print the updated list.

---

### **4. Create and Populate a HashSet**
Create a `HashSet<Integer>`, add five numbers, and print the set.

---

### **5. Avoid Duplicates with a Set**
- Try adding the same number twice to the `HashSet`.
- Print the set and observe that duplicates are not allowed.

---

### **6. Iterate Over a Set**
Use an **enhanced for-loop** to print each number in the `HashSet`.
Why can't you use the regular for loop?
---

### **7. Create and Populate a HashMap**
Create a `HashMap<String, Integer>` to store a mapping of names to ages.
- Add five name-age pairs.
- Print the map.

---

### **8. Retrieve Values from a HashMap**
Using `.get()`, retrieve the age of a specific name from the map. Print the result.

---

### **9. Iterate Over a Map**
Using a **for-each loop**, iterate through the `HashMap` and print all key-value pairs in the format:  
`Name: [name], Age: [age]`.

---

### **10. Store Custom Objects in a List**
Create a class `Person` with:
- Private fields `String name` and `int age`.
- Constructor and getters.

Create an `ArrayList<Person>`, add three `Person` objects, and print their names.


### **11. Use a Map with Objects**
Modify `Person` to include a unique `ID`.
- Create a `HashMap<Integer, Person>` where the key is the ID and the value is the `Person`.
- Populate the map and retrieve a person by their ID.

---

### **12. Static Method to Filter a List**
Create a static method:
```java
public static List<Person> filterAdults(List<Person> people) 
```  
- It should return only the people who are 18 or older.
- Test the method in `main`.

---

### **13. Using a Set Inside a Class**
Modify `Person` to include a `Set<String> hobbies`.
- Add a method `addHobby(String hobby)`.
- In `main`, create a person and add multiple hobbies (avoiding duplicates).
- Print all hobbies.

---

### **14. Combining Collections and OOP (Bonus Exercise)**
Create a `Library` class with:
- A `Map<String, List<String>> booksByGenre`, where each key is a genre, and the value is a list of book titles.
- A method `addBook(String genre, String book)`, which adds books to the correct genre.
- A method `printBooksByGenre()` that prints all genres and their books.

In `main`:
- Create a `Library` object, add books to different genres, and display them.

---

## Super Challenge

---

### **15. Sort a List of Objects**
Using `Collections.sort()`, sort the `ArrayList<Person>` from Exercise 10 by age. Print the sorted list.

---

