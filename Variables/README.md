# 🧠 Java Variables and Data Types

This simple Java program demonstrates the use of **primitive** and **reference** data types in Java.  
It shows how variables can be used to store and display information.

---

## 🧩 Concepts Covered

### ✅ What is a Variable?
A **variable** is a reusable container for a value.  
It behaves as if it *is* the value it contains.

### 🟥 Primitive vs 🟦 Reference Types

| 🟥 Primitive Type | 🟦 Reference Type |
|-------------------|------------------|
| int               | String           |
| double            | Array            |
| char              | Object           |
| boolean           | —                |

- **Primitive types** store simple values directly in memory (stack).
- **Reference types** store memory addresses that point to values in the heap.

---

## 💻 Code Example

```java
public class Main {
    public static void main(String[] args) {

        // ❎ variable = A reusable container for a value.
        // A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        // ---------                      ---------
        // int                           string
        // double                        array
        // char                          object
        // boolean

        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }
    }
}
