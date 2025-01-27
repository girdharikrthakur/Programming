# Character Class

---

### **Key Points About the `Character` Class**

1. **Wrapper Class**: Converts primitive `char` to an object (autoboxing).
2. **Immutable**: Instances of the `Character` class are immutable.
3. **Utilities**: Provides several static methods for checking, converting, and manipulating characters.
4. **Unicode Support**: Works with Unicode characters, making it suitable for internationalized applications.

---

### **Commonly Used Constructors**

Since Java 9, the constructor for the `Character` class is deprecated. Instead, you typically use the static methods of the class or autoboxing.

Example:

```java
Character ch = 'A';  // Autoboxing (Recommended)
```

---

### **Methods in the `Character` Class**

The `Character` class provides methods to check the type of character (e.g., digit, letter) and convert characters between cases. Below is a categorized list of its methods:

#### 1. **Character Checking Methods**

| Method                        | Description                                            | Example (`'A'`) | Result  |
|-------------------------------|--------------------------------------------------------|-----------------|---------|
| `isLetter(char ch)`           | Checks if the character is a letter                   | `'A'`           | `true`  |
| `isDigit(char ch)`            | Checks if the character is a digit                    | `'A'`           | `false` |
| `isWhitespace(char ch)`       | Checks if the character is whitespace                 | `' '` (space)   | `true`  |
| `isUpperCase(char ch)`        | Checks if the character is uppercase                  | `'A'`           | `true`  |
| `isLowerCase(char ch)`        | Checks if the character is lowercase                  | `'A'`           | `false` |
| `isAlphabetic(char ch)`       | Checks if the character is alphabetic                 | `'A'`           | `true`  |
| `isLetterOrDigit(char ch)`    | Checks if the character is a letter or digit          | `'A'`           | `true`  |

---

#### 2. **Character Conversion Methods**

| Method                        | Description                                            | Example         | Result  |
|-------------------------------|--------------------------------------------------------|-----------------|---------|
| `toUpperCase(char ch)`        | Converts a character to uppercase                     | `'a'`           | `'A'`   |
| `toLowerCase(char ch)`        | Converts a character to lowercase                     | `'A'`           | `'a'`   |
| `digit(char ch, int radix)`   | Converts a character to its numeric value in a radix  | `'9', 10`       | `9`     |
| `forDigit(int digit, int radix)` | Converts a numeric value to a character              | `9, 10`         | `'9'`   |

---

#### 3. **Other Utility Methods**

| Method                        | Description                                            | Example         | Result  |
|-------------------------------|--------------------------------------------------------|-----------------|---------|
| `getNumericValue(char ch)`    | Returns the numeric value of the character             | `'5'`           | `5`     |
| `charCount(int codePoint)`    | Returns the number of `char` values required           |                 |         |
| `toString(char ch)`           | Converts a character to a string                      | `'A'`           | `"A"`   |
| `hashCode()`                  | Returns the hash code for the character               | `'A'`           | `65`    |

---

### **Example Usage**

```java
public class CharacterExample {
    public static void main(String[] args) {
        char c = 'A';

        // Check character type
        System.out.println(Character.isLetter(c));        // true
        System.out.println(Character.isDigit(c));         // false

        // Convert character
        System.out.println(Character.toLowerCase(c));     // 'a'
        System.out.println(Character.toUpperCase('b'));   // 'B'

        // Numeric value
        System.out.println(Character.getNumericValue('9')); // 9

        // Convert char to string
        String str = Character.toString(c);
        System.out.println(str);                          // "A"
    }
}
```

---

### **Why Use the `Character` Class?**

- **Utility**: Helps with validation and formatting of `char` values.
- **Unicode Handling**: Supports internationalized text processing.
- **Static Methods**: Provides a clean and readable way to perform operations on characters.

---

### **FAQs**

| **Question**                                     | **Answer**                                                                 |
|--------------------------------------------------|----------------------------------------------------------------------------|
| Why is the `Character` class immutable?         | Wrapper classes are immutable by design to ensure thread safety and consistency. |
| Can `Character` handle Unicode characters?      | Yes, it supports Unicode characters and code points.                      |
| Is the `Character` constructor still used?      | No, the constructor is deprecated; use autoboxing or static methods.      |
| What's the difference between `isLetter` and `isAlphabetic`? | `isLetter` checks for letters; `isAlphabetic` includes letters and some symbols. |

---

