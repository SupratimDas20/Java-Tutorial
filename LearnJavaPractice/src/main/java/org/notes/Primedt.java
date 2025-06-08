package org.notes;

public class Primedt {
    public static void main(String[] args){
        int num=23;
        System.out.println(num);
    }
}
/***********************************************************************************************************************

 1. Primitive Data Types
Primitive types are basic, fundamental data types provided by Java. They store simple values and are not objects.

Types of Primitive Data Types in Java:
| Data Type    | Size   | Example         | Description    |
|--------------|--------|-----------------|----------------|
| `byte`       | 1 byte | `byte b = 100;` | Stores **small integers** (-128 to 127) |
| `short` | 2 bytes | `short s = 2000;` | Stores **medium integers** (-32,768 to 32,767) |
| `int` | 4 bytes | `int num = 100000;` | Stores **large integers** (-2^31 to 2^31-1) |
| `long` | 8 bytes | `long bigNum = 100000000L;` | Stores **very large integers** (-2^63 to 2^63-1) |
| `float` | 4 bytes | `float f = 3.14f;` | Stores **decimal numbers** (single precision) |
| `double` | 8 bytes | `double d = 3.141592653;` | Stores **decimal numbers** (double precision) |
| `char` | 2 bytes | `char letter = 'A';` | Stores **a single character** |
| `boolean` | 1 bit | `boolean isJavaFun = true;` | Stores **true** or **false** |

#### **Key Features:**
- **Memory-efficient:** They take up **fixed** amounts of memory.
- **Faster Processing:** Because they are **stored directly** in memory (stack).
- **Immutable:** The values themselves **cannot be changed**, but can be reassigned.

---

### **2. Non-Primitive Data Types (Reference Types)**
Non-primitive types are **complex** data types and include objects, arrays, and user-defined types.

#### **Examples of Non-Primitive Data Types:**
- **`String`** → `String name = "Java";` (Used for text)
- **`Arrays`** → `int[] numbers = {1, 2, 3};` (Used to store multiple values)
- **`Classes`** → `class Car { String model; }` (User-defined types)
- **`Objects`** → `Car myCar = new Car();` (Created from classes)
- **`Interfaces`** → Used for abstraction

#### **Key Features:**
- **Stored in heap memory** (Unlike primitives, which are in the stack).
- **Can be modified** (Unlike primitive values).
- **Have built-in methods** (e.g., `String.length()`).

---

### **Comparison: Primitive vs. Non-Primitive**
| **Feature** | **Primitive Types** | **Non-Primitive Types** |
|------------|------------------|------------------|
| Stored in | **Stack Memory** | **Heap Memory** |
| Value type | **Stores values directly** | **Stores references (addresses)** |
| Methods | **No methods** | **Has built-in methods** |
| Customization | **Cannot be modified** | **Can be customized** |
| Example | `int num = 10;` | `String text = "Hello";` |

***********************************************************************************************************************/