### **1. Create a Generic Class**
Write a generic class `Box` that can hold any type of object. Add methods to:
- Set the object (`setItem`).
- Get the object (`getItem`).

**Example Input:**
```java
Box<String> stringBox = new Box<>();
stringBox.setItem("Hello");
System.out.println(stringBox.getItem());
```

---

### **2. Use Bounded Type Parameters in a Class**
Create a generic class `Pair<K, V>` to store key-value pairs. Ensure `K` and `V` are subclasses of `Number`.

**Example Input:**
```java
Pair<Integer, Double> pair = new Pair<>(10, 20.5);
pair.display();
```

---

### **3. Create a Generic Interface**
Create a generic interface `Repository<T>` with methods:
- `add(T item)`
- `getAll()` (returns a `T[]`)

Implement it in a class `UserRepository` where `T` is `User`.

---

### **4. Generic Method**
Write a generic method `swap` that swaps two elements in an array.

**Example Input:**
```java
String[] names = {"Sruthi", "Binupa"};
swap(names, 0, 1); // array, index first, index second
System.out.println(Arrays.toString(names));
```

---

### **5. Generic Class with Multiple Type Parameters**
Create a class `Triple<K, V, S>` that can hold three types of objects. Add methods to set and get values.

**Example Input:**
```java
Triple<Integer, String, Boolean> triple = new Triple<>(1, "Hello", true);
System.out.println(triple.getFirst());
System.out.println(triple.getSecond());
System.out.println(triple.getThird());
```

---

### **6. Advanced: Nested Generics**
Create a class `DataHolder<K, V>` where `K` is a generic type and `V` is another generic class.

Example:
- `DataHolder<String, Box<Integer>>`

Write methods to set and get the nested values.

**Example Input:**
```java
Box<Integer> box = new Box<>();
box.setItem(42);

DataHolder<String, Box<Integer>> dataHolder = new DataHolder<>();
dataHolder.setKey("MyKey");
dataHolder.setValue(box);

System.out.println(dataHolder.getKey());    // Output: MyKey
System.out.println(dataHolder.getValue().getItem()); // Output: 42
```

---

