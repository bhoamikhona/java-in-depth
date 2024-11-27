# Section 03: Classes, Objects, and Their Members

## Table of Content

- [Section 03: Classes, Objects, and Their Members](#section-03-classes-objects-and-their-members)
  - [Table of Content](#table-of-content)
  - [Agenda](#agenda)
  - [Lessons Learned](#lessons-learned)
    - [Classes \& Objects](#classes--objects)
    - [Absolute Java Basics](#absolute-java-basics)
    - [Identitfiers - A Note on Naming Rules](#identitfiers---a-note-on-naming-rules)
    - [Variables - Introduction](#variables---introduction)
    - [Declaring \& Re-initializing Variables](#declaring--re-initializing-variables)
    - [Assignment 01 - Currency Converter - Creating a Class with Variables](#assignment-01---currency-converter---creating-a-class-with-variables)
    - [Variables - Primitive Types](#variables---primitive-types)
    - [Primitive Variables - Integers](#primitive-variables---integers)
    - [Other Integer Literal Formats](#other-integer-literal-formats)
    - [Primitive Variables - Floating-Point Numbers](#primitive-variables---floating-point-numbers)
    - [Floating-Point Pitfalls](#floating-point-pitfalls)
    - [Primitive Variables - Character Data Type](#primitive-variables---character-data-type)
    - [Alternate Ways to Initialize char Variables](#alternate-ways-to-initialize-char-variables)
    - [Primitive Variables - Boolean Data Type](#primitive-variables---boolean-data-type)
    - [Quiz 02 - Primitive Variables](#quiz-02---primitive-variables)
    - [Variable Kinds - Instance, Static, and Local Variables](#variable-kinds---instance-static-and-local-variables)
      - [Instance Variables](#instance-variables)
      - [Local Variables](#local-variables)
      - [Static Variables](#static-variables)
      - [Additional Notes](#additional-notes)
    - [Coding Exercise 01 - Cafe Order Processor - Putting Instance \& Static Variables to Work](#coding-exercise-01---cafe-order-processor---putting-instance--static-variables-to-work)
    - [Multi-Variable Declaration Statements](#multi-variable-declaration-statements)
      - [Example 01: Using a comma](#example-01-using-a-comma)
      - [Example 02: Initializing Variables Based on Another](#example-02-initializing-variables-based-on-another)
      - [Example 03: Re-initializing Variables in a Declaration](#example-03-re-initializing-variables-in-a-declaration)
      - [Key Points to Remember](#key-points-to-remember)
      - [Conclusion](#conclusion)
    - [Variables - Type Casting](#variables---type-casting)
      - [Implicit Casting](#implicit-casting)
      - [Explicit Casting](#explicit-casting)
      - [Information Loss in Explicit Casting](#information-loss-in-explicit-casting)
        - [Out-of-Range Assignments](#out-of-range-assignments)
        - [Truncation](#truncation)
      - [Information Loss in Implicit Casting](#information-loss-in-implicit-casting)
      - [Casting Use Cases](#casting-use-cases)
        - [Implicit Casting](#implicit-casting-1)
        - [Explicit Casting](#explicit-casting-1)
      - [Conclusion](#conclusion-1)
    - [Variables - Object References](#variables---object-references)
    - [Statements](#statements)
    - [Arrays](#arrays)
    - [Assignment 02 - Currency Converter - Array Creation \& Accessing its Elements](#assignment-02---currency-converter---array-creation--accessing-its-elements)
    - [2D Arrays](#2d-arrays)
      - [Array with Irregular Rows](#array-with-irregular-rows)
      - [Array Operations](#array-operations)
  - [Author](#author)

## Agenda

- Let's look at the agenda for this section.
- Java is an <ins>object-oriented programming language</ins> and so, we begin the section by discussing about <ins>object-oriented environment</ins> and its use in modeling real-world scenarios.
- For this we will introduce Java's two of the most fundamental object-oriented concepts called <ins>class</ins> and <ins>object</ins>.
- We'll understand this concepts conceptually and also see how they can be created in Java.
- We will next look at some absolute basic coding constructs in Java which we need to know before we start programming in Java.
- Our next few lessons will include an in-depth coverage of variables.
- A variable is a basic unit of a class and is responsible for holding data i.e. it is basically like a container.
- Now, while a variable in its very basic form can hold a single value, we often also need variables that can hold a group of values; and for that we can use an array.
- So, we next look at an array which would be our first data structure of the course.
- An array is also one of the most basic data structures any programming language supports.
- While variables help with holding a software's data, a software also needs something to encapsulate its business logic, and that's where methods come in.
- Our next few lessons will include an in-depth coverage of methods.
- Like a variable, a method is also a basic unit of a class.
- So, a software's business logic or algorithms will be part of methods.
- Finally, we will look at something called constructors which as the name implies, help in constructing something and that something would be objects.
- So, constructors help with creating objects.

## Lessons Learned

### Classes & Objects

- Object Oriented Programming (OOP)
  - OOP traces its roots in 1960s so, it is a very old programming paradigm.
  - It was conceived to implement large, complex projects in a simple way.
  - They help model real-world scenarios in a more natural way.
- Object - their states (attributes or properties or fields) and behavior (methods)
- `class` is like a blueprint and objects are instances of the `class`.
- Variables and methods in a `class` are considered as the members of the `class`.
- Variables (or state, or field, or attributes, or properties) hold data specific to that particular object instance of the `class`. This vary from one instance to another.
- Methods (behavior) - this is common to all instances of the `class` and they define their behavior.
- Creating a new object instance of a class using the `new` keyword.
- Initializing the state of an object instance using the dot operator.
- Invoking methods on object using the dot operator.

> [!NOTE]
>
> In a real object-oriented software, you would have tons of objects communicating with each other, and the way they do that is by invoking a method of the object and passing any necessary data as input.

### Absolute Java Basics

- Naming rules for classes, methods, and variables
  - First character: letter, underscore, $
  - Remaining characters: letter, underscore, $, numbers
  - No reserved keywords
  - Cannot have duplicate names
  - Cannot have duplicate methods
- Java is case-sensitive
- Printing to the console
  - `System.out.println()` - advances cursor to the next line
  - `System.out.print()` - advances cursor to the end of the same line
  - `System` is just a `class` in Java library and it has a variable called `out`.
  - So, we are saying `System.out` - and that's how we are accessing the variable `out`; and this variable `out` corresponds to an object.
  - That object has the methods `print()` and `println()` so, that's how we are printing.
- Comments/disabling code
  - Single line comment: `// single line comment`
  - Block comment: `/* block comment */`
- Arithmetic operations
  - `+`
  - `-`
  - `*`
  - `/`
  - `%`
- Every statement in Java must end with a semi-colon

### Identitfiers - A Note on Naming Rules

- This is a minor note on naming rules that we discussed in previous lecture.
- The names that we associate with classes, methods, variables, or any other user-defined item in the program are also sometimes formally referred to as Identifiers (or Java Identifiers).
- You may come across this term in some resources such as Java Language Specification.
- In the previous lecture, we also discussed the rules for these names, e.g., cannot start with a digit or cannot be a reserverd keyword.
- In addition to what we discussed, it cannot also be `null`, `true`, `false`.
- These are referred to as literals and will be discussed later in this section.
- So, just to summarize, an identifier will have the following rules:
  - It can include letters (a-z, A-Z), digits (0-9), the underscore character (\_), and the dollar sign ($).
  - It cannot begin with a digit. Subsequent characters can include a digit.
  - It cannot be a reserved keyword in Java (e.g., `class`, `interface`, `public`, `static`, etc.).
  - It cannot be `null`, `true`, `false`
  - Identifiers are case-sensitive (MyClass and myclass would be considered different).

### Variables - Introduction

- Data types
  - The type of the variable is define when it is first declared and once defined, it cannot be changed.
  - Due to this, Java is referred to as <ins>Statically Typed Language</ins> because the type of the variable is static once defined.
  - If you try to assign a value of different data type then compiler will throw an error and this type of checking by the compiler is called <ins>Static Type Checking</ins>.
  - If the variable holds raw data like an integer literal `1000` then it is referred to as a <ins>primitive variable</ins>.
  - Where as, the variable that holds an object is referred to as an <ins>object reference</ins>.
    - It is holding a reference to an object, not holding the object itself.
  - Java has 8 different primitive types. So, if a variable's data type is one of those primitive types, then it is a primitive variable.
  - If the variable's type is a class, then the variable will be an object reference.
  - It would also be an object reference if the variable's type is something called an interface.
  - Note that `String` is a `class` in Java so, variables holding a `String` are also an object reference.
- Declaring variables
  - Declaring primitive variables
  - Declaring object references using the `new` keyword.
  - literals are raw data. Examples:
    - `int id = 1000;` - 1000 is integer literal
    - `boolean flag = true;` - `true` is boolean literal
    - `String name = "john"` - "john" is string literal
- Expressions:
  - Something that gets evaluated to a single value. Example:
    - `int id = x;`
    - `int id = x + y;`
    - `Student s = new Student();`
- Declaration Statements
  - They can appear anywhere in a `class`.
  - Assignment statements.
  - Re-assigning values to a variable. Example:
    - `count = 23`;
    - `count = x + y;`
    - You cannot re-assign values to a variable at class-level.
    - They can appear inside the members of a `class` such as methods.
    - We will get a compilation error if we re-assign values to variables at class-level.

### Declaring & Re-initializing Variables

- Indentation
- Creating an object/instance of a `class` using the `new` keyword.
- Invoking methods on an object using the dot operator.
- Initialization is optional when declaring variables.
  - This is because every primitive type has a default value assigned to them. So, if you do not give them a value of your own, they will take the default value.
  - The variables declared within a method are called <ins>local variables</ins>; and local variables do not get any default value.
  - So, if you were to declare a local variable, not initialize it and then use it for something, the compiler will complain.
  - Only the variables declared at the class-level, without initialization take the default values.
  - NOTE: The variables declared at class-level are called <ins>instance variables</ins>.
  - We can also define a `static` variable at class-level.
  - So both, static variables and instance variables take default values if we do not assign a value of our own to them.
  - Local variables do not take default values if they are not initialized.
  - NOTE: Cannot re-assign values at class-level. So, if you declared an instance variable or static variable without giving it a value at class level. After that, you try to assign a value to it using an assignment statement, it will give you an error.
- Cannot use a variable before intializing/declaring it.
- When `+` is used with strings it acts a concatenation operator. Even if one of them is a `String`, it will concatenate the two operands.
- When `+` is used with numbers it is used as a plus operator. Both operands have to be numeric.

### Assignment 01 - Currency Converter - Creating a Class with Variables

### Variables - Primitive Types

- Java has 8 primitive data types:
  - `boolean`
  - Number
    - Integer
      - `byte`
      - `short`
      - `int`
      - `long`
    - Floating Point
      - `float`
      - `double`
    - Character
      - `char`
- Except for `boolean` the rest of the data types are numeric data types, even `char` which can be used to represent an alphabet, is a numeric data type as it is internally represented as an unsigned integer.
- So, `char` is also a numeric data type in Java and you should keep that in mind.
- The 4 different kinds of data types to store integer values have different sizes to store a number. This is helpful to use memory efficiently in memory constraint devices.
- The same is valid for floating point numbers.

### Primitive Variables - Integers

- In Java, integers can be represented by `byte`, `short`, `int`, and `long` data types.
- The table below gives more information on these integer data types.
  - First column shows the different integer data types.
  - Second column indicates their bit depth, which is nothing but the number of bits needed to internally represent the data type's variable value i.e. the container size i.e. the storage space needed for a variable value.
  - Third column indicates the range of values a variable of a particular type can take.
    - Note that range is dependent on the bit depth.
    - Higher the bit depth, larger is the range.
  - Fourth column indicates the default value of each data type.

| Type    | Bit Depth | Value Range                           | Default |
| ------- | --------- | ------------------------------------- | ------- |
| `byte`  | 8 bits    | -2<sup>7</sup> to 2<sup>7</sup> - 1   | 0       |
| `short` | 16 bits   | -2<sup>15</sup> to 2<sup>15</sup> - 1 | 0       |
| `int`   | 32 bits   | -2<sup>31</sup> to 2<sup>31</sup> - 1 | 0       |
| `long`  | 64 bits   | -2<sup>63</sup> to 2<sup>63</sup> - 1 | 0       |

- If you try to assign a value to a variable outside its value range then you get a compilation error.
- Note that we are using base 2 to define the value range and that is because computers use binary system, which deals with only 0s and 1s.
- Also, if you are wondering why the range for `byte` is -128 to 127, it is only because the bit depth is 8 which can be used to represent a total of 2<sup>8</sup> number, which equals to 256 numbers, and they fall in the range of -128 to 127, including 0.
  - The same goes for the other data types according to their bit depth values.
- Among the 8 bits, the left most bit, which is also called as the signed bit tells whether a number is positive or negative.
- If the signed bit is 0 then it is a positive number, otherwise it is a negative number.
- Generally, left most bit is also referred to as the most significant bit.
- The remaining 7 bits represent the magnitude of the number like 127.
- So, that's the reason the range is -2<sup>7</sup> to 2<sup>7</sup> - 1 (for `byte`, the same goes for others as well according to their bit depth), one of them is used as the sign bit.
- As good software engineers, we do need to have a clear idea of the different data types that are supported and how much memory they consume. So, firmly memorize the details in the table.
- Internally, Java represents something called as signed two's complement scheme to represent integer. That is also what computers use to represent integers.

> [!NOTE]
>
> If you don't know what is signed 2's complement scheme, read the following article: [Link to Article](https://www3.ntu.edu.sg/home/ehchua/programming/java/DataRepresentation.html)
>
> This article discusses signed 2's complement scheme as well as other schemes for representing floating point and characters, which we will discuss later.

- In Java, we don't have `byte` literal or `short` literal. We only have an `int` literal or a `long` literal.
- If you see an integer then it is an `int` literal.
- To make an `int` literal, a `long` literal, add a trailing `L` to the number.
- NOTE that the trailing `L` could either be lowercase or uppercase but, for readability it is recommended to use uppercase.
- The `int` literal can be assigned to only `byte`, `short`, and `int` data types. It cannot be assigned to `long` data type.
- The `long` literal can only be assigned to `long` data type, it cannot be assigned to `int`, `short`, and `byte`.
- So, there are two types of integer literals: int literal and long literal.
- You can use underscore _between_ numbers to make it more readable. The underscore cannot be at the beginning or the end of the number.
- `int` min and max values:
  - `Integer.MIN_VALUE`
  - `Integer.MAX_VALUE`
- `Integer` is a `class` that comes with Java library. It is called as either a <ins>Wrapper class/type<ins> or <ins>Boxed primitive</ins>.
- Every primitive data type has an associated boxed primitive.

### Other Integer Literal Formats

- Less commonly used
- Hexadecimal
  - Hexadecimal numbers start with `0x` where `x` can either be uppercase or lowercase.
  - The numbers following `0x` is the actual hexadecimal number itself.
  - Example: `0x0041` here `0041` is the actual hexadecimal number itself.
  - `0x` is just used to indicate that it is a hexadecimal number.
  - Hexadecimal format is very useful when representing very large or very small numbers.
  - It is also very useful in performing something called bitwise operations.
- Binary
  - Similar to hexadecimal numbers, binary numbers in Java start with `0b`
  - Example: `0b01000001` - where `0b` is used to indicate that it is a binary number and `01000001` is the actual binary number itself.
- Octal
  - For octal, the number starts with a `0` followed by the number itself. There is no single letter alphabet in between.
  - Example: `0101` where `101` is the actual octal number.
- Converting from Hexadecimal to Decimal and Binary to Decimal.
- Read 2's complement scheme to understand this better. (Not necessary) [Link to Article](https://www3.ntu.edu.sg/home/ehchua/programming/java/DataRepresentation.html)
- You can use underscore for readability in numbers even in hexadecimal, binary, and octal formats. Example: `0b0100_0001`
  - Remember that the underscore has to be in-between the numbers, not at the beginning or at the end of the number.
- These formats can also be used with `long` literals by using a trailing `L`. Example: `long intHex = 0x0041L;`

### Primitive Variables - Floating-Point Numbers

- Floating point numbers are real numbers like 3.14 and -0.014.
- In Java, floating point numbers can be represented by either `float` data type or `double` data type.
- The precision column in the table below represents the number of digits that we can have after the decimal point.
- Trailing `f` indicates `float` and trailing `d` indicates `double`. These trailing letters are mandatory (especially for `float`).
- If you do not include a trailing `f` for `float`, then the compiler will think that you are initializing a `float` data type with a `double` literal.
- For the value range, the notation `E` is called as exponential or scientific notation and `E` can be in either upper or lower case.
- Generally, such scientific notation is used only when representing very large or very small numbers.
  - Example: `double num = 3.8e4;` - this will result in 38000.0
- Range for `float`: -3.8 _ 10<sup>38</sup> to 3.8 _ 10<sup>38</sup>
- Range for `double`: -1.7 _ 10<sup>308</sup> to 1.7 _ 10<sup>308</sup>

| Type     | Bit Depth | Value Range         | Default | Precision              |
| -------- | --------- | ------------------- | ------- | ---------------------- |
| `float`  | 32 bits   | -3.4E38 to 3.4E38   | 0.0f    | 6 - 7 decimal digits   |
| `double` | 64 bits   | -1.7E308 to 1.7E308 | 0.0d    | 15 - 16 decimal digits |

- If a number has more decimal digits than what a `float` or `double` can represent, then it cannot be accurately represented and hence would be approximated. That is, the decimal digits will be reduced to 6 to 7 or 15 to 16 digits, depending on the data type, by rounding them.
- Pi is one such example.
- With real numbers, even with a small range of number like 0.1 and 0.2, we can have infinite real numbers.
- So, many of these numbers cannot be accurately represented by either `float` or `double` because they have limited number of bits.
- Of the two, it is recommended to use `double` as it is more precise.
- In general, you should stick with `int` and `double`.
- Use `long` when the integer falls outside of the range of `int`.
- Use `byte`, `short`, and `float` only if memory saving is important or if you think it helps with readability.
- Note that Game Development is one area where `float` is preferred over `double`.
- Internally, Java uses IEEE 754 floating-point scheme to represent `float` and `double`.
- Read about IEEE 754 floating-point scheme. (Not necessary) [Link to Article](https://www3.ntu.edu.sg/home/ehchua/programming/java/DataRepresentation.html)

### Floating-Point Pitfalls

- `float` and `double` are good for approximate results but, if you need exact and precise results then you should avoid them.
- Example: For an e-commerce website you need precise calculations so, in that case you should avoid `float` and `double`.
- This is because `float` and `double` are associated with some pitfalls.
- Pitfall Example 01: The result for `1 - 0.9` is `0.09999999999999998`
- Pitfall Example 02: The result for `0.1 + 0.2` is `0.30000000000000004`
- The reason for this is that numbers like 0.1 and 0.2 cannot be accurately represented within computers.
- This is due to the format that computers use.
- Computers follow the IEEE 754 floating-point format and specifically, they use Binary Floating-point format.
- In that format, such numbers cannot be accurately represented.
- This is an issue with all languages, it is not just with Java.
- The `0.1` in computers is represented like so: `0.0011001100110011...`
- The `0011` part after the decimal keeps repeating infinitely in the way these numbers are represented in the computer.
- However, both `float` and `double` have finite number of bits so, that huge value is truncated and/or rounded.
- Therefore, there is an approximation and not precision.
- The issue is that the denominator of these numbers are not power of 2.
- For example, if you take the number `0.1`, then it is equivalent to `1/10`.
- `10` in the denominator is not a power of 2.
- If you pick `2/10` = `1/5` = `0.2`. Here again, `5` is not a power of 2.
- If you take `5/10` = `1/2` = `0.5` - this has a denominator which is a power of 2 i.e. 2<sup>1</sup>. Therefore, this number can be accurately represented in computers.
- But, most of the numbers cannot be.
- This is especially an issue if we are dealing with money.
- So, when you are dealing with money, you should not be used `float` and `double`. It would be disastrous if you use it.
- Instead, use a recommended `class` in Java called `BigDecimal`.
- This `class` comes with the Java library and you can use it, especially when you are dealing with money, where you need exact results.
- Example:

```java
BigDecimal first = new BigDecimal("0.1");
BigDecimal second = new BigDecimal("0.2");

System.out.println(first.add(second));
```

- This `class` is a part of `java.math` package.
- `BigDecimal` is slow but, if you application needs it, you have to use it.
- So, any e-commerce application uses this if they are built using Java.

> [!TIP]
>
> In the book Effective Java, there is an item #48 in 2nd Edition or item #60 in 3rd Edition (items are just rules or best practices), which states that "Avoid float and double if exact answers are required."
>
> That is what we discussed in this lesson and along with that it also talks about using `BigDecimal` but, it has some more information beyond what we discussed in this lesson.
>
> So later, once you are through this course, give it a look.

### Primitive Variables - Character Data Type

- If we want our variables to hold single letter characters like alphabets, or a digit like 0, or a special symbol like dollar sign then in Java, you would declare such a variable with `char` data type.
- Example: `char degree = 'B';`
- We use `char` literals to assign values to `char` and we use double quotes around those values.
- Although we are using characters, internally Java uses 16-bit unsigned integer scheme to represent characters.

> [!NOTE]
>
> Read about 16-bit unsigned integer scheme. (Not necessary) [Link to Article](https://www3.ntu.edu.sg/home/ehchua/programming/java/DataRepresentation.html)

- Unsigned integers represent 0 and positive numbers but, not negative numbers.
- Essentially, characters are integers internally.
- Example: char literal `'B'` would map to integer `66` internally.

| Type   | Bit Depth | Value Range             | Default  |
| ------ | --------- | ----------------------- | -------- |
| `char` | 16 bits   | 0 to 2<sup>16</sup> - 1 | `\u0000` |

- Bit depth for `char` data type is 16 bits so, `char` value will be represented in 16 bits.
- Because it is unsigned, the range is 0 to 2<sup>16</sup> - 1 i.e. 0 to 65,535.
- Note that here 2 is raised to the power of 16 unlike in the other cases of integer data types. This is because here we are dealing with unsinged integers i.e. no negative numbers.
- In other words, we do not need any special signed bit as with any other integer data types in Java.
- In other integer data types, we need a signed bit to distinguish between negative and positive numbers.
- So, with unsinged integers, all of the bits together represent the magnitude.
- Recall that with signed integers, the bits following the signed bit represent the magnitude.
- This means that we can represent as many as 2<sup>16</sup> i.e. 65,536 characters in Java.
- So, a `char` variable can take any of those 65,536 characters and the corresponding integer value will be stored internally in the memory.
- For example the integer 66 will be stored in the memory for the character `B`.
  If you are wondering what makes up all those 65,536 characters since we only have 26 English characters, and we can double that number to account for uppercase and lowercase alphabets, and we only have 0-9 digits and a few special symbols then what makes up for 65,536 characters?
  We need to remember that we have many characters in the world and each of those languages have many characters.
- So, we have many characters to represent.
- For instance, we should be able to represent a character such as this: ఈ. This character belongs to one of the Indian languages called Telugu.
- We even need to store emojis like this one: 😂
- So, we have many such symbols that we need to be able to represent.
- Therefore, there is a mapping between characters and the corresponding integer values get stored internally.
- This mapping is defined by the Unicode character set.
- Unicode is a standard character set like ASCII, but can represent all characters in all languages across the world.
- It can represent all those exotic symbols too.
- It does so by associating every character with a hexadecimal number called **code point**.
- That hexadecimal number maps to some integer value, which is what is stored internally in binary format.
- But Unicode is a standard specification and it can have different - implementations.
- Java uses one such implementation called UTF-16.
- Such an implmentation is referred to as an **encoding scheme**.
- There are other schemes too like UTF-8 and UTF-32. They vary in the storage space they use.
- For instance, UTF-16 might use 16 bits for a particular character while UTF-8 might use only 8 bits for the same character.
- So, Unicode is a character set and UTF-16 is the encoding scheme that Java uses.
- UTF-16 also defines hexadecimal numbers like Unicode.
- For most characters, it uses the same hexadecimal numbers as Unicode.
- So, in Java, every valid character literal is encoded as a UTF-16 hexadecimal number.
- For instance, the `char` literal `'B'` would be encoded as UTF-16 hexadecimal number `0042`, and its corresponding 16-bit unsigned integer: `00000000 01000010` is what gets stored internally. `0100` is 4 in binary and `0010` is 2 in binary therfore `01000010` represents 42 in binary.
- So, that's the benefit of hexadecimal numbers.
- It can be easily mapped to the binary format.
- And this 16-bit unsigned integer: `00000000 01000010` corresponds to the decimal value `66`.
- So, that's how the character literal B is mapped to 66.
- So, for every character, you can imagine such a tupple: `<'B', \u0042, 66>`.
- Here we have the character uppercase `B` and it is associated with UTF-16 hexadecimal number `0042` and also decimal number `66`.
- The binary equivalent of `66` is what is stored internally.
- Note that both hexadecimal `0042` and `66` correspond to the same binary number.
- In fact, the char variable degree can also be directly assgined such a hexadecimal number.
- That is, we can assign a literal such as this one: `'\u0042'`.
- This is called as Unicode Escape Sequence where we have a backslash followed by u, followed by the hexadecimal number 42.
- `u` here stands for Unicode and it needs to be in lowercase. Otherwise, we will get a compiler error.
- Typically, you would use `char` literals for variable initialization, but sometimes, if you have to represent certain special characters and if your editor does not support them, then you can use such **Unicode escape sequence** for initialization.
- The default value for `char` is `\u0000` which is shown in the table above. This unicode represents a `null` character.
- A `null` character is a control character. Meaning that it is not something that you can print.
- In input/outpput section, one of the first lessons gives us a very detailed introduction to character encoding.
- In fact, it is a prerequisite lesson for that section.
- So, if you are not familiar with encoding, you can learn about it when you get there.
- This article also discusses about character encoding: [Link to Article](https://www3.ntu.edu.sg/home/ehchua/programming/java/DataRepresentation.html)
- Empty character literal `''` is not allowed. But a space character `' '` is valid.
- The wrapper class or the Boxed primitive for `char` is a `class` called `Character`.

### Alternate Ways to Initialize char Variables

- `char` variable can also be initialized using an `int` literal since internally, `char` value is represented using the unsinged integer scheme.
- The value of the integer must be between 0 to 65,535 otherwise, we will get an error.
- Since integer can also be represented in hexadecimal, octal, and binary. We can also assign a value to the `char` variable using those formats as long as they are within `char`'s value range.
- If you assign a `char` literal to an `int` data type, you will get the corresponding decimal value of the `char` literal.
- Example: `int intChar = 'A';` - here the variable `intChar` will be assigned the value of `65` since that is the decimal value corresponding to the character `'A'`.
- So, a `char` variable can be initialized with a `char` literal, or a unicode escape sequence, or an `int` literal and internally, it is stored as an unsigned 16-bit integer whose range is 0 to 65,535.

### Primitive Variables - Boolean Data Type

- Boolean can take either `true` or `false` as values and therefore, it is a binary data type.
- By default, a `boolean` variable is initialized with `false` if you do not give it a value of your own.
- It's bit depth is not precisely defined and it is specific to a particular JVM implementation i.e. it can vary from one JVM to another.
- They are mostly used in control flow statements.

### Quiz 02 - Primitive Variables

### Variable Kinds - Instance, Static, and Local Variables

- Java has three main types of variables: **Instance**, **Static**, and **Local**.

#### Instance Variables

- **Definition**: Variables that are specific to an object (instance) of a `class`.
- **Key Points**:
  - Hold the **state of an object**; each object has its own copy.
  - Must be declared **at the class level** (not inside a method or constructor).
  - **Access**:
    - Within the same `class`, they can be accessed directly without using an object reference.
    - Outside the `class`, they must be accessed using the **dot operator** with an object reference:  
      `objectName.instanceVariable`.
    - Cannot be accessed using the `class` name; doing so results in an error.
  - **Defaults**: Automatically initialized to default values:
    - `null` for object references.
    - `0` for numeric types.
    - `false` for boolean types.
  - Cannot be re-initialized or re-assigned directly at the `class` level.
  - Also referred to as **fields** or **attributes**.

#### Local Variables

- **Definition**: Variables declared inside a method or constructor, local to that block of code.
- **Key Points**:
  - Used for computations or temporary storage within methods.
  - Must be explicitly initialized before use; they do **not** get default values.
  - Cannot be accessed outside the method or block where they are declared.
  - Method parameters are also treated as local variables.

#### Static Variables

- **Definition**: Variables associated with the `class` rather than any specific instance.
- **Key Points**:
  - Declared using the `static` keyword:
    ```java
    static int count = 0;
    ```
  - **Shared** among all objects of the `class`—maintains a **single copy**.
  - **Access**:
    - Recommended: Use the **class name** to access static variables:  
      `ClassName.staticVariable`.
    - While they can be accessed via an object reference, it is **not recommended**.
  - **Defaults**: Automatically initialized to default values (like instance variables).
  - Cannot be re-initialized or re-assigned directly at the `class` level.
  - Also referred to as **class variables**.

#### Additional Notes

- The **dot operator (`.`)** is used to access variables and initialize an object's state.
- **Default Values**:
  - Primitive types (e.g., `int`, `double`) are initialized to `0`, `0.0`, etc.
  - Object references (e.g., `String`) are initialized to `null`.

### Coding Exercise 01 - Cafe Order Processor - Putting Instance & Static Variables to Work

### Multi-Variable Declaration Statements

- In Java, it is valid to declare multiple variables in a single statement, provided all variables are of the same type.

#### Example 01: Using a comma

```java
// Correct: Both variables are of the same type and declared on one line.
double tuitionFees = 12000.0, internationalFees = 5000.0;

// Correct: `tuitionFees` is declared but not initialized, so it gets a default value of 0 if declared at the class level.
// Inside a method, this will result in a compilation error unless `tuitionFees` is explicitly initialized before use.
double tuitionFees, internationalFees = 5000.0;

// Incorrect: Specifying the data type for each variable in the same statement is not allowed.
double tuitionFees = 12000.0, double internationalFees = 5000.0; // Error
double tuitionFees = 12000.0, int internationalFees = 5000;      // Error
```

#### Example 02: Initializing Variables Based on Another

```java
// Correct: `internationalFees` is initialized using `tuitionFees`.
// The scope of `tuitionFees` begins immediately after its initialization.
double tuitionFees = 100, internationalFees = tuitionFees + 5000.0;
```

#### Example 03: Re-initializing Variables in a Declaration

```java
// Correct: `tuitionFees` is re-initialized to 5000.0, and that value is also assigned to `internationalFees`.
double tuitionFees = 100.0;
double internationalFees = tuitionFees = 5000.0;
```

#### Key Points to Remember

1. Class-Level Variables (Static and Instance):

- At the class level, variables cannot be re-initialized using a standalone assignment statement.
- Re-intialization is allowed if it is part of a declaration statement.

```java
// Error: Reassignment of `tuitionFees` at the class level.
double tuitionFees = 100.0;
tuitionFees = 5000.0; // Compilation error

// Correct: Reassignment as part of a declaration statement.
double tuitionFees = 100.0;
double internationalFees = tuitionFees = 5000.0;
```

2. Scope and Initialization

- Variables declared at teh class level are automatically initialized to their default values (e.g. `0` for numeric types).
- Variables declared inside a method do not receive default values and must be initialized explicitly before use.

```java
double tuitionFees, internationalFees = 5000.0; // Correct at class level
```

3. Declaration Dependency:

- If a variable is used as a part of a declaration statement before it is declared, a compilation error occurs.

```java
// Error: `tuitionFees` is used before it is declared.
double internationalFees = tuitionFees = 5000.0; // Compilation error
```

#### Conclusion

- You can declare multiple variables in the same statement, provided they are of the same type.
- The tpe can only be specified once in the statement.
- Re-initialization of variables is allowed as part of a declaration statement, even at class level, but standalone re-assignment is not.

### Variables - Type Casting

- So far we looked at the different data types and we also know that Java is a statically-typed language i.e. once a variable is declared with a particular type, it can only be assigned values of that type.
- However, sometimes we may have to assign the variables with a value which is of some other data type and in that case, that value must be casted i.e. converted to the data type of the variable and that's where type casting comes into play.
- So, type casting is necessary when we want to assign a variable or a literal of one data type to a variable of another type.
- Type casting is possible only between numeric primitive types.
- Cannot type cast to `boolean` or vice versa.
- Type casting can either be implicit or explicit.

#### Implicit Casting

- Implicit casting is required when we want to assign a variable or a literal of smaller type to a variable of larger type.
- In this case, we say that the **widening conversion** is being performed as the type of the value on the right is being widened.
- Here the notion of smaller and larger types is based on the range of values they support.

```java
// Example:
int x = 65;
long y = x; // Implicit casting by compiler
```

- Implicit casting is performed by the compiler, automatically.
- In the example, the value assigned to variable `y` will be casted so that it will have 64 bits as bit depth since that is the bit depth of `long` data type.
- Note that `x` will still have the value 65 with the bit depth of 32.
- The diagram below shows the order of implicit casting performed by the compiler:
- ![order-of-implicit-casting](https://github.com/user-attachments/assets/c395952d-fcaa-48e3-ba83-c74ed97d75ce)
- As an exmaple, you can see that assigning `byte` to `short` or to any other data type except `char` is implicit.
- Assigning `byte` to `char` would be explicit, we will learn why soon.
- Assigning integer to a floating point variable would also fall under implicit casting since the range of value for `float` or `double` is larger than any of the integer data types.
- So, range of values is what is dictating this order.
- Assigning `char` to `int` is also implicit as the range of `char` is well within the range of `int` data type.
- We know that `char` is internally represented by a 16 bit unsigned integer.
- Likewise, assigning `char` to other, larger data types like `long`, `float`, or `double` would also be implicit.
- If we reverse the direction of arrows then we would get the order of explicit casting.

#### Explicit Casting

- ![order-of-explicit-casting](https://github.com/user-attachments/assets/70ea07ba-a378-499d-b36d-29ec636661b1)
- We need explicit casting if we want to assign a variable or a literal of larger type to a variable of smaller type.
- In this case, we say that a narrowing conversion is being performed as we are narrowing down the type.
- In this diagram, apart from reversing the direction of the arrows, two new bi-directional arrows have been added connecting `char` & `byte` and `char` & `short` implying that any assignments between them would require an explicit cast.
- This is because `char` is not within the range of `byte` or `short`.
- Note that even though `char` and `short` have a bit depth of 16, assigning `char` to `short` would still require an explicit cast.
- That's because, for `char` the range is 0 to 2<sup>16</sup> - 1 but, for `short`, 2 is raised to the power of 15 and that's because the range is -2<sup>15</sup> to 2<sup>15</sup> - 1.
- So, `char` can fall outside this range.
- Just note that casting to `char` is always explicit and the reason for this is all the other numeric data types can have negative values while `char` is represented by an unsigend integer which can be 0 or positive but, not negative.

```java
// Example
long y = 42;
int x = (int) y; // int in parentheses is the explicit cast
```

- Applied cast should be compatible with the data type of the variable on the left side i.e. the type specified with the cast has to be the same or of a lower type but, not larger type.
- In the example above, it has to be `int` or any type smaller than `int`, including `char` as it is unsigned integer.
- Without the cast, we would get a compiler error even though 42 is a valid `int`.
- That's because `y` on the right hand side is an expression which would get evaluated to 42 only at runtime.
- Compiler just does not know that and all it knows is that `y` is of type `long` and it warns us that we might be doing something wrong here by assigning a larger variable to a smaller one.
- So, we need to inform the compiler that we are fine with the assignment by inserting an explicit cast.
- Just note that with regards to implicit casting, although it is taken care of by the compiler, if you want, you can stil apply a superfluous cast.

```java
// Example
byte b = 65;
char c = (char) b; // c = 'A'
```

- In this example, a `byte` is casted to a `char`.
- Since the `byte` value is 65, the corresponding UTF-16 value uppercase 'A' is assigned to the variable `c`.
- Here, both widening and narrowing conversion is being applied.
- First, `byte` is converted to `int` through widening conversion and then the resulting `int` is converted to `char` through a narrowing conversion.

```java
// Example
char c = 65; // c ='A'
```

- Here, `char` variable is assigned an `int` literal 65.
- In this case, we do not need an explicit cast since 65 is within the range of `char`.
- However, if the literal is outside the range of `char`, then we would need to insert an explicit cast to avoid a compilation error.

```java
// Example
short s = 'A'; // s = 65
```

- Here a `short` variable is assigned a character literal.
- The variable `s` gets assigned the decimal equivalent 65.
- Once again, no explicit cast is required since 65 is within the range of `short`.
- A cast would be needed if the assigned literal was outside `short` range.
- But out of range assignments would also lead to information loss so, let's look at that.

#### Information Loss in Explicit Casting

##### Out-of-Range Assignments

```java
// Example
byte narrowByte = (byte) 123456; // 64
```

- Here is one scenario where there is information loss due to out of range assignment.
- The value 123456 is outside the range of `byte` and there is an explicit cast in the example and the variable get assigned a weird number, which in this case is 64.
- 64 is assigned because JVM discards all but the lower eight bits of the binary equivalent of the number 123456.
- And those lower 8 bits which appear on the right side of the bit pattern corresponds to the decimal 64.
- So, if we convert 123456 to binary then it equals to 11110001001000000.
- Recall that the bit depth of `byte` is 8 bits. So, it can only store 8 bits of data but here, the number we are trying to store is of 17 bits. So, it will store the last 8 bits as its size and the rest of the bits will be discarded.
- Therefore:
  byte narrowedByte = (byte) 123456; -->
  byte narrowedByte = (byte) 111100010**01000000**; -->
  byte narrowedByte = 01000000; -->
  byte narrowedByte = 64;
- That's how we get the number 64.
- Here, only lower 8 bits are considered as the variable is a `byte` which has only 8 bits.
- So, there is an information loss here.
- Essentially what is happening here is that the variable is a small container since it is a `byte` and we are trying to fill it with something that is not going to fit inside that container.
- So, some of the stuff that we are trying to fill it with is going to spill and hence, there is information loss.

##### Truncation

- Second scenario of information loss is when we try to cast a floating point literal or a floating point (`float`, `double`) variable to an integer (`byte`, `short`, `int`, or `long`) or char variable.
- In this case, it will always truncate the number.

```java
// Example:
int x = (int) 3.14f; // x = 3

int y = (int) 0.9; // y = 0


// first 65.5 is converter to int, then that int is converted to corresponding character in UTF-16
char c = (char) 65.5; // c = 'A'
```

- Explicit casting could be needed even if we are dealing with letters.
- Just keep in mind that the main reason for explicit casting is because the value assigned could be outside the range of the variable on the left hand side.

#### Information Loss in Implicit Casting

- Generally, you not encounter information loss with implicit casting.
- Lot of books and instructors say that there is no information loss with implicit casting but, to be precise, for a few assignments, there is a possibility of some information loss.
- For example, let's consider the depiction of implicit casting order once again.
- ![information-loss-implicit-cast](https://github.com/user-attachments/assets/92685e87-c11a-4eab-8a2d-eff743777502)
- Here, assigning an `int` to `float` or a `long` to `float` could lead to loss of precision as the resulting value may lose some of the least significant bits of the value that is being assigned.
- This loss of precision may also happen when a `long` is assigned to a `double`.
- Note that `int` to `double` is fine.
- Let's look at this simple example:

```java
int oldVal = 1234567890;
float f = oldVal; // implicit cast
int newVal = (int) f; // 1234567936
```

- Here an `int` variable called `oldVal` is assigned to a `float`.
- In this case, there would be a loss of precision.
- In the next statement, we are casting that `float` back to `int` variable `newVal`.
- When we print `newVal`, we will see that it is significantly larger than `oldVal`.
- So, when `oldVal` was assigned to `float`, it was rounded to a larger number and hence there is a slight loss of precision.
- So, there can be some loss of information even with implicit casting, but that's a pretty uncommon case.

#### Casting Use Cases

##### Implicit Casting

```java
float f1 = 3.133f;
float f2 = 4.135f;

go (double d1, double d2) {
  ...
}

go(f1, f2);
```

- In this case, when we are calling the `go()` method, the variable `f1` will be assigned to parameter `d1` and variable `f2` will be assigned to parameter `d2`. So, to make this happen, an implicit cast will be performed from `float` to `double`.
- This kind of implicit casting is pretty common when dealing with methods.

##### Explicit Casting

```java
double avg = (2 + 3) / 2; // 2.0, not 2.5
```

- In Java, this calculation would result in 2.0 instead of 2.5 since both, 2 and 3 here are int literals.
- Although we have a `double` on the left side, we still end up with the value 2.
- We will discuss the reasoning for this when we learn about arithmetic operators.
- To get the right value i.e. 2.5, we would have to apply explicit cast, like so:

```java
double avg = (double) (2 + 3) / 2;
```

- So, if you are performing such kinds of arithmetic operations involving division operator, there is a chance you may have to insert explicit cast.

#### Conclusion

- Casting is mainly needed when we want to assign a variable or a literal of one type to a variable of another type.
- An explicit cast comes into play when there is an issue with the range of values.

### Variables - Object References

- Variables of reference type.
- Reference type can either be a `class` or an `interface`.
- Object reference variable types hold reference to an object.
- In other words, they hold bits that reference an object in memory.

```java
Student s = new Student();
```

- Creating a new object reference has 3 parts in it and each of these parts inform JVM to do something.
- The first part `Student s` tells JVM to allocate space in the memory for a reference variable.
- The part `new Student()` tells JVM to allocate space for a new `Student` object in the memory.
- At this point, we have space in memory for a reference variable and a `Student` object.
- Finally, the assignment operator `=`, assigns the memory address of the `Student` object to the variable `s`.
- So, variable `s` now holds the memory address of the `Student` object.
- ![object-reference-1](https://github.com/user-attachments/assets/287c89b0-e2e7-4b86-81e5-54052067eb40)
- Objects are stored in a special area of memory, which is assigned to JVM.
- When JVM starts up, like any process, it gets a chunk of memory from the underlying operating system in order to run its programs.
- One area of this memory is referred to as heap.
- All objects are stored in the heap.
- In our example, variable `s` references one `Student` object on the heap.
- Bit depth is JVM specific for object references i.e. bit depth of an object reference on one JVM may be smaller or larger than bit depth of an object reference on another JVM.
- However, on a given JVM, all object references will have the same bit depth, regardless of objects that they reference.
- So, the size of the object does not matter.
- One object may have 20 instance variables, while another might just have one instance variable.
- But, the object references that are referencing them will have the same bit depth.
- Default value for an object reference is `null`.
- So, if you do not initialize an object reference, it gets a default of value of `null`, and it is called a null reference, and it implies that object reference is not pointing to anything.
- Just think of `null` as a special literal.
- You can also explicitly initialize an object reference with `null`.
- In the example below, the variable `s` will be assigned the default value of `null`.

```java
Student s; // Initialized to null
```

- Using a dot operator on `s`, which has a value of `null`, will lead to an exception called `NullPointerException`.

```java
Student s; // Initialzied to null
s.updateProfile(); // NullPointerException
```

- `NullPointerException` is simply an error that occurs at runtime.

### Statements

- Every statement in Java ends with a semi-colon and it is basically a **command** to be executed.
  - Declare a variable
  - Change the value of a variable
  - Invoke a method
- A statement basically changes program's state i.e. as a statement is executed, the state of the program also gets affected.
- Statements is made up of one or more expressions.
  - A variable can be assigned a literal or an expression.
  - Expression is something that gets evaluated to a single value.
  - This evaluation happens at runtime.
  - An expression can be built using literals, variables, operators, and method calls.
- Example:

```java
int count = x * getCount();
```

- This statement includes four expressions:
  - `x`
  - `getCount()`
  - `x * getCount()`
  - `count = x * getCount()`
- The last two are referred to as **compound expressions**.
- So, compound expressions are generated from smaller expressions.
- Every expression, regardless of whether it is compound or not, gets evaluated to a single value at runtime.
- Statments can be of three kinds:
  - Declaration Statement
    - `int count = 25;`
  - Expression Statements
    - If expressions appear separately with a semicolon, then they are referred to as expression statements.
    ```java
    // Examples
    count = 25; // assignment statement
    getCount(); // method invocation statement
    count++; // increment statement
    ```
  - Control Flow Statements
    - Control flow statements regulate the order in which statements get executed.
    - `if (count < 100) { ... }`
- Among these three types of statements, ONLY declaration statements can be defined at class level.
- Expression or control flow statements can be a part of methods or other similar class level declarations e.g. constructors, nested classes, interfaces, or initializer blocks.
- We will get a compiler error if we declare expressions or control flow statements at class level.
- At class level you can have:
  - Field/Properties/Attributes/State declarations
  - Method declarations
  - Constructor declarations
  - Nested class & interface declarations
  - Instance and static initializers

### Arrays

- We know that a variable is like a container that holds a single value be it primitive or an object reference.
- However, sometimes we would have a collection of similar values and we would want a variable to hold such a collection.
- Such a variable that holds a collection of similar values is like a collection of containers, and would represent some data structure.
- For instance, if we have to keep track of all the course titles that a student has registered for, then instead of having a separate variable to hold each of those course titles, we can store all of those in a single data structure which is represented by some variable.
- A data structure is an organized collection of similar data, and software gets lot of its power through different data structures that it uses.
- So, data structures are very fundamental to any programming language.
- Now, let's look at one very basic and fundamental data structure, which is also built into every programming language, and it is an array.
- In fact, it is so basic that even some of the data structures that we will study later are built on top of arrays.
- An array is basically a container **object** that holds **fixed** number of values of a **single type**.
- The term "object" in this definition implies a Java object i.e. in Java an array is basically an object hence, it will be stored in the heap like any other object.
- So, in Java, an object can be an array, or it can also be an instance of a `class`.
- Since array is an object, the variable referencing it is an object reference.
- By "fixed number" we mean that the number of items an array can store is specified at the array creation time, and that number cannot be changed thereafter.
- So, the size of an array is fixed in Java.
- By "single type" we mean that the items in an array should be of a single data type like an `int`, `double`, `char`, or even some `class` i.e. it can also store object references but, the only condition is that they all have to be of the same data type.
- Each item in an array is referred to as an element of the array, and an element is accesed by its index number, where the index number is the numerical position of the element.
- Index numbering starts with 0.
- Three ways to create an array:

```java
// FIRST
int [] scores = new int[4]; // 4 is the size (length) of the array

// SECOND
int [] scores = new int[] {90, 70, 80, 100}; // 90, 70, 80, 100 are the values that will be initialized with the array. We do not need to mention the size of the array here since it is implicitly implied or we will get an error.

// THIRD
int [] scores = {90, 70, 80, 100}; // short-hand version of the second way of creating an array.
```

- If you do not initialize the values for an array, the default values of the data type of the array will be applied to each element of the array.
- You can also set and access the elements of an array using their index and square brackets notation. Example: `scores[0] = 100` this will set the first element of the `scores` array to 100.
- This is also a valid way of declaring an array: `int scores[] = new int[4]`
- All of the elements of the array must be of the same type otherwise, we will get an error.
- The second and third way of creating an array is used when you have a small array and you know the values. Otherwise, the first way of creating the array is used.
- Since array is an object, if you do not initialize it, you will get `null`. Example: `int[] scores;`
- Note that the third way of creating an array, the part of initialization i.e. `{90, 70, 80, 100}` can only be used in a declaration statement. This kind of syntax cannot be used for re-initialization or re-assigning values to an array.
- To get the length of an array, we use the `.length` property on the array.
- Negative indexing is not allowed in Java.

> [!NOTE]
>
> You can access another class from your current class if it is the same folder and create its object.

### Assignment 02 - Currency Converter - Array Creation & Accessing its Elements

### 2D Arrays

- Let's now look at two dimensional (2D) arrays. What we saw in the previous lesson was a one dimensional array.
- A one dimensional (1D) array can be visualized as a sequence of elements laid out along a line.
- In a 2D array, you can visualize elements to be laid out in a grid form, like a matrix.
- In fact matrices are usually implemented in a 2D array.
- It is also possible to have arrays of higher dimensions but, they are very rare in practice.
- So, let's now go ahead and see how 2D arrays are created.
- ![2d-array-1](https://github.com/user-attachments/assets/cfd43540-2a95-40bc-9955-d735ea708e5f)
- In a 2D array, elements are arranged in rows and columns.
- In the image above, we have a 2D array that has 4 rows and 2 columns and has a total of 8 elements.
- Like a 1D array, a 2D array is aloso an object in Java, and it can store both, primitives and object references.
- Index numbering for both rows and columns begin with 0.
- Now, if this array (image above) is named as `myArray`, then `myArray[0][1]` would return the element from 0th row and 1st column, which has the value of `11` in this case.
- So, matrices can be implemented using such 2D arrays.
- Similarly, if you take our student example and consider their assignement scores in a particular course, then we can store that information in a 2D array.
- Each row can correspond to a student and the value stored in each row can be the assignment scores.
- Like in the case for 1D arrays, there 3 ways to create a 2D array.
- They are also created using similar syntax.
- Let's look at how we can create our `myArray` example.
- Here is the first way to do it:

```java
int[][] myArray = new int[4][2];
```

- Similar to 1D array, we use the keyword `new`.
- In 1D array, we have only one pair of square brackets on either side of the assignment statement.
- Since we now have 2 dimensions, we will now have 2 pairs of square brackets on either side of the assignment statement.
- On the right hand side, the number of rows is indicated in the first square bracket while the number of columns is indicated in second square brackets.
- ![2d-array-2](https://github.com/user-attachments/assets/de4d2462-c6f5-40c8-8d0a-f859a443aef8)
- The square brackets on the left hand side will be empty.
- Let's see how JVM internally implements this 2D array.
- JVM basically creates a 1D array with 4 elements corresponding to the 4 rows.
- ![2d-array-3](https://github.com/user-attachments/assets/6fcfc228-5c36-4230-a40e-784a57dc3eac)
- These four elements do not contain the raw data but, each of the elements is actually an object reference, referring to another `int` array with 2 elements.
- ![2d-array-4](https://github.com/user-attachments/assets/6e13527f-71f6-4dd8-bf9c-6df6378c312c)
- These referenced `int` arrays represent the actual rows and they contain the actual data.
- As the type for the array is `int`, all of the internal arrays are initialized with default of 0.
- You can also see the 2D index numbers associated with each element.
- ![2d-array-5](https://github.com/user-attachments/assets/ea984d43-7bae-42a6-a5ad-95cda3fa119d)
- So, you can see that a 2D array is actually implemented as a 1D array, and their elements are simply object references, which are in-turn referencing 1D arrays.
- This fact can be observed in the 2D array declaration itself.
- So, let's review the declaration once again.
- We know that an array declaration includes a type followed by a set of square brackets, which is then followed by the array name, and we can read it as array of type.
- ![2d-array-6](https://github.com/user-attachments/assets/f229588a-d9b9-4ee8-b4e3-c8440c889829)
- Now if the type is `int`, we can read it as the array of `int`, and we know it is an one dimensional array.
- ![2d-array-7](https://github.com/user-attachments/assets/845892e5-ab27-4d92-a8c4-7dddae0d2300)
- Now if the type itself is "array of int" then we can read it as "array of array of int" or in other words, an array of an `int` array.
- ![2d-array-8](https://github.com/user-attachments/assets/b2061715-7081-4a24-b895-41bf90784b6c)
- So, although it represents a 2D array, in reality it is an 1D array.
- Now in our `myArray` example, elements were initialized with default values.
- So, next we need to initialize them explicitly and we can do that as shown here:
- ![2d-array-9](https://github.com/user-attachments/assets/e251829c-825b-4005-99bf-9b231c76ee3d)
- This is the illustration of how the array looks after the element initialization:
- ![2d-array-10](https://github.com/user-attachments/assets/542cbbb5-dfdd-4a97-ba97-5a787dd6aec3)
- Here is the second way to create a 2D array:
- ![2d-array-11](https://github.com/user-attachments/assets/63d6645f-0e02-4363-aa4c-06c61688aaf2)
- In a 1D array we only comma separated values but, we know that a 2D array is an "array of array of some type".
- So, we have one array, and within that array we have nested arrays with each nested array corresponding to a row.
- ![2d-array-12](https://github.com/user-attachments/assets/a9b77656-5353-4d32-90a6-97ed36854b19)
- For each nested array, we will have a pair of nested braces and the actual data will reside in the nested braces.
- Finally, as in the case of an 1D array, we have this simplest notation:
- ![2d-array-13](https://github.com/user-attachments/assets/61753e59-a79f-40ae-98d8-a13b00830baa)

#### Array with Irregular Rows

- Now here we have something interesting.
- In our `myArray` example, we saw that there were 4 rows and all of the rows were storing the same number of elements i.e. 2 elements.
- So, each will have 2 elements but, due to the way Java implements 2D arrays, it is also possible for different rows in a 2D array to have different number of elements.
- So, let's see how that's possible and also where it can be useful.
- Here we created 2D arrays with 2 rows:

```java
int [][] myArray = new int[2][];
```

- But, we didn't specify any value for the number of columns.
- Next we create the first row, which would have 5 elements of 5 columns.

```java
int [][] myArray = new int[2][];
myArray[0] = new int[5];
```

- The second row would be created with 2 elements:

```java
int [][] myArray = new int[2][];
myArray[0] = new int[5];
myArray[1] = new int[2];
```

- So, as you can see, the column size is not fixed.
- First row now has 5 columns, while the second row has only 2 columns.
- One example use of this kind of array creation is a symmetric matrix.
- ![2d-array-14](https://github.com/user-attachments/assets/66366bb4-6467-4826-ba4a-d662fb2a81de)
- Where the number of rows is equal to the number of columns - and elements above the diagonal (shown in red) are simply duplicate of elements below the diagonal (shown in blue)
- So, by creating an array with irregular row sizes, we can avoid storing the duplicates in red.
- So, the symmetric matrix can now be a triangular matrix as shown in the image below:
- ![2d-array-15](https://github.com/user-attachments/assets/89a64a5e-6a4f-4f5c-a67d-67c57c7a9fbd)
- Each row will be represented by an array of different length.
- In this example, the first row would be an array of length 1.
- The second row would be an array of length 2, and so on and so forth.
- So, that's a pretty cool way to save some storage space, and it could be very useful for very large matrices.

#### Array Operations

- Like in the case of 1D arrays, `length` field can also be used on a 2D array.
- However, since internally 2D array is implemented as an 1D array, accessing the `length` field on the array would return the number of rows.
- In our `myArray` example which had 4 rows and 2 columns, `length` would return as 4.
- Accessing length on the first element of `myArray` would return 2.
- The example below shows how we can make a reference to one of the rows, which is a sub-array.

```java
int[] row = myArray[2];
```

- So, here a variable called `row`, which is an `int` array is assigned the third row, since index numbering begins with 0.
- That's the end of our discussion on 2D arrays.
- 2D arrays are sometimes very useful but, are much less commonly used than 1D arrays.
- Later, in the first version of our project, we will use 2D arrays.
- Similar to the way we extended the syntax from 1 to 2 dimensions, we can further extend to higher dimensions.
- However, dimensions higher than 2D are pretty rare in practice.

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
