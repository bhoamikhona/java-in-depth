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

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
