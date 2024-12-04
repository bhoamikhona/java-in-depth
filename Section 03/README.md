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
    - [3D Arrays](#3d-arrays)
      - [3D Array Creation \& Initialization](#3d-array-creation--initialization)
    - [Methods - Introduction](#methods---introduction)
      - [Calling a Method](#calling-a-method)
      - [Parameters](#parameters)
      - [Output](#output)
        - [Rules for Return Type](#rules-for-return-type)
      - [Method Syntax](#method-syntax)
        - [Method Declaration Syntax](#method-declaration-syntax)
        - [Method Invocation Syntax](#method-invocation-syntax)
      - [Key Concepts](#key-concepts)
      - [Examples](#examples)
        - [Example: Method Declaration and Invocation](#example-method-declaration-and-invocation)
        - [Example: Void Method](#example-void-method)
      - [Passing Arrays to Methods](#passing-arrays-to-methods)
      - [Benefits of Methods](#benefits-of-methods)
      - [Special Notes](#special-notes)
      - [Additional Example: Reusing Logic](#additional-example-reusing-logic)
    - [Method Types - Instance \& Static Methods](#method-types---instance--static-methods)
      - [Instance Methods](#instance-methods)
      - [Syntax](#syntax)
      - [Static Methods](#static-methods)
        - [Key Characteristics](#key-characteristics)
      - [Relationship Between Instance and Static Methods](#relationship-between-instance-and-static-methods)
      - [Special Notes](#special-notes-1)
      - [Summary](#summary)
    - [Summary on Accessibility of Members from Static \& Instance Methods](#summary-on-accessibility-of-members-from-static--instance-methods)
    - [Assignment 03 - Currency Converter - Invoking Methods of an Object](#assignment-03---currency-converter---invoking-methods-of-an-object)
    - [How Data is Passed to Methods in Java](#how-data-is-passed-to-methods-in-java)
      - [Key Differences Between Primitives and Object References](#key-differences-between-primitives-and-object-references)
      - [Pass by Value and Its Implications](#pass-by-value-and-its-implications)
        - [Primitives in Memory](#primitives-in-memory)
        - [Object References in Memory](#object-references-in-memory)
      - [Pass by Value in Java](#pass-by-value-in-java)
      - [Pass by Value - Primitives](#pass-by-value---primitives)
      - [Pass by Value - Object References](#pass-by-value---object-references)
      - [Re-assignment of Object References](#re-assignment-of-object-references)
      - [Passing Data](#passing-data)
      - [Conclusion](#conclusion-2)
    - [Method Overloading](#method-overloading)
      - [Key Rules for Method Overloading](#key-rules-for-method-overloading)
      - [Examples of Valid Overloaded Methods](#examples-of-valid-overloaded-methods)
      - [Method Invocation and Resolution](#method-invocation-and-resolution)
      - [Method Binding](#method-binding)
      - [Invalid Method Overloading Examples](#invalid-method-overloading-examples)
      - [Summary of Valid Overloading Requirements](#summary-of-valid-overloading-requirements)
    - [Methods - varargs](#methods---varargs)
      - [Key Characteristics:](#key-characteristics-1)
      - [How it works:](#how-it-works)
      - [Advantages of `varargs`:](#advantages-of-varargs)
      - [Restrictions](#restrictions)
      - [Printing using varargs](#printing-using-varargs)
      - [Integration with `main()` method](#integration-with-main-method)
      - [Behavior in Overloaded Methods:](#behavior-in-overloaded-methods)
      - [Conclusion](#conclusion-3)
    - [Brief Summary on varargs Parameter](#brief-summary-on-varargs-parameter)
    - [Constructors](#constructors)
      - [Key Features of Constructors](#key-features-of-constructors)
      - [Default (No-Args) Constructor](#default-no-args-constructor)
      - [Constructor with Parameters](#constructor-with-parameters)
      - [Empty `return` Statements in Constructors](#empty-return-statements-in-constructors)
      - [Important Notes on Constructors](#important-notes-on-constructors)
      - [Summary](#summary-1)
    - [Constructor Overloading](#constructor-overloading)
    - [Constructor Overloading - Alternate Way of Delegating](#constructor-overloading---alternate-way-of-delegating)
    - [Minor Note on Method Invocation \& Implicit Narrowing Conversion](#minor-note-on-method-invocation--implicit-narrowing-conversion)
    - [`this` Reference](#this-reference)
    - [Reinitializing Object References](#reinitializing-object-references)
    - [Minor Note on Executing StudentTest and A Java 11 Feature](#minor-note-on-executing-studenttest-and-a-java-11-feature)
    - [Coding Exercise 02 - Implementing Instructor Class - Manipulating Arrays with Object References](#coding-exercise-02---implementing-instructor-class---manipulating-arrays-with-object-references)
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

### 3D Arrays

- We mentioned that dimensions higher than 2D are pretty rare in practice but, to get a really firm grasp of how adding new dimensions would impact the syntax, let's take a look at a 3D array.
- ![3d-array-1](https://github.com/user-attachments/assets/5a0b6314-8981-4b52-ab30-fd2d5b413803)
- Let's take an example of an electronic store whose sales data is represented by a data cube.
- So, what you see in the image above is a data cube.
- Usually data warehousing software store data in such cubes.
- This data cube has 3 dimensions viz cities, time-in-months, and products.
- So, the store sells 4 products and they have franchises in 4 cities, and this cube only shows data for 4 months - from Jan to April.
- Actual data is number of units sold.
- In this diagram, 850 implies that 850 iPads were sold in the month of April in New York's store alone.
- All the relevant dimensions are highlighted in green.
- Such a data group, which has 3 dimensions can be implemented using a 3D array.
- If we call this array as `myArray` and if cities represent the 1st dimension, time represents 2nd dimension, and products represent the 3rd dimension, then `myArray` at index 0, 3, and 1 would return the value 850 as shown in the diagram above.

```java
myArray[0][3][1] = 850;
```

- So, 0 in the first bracket corresponds to NY, 3 in second bracket corresponds to April, and 1 in the third bracket corresponds to iPad.

#### 3D Array Creation & Initialization

- Like in the case of 1 and 2 dimensional arrays, there are 3 ways to create 3D arrays and they also use a similar syntax.

```java
// FIRST WAY OF CREATING 3D ARRAY
int [][][] myArray = new int[4][4][4]; // cities, time, products - in that order

// initialize the array like so:
myArray[0][3][1] = 850;

```

- Here is the illustration of our 3D array:
- ![3d-array-2](https://github.com/user-attachments/assets/d7aaac30-d153-47f2-91de-e433caeb41eb)
- Here the second layer represents the first dimension which is cities, and the first rectangle in the cities layer corresponds to NYC.
- NYC represents next dimension which is time-in-months, where each rectangle represents a month and on each slot in the rectangle can be viewed as the third dimension - which is products.
- The value in the slot is the number of units of that product sold.
- The diagram also represents the example data-value which is 850.
- 850 is a number of iPad sold in the month of April in NYC alone.
- The index numbers to locate this data are shown in blue.
- 0 corresponds to NYC, 3 corresponds to April, and 1 corresponds to iPad.
- Now if you recall our discussion on 2D arrays, we had a similar illustration.
- Even there, the second layer represented the first dimension, which is rows. And the element in each rectangle was basically the second dimension i.e. the actual data itself.
- So, there we only had 2 layers because it was 2D and here we have 3 layers.
- Now let's do a quick demo where we will quickly look at the other two ways of creating 3D arrays.
- A new method called `threeDimensionalArrays()` has been added to the `BasicsDemo` class, which you can have a look at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

static void threeDimensionalArrays() {
    System.out.println("\nInside threeDimensionalArrays ...");

  // SECOND WAY OF CREATING A 3D ARRAY
  int[][][] unitsSold = new int[][][] {
        { // New York
            { 0, 0, 0, 0 }, // Jan
            { 0, 0, 0, 0 }, // Feb
            { 0, 0, 0, 0 }, // Mar
            { 0, 850, 0, 0 }// Apr
        },
        { // San Francisco
            { 0, 0, 0, 0 }, // Jan
            { 0, 0, 0, 0 }, // Feb
            { 0, 0, 0, 0 }, // Mar
            { 0, 0, 0, 0 } // Apr
        },
        {
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 }
        },
        {
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 }
        }
    };

    System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
}
```

```java
// full code at ../javaindepth/src/com/semanticsquare/basics/BasicsDemo.java

static void threeDimensionalArrays() {
    System.out.println("\nInside threeDimensionalArrays ...");

  // THIRD WAY OF CREATING A 3D ARRAY
  int[][][] unitsSold = {
        { // New York
            { 0, 0, 0, 0 }, // Jan
            { 0, 0, 0, 0 }, // Feb
            { 0, 0, 0, 0 }, // Mar
            { 0, 850, 0, 0 }// Apr
        },
        { // San Francisco
            { 0, 0, 0, 0 }, // Jan
            { 0, 0, 0, 0 }, // Feb
            { 0, 0, 0, 0 }, // Mar
            { 0, 0, 0, 0 } // Apr
        },
        {
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 }
        },
        {
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 }
        }
    };

    System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
}
```

### Methods - Introduction

- An object has **state** and **behavior**, and behavior is defined by **methods**.
- Methods represent logic that can be used repeatedly.
- A software's **business logic** or **algorithms** are coded into methods. Methods are essential for achieving meaningful functionality.
- Methods typically:
  1. Receive **input data** (optional)
  2. Perform **processing**
  3. Generate **output data**

#### Calling a Method

- Calling a method means invoking its logic.
- If the method requires input, it passes data (referred to as **arguments** into the method)

#### Parameters

- Parameters are the **input data** required by a method.
- Parameters:
  - Are **optional**. If no parameters are needed, the method requires no input.
  - Are **variables**, and thus have:
    - A name
    - A data type
  - Can be either **primitive types** or **object references**.

#### Output

- A method returns a value using a **`return` statement**.
  - The `return` statement uses teh reserved keyword `return` in Java.
  - The returned value can be:
    - A **primitive type**
    - An **object reference**
    - A **variable**
    - A **literal**
  - The method's **return type** is declared in the method definition, **before the method name**.

##### Rules for Return Type

1. Declaring the return type is **mandatory** in the method declaration.
2. The **return type** must match the type of value being returned by the method.
3. If a method does not return a value, its return type must be `void`.

#### Method Syntax

##### Method Declaration Syntax

```java
returnType methodName (type param1, type param2, ...) {
  // method logic
  return someValue; // optional if return type is `void`
}
```

##### Method Invocation Syntax

```java
type var = methodName(arg1, agr2, ...);
```

#### Key Concepts

- Method Signature:
  - A method's name and parameter list together form the **method signature**.
  - The return type is not part of the method signature.
- Arguments vs. Parameters:

  - **Parameters** (also known as **Formal Parameters**) are declared in the method definition.
  - **Arguments** (also known as **Actual Parameters**) are the input values passed during method invocation.
    > [!NOTE]
    >
    > The number, type, and order of arguments must match the method's parameters.

- Empty Parentheses:
  - If a method does not take any input, it will have empty parentheses in both its declaration and invocation.

#### Examples

##### Example: Method Declaration and Invocation

```java
// Method Declaration
int add(int a, int b) {
  return a + b;
}

// Method Invocation
int result = add(5, 10); // result = 15
```

##### Example: Void Method

```java
// Void Method Declaration
void printMessage(String message) {
  System.out.println(message);
}

// Invocation
printMessage("Hello, World!"); // Outputs: Hello, World!
```

#### Passing Arrays to Methods

- You can pass arrays as arguments in two ways:
  1. Using a variable holding the array reference.
  2. Directly creating a new array inline:
  ```java
  myMethod(new int[] {1, 2, 3});
  ```
- You cannot pass an array like this:

```java
myMethod({1, 2}); // Error: Invalid syntax
```

- This syntax is only valid for array declarations and cannot be used elsewhere.

#### Benefits of Methods

- Avoid code duplication.
- Re-usable code.
- Cleaner and more readable code.
- Encapsulation of logic.

#### Special Notes

- The return type in the method declaration must match the type of variable used to store the returned value during invocation.
- Methods **must return a value** if the return type is anything other than `void`. Otherwise, a **compilation error** will occur.
- `void` methods do not return any value, but they can optionally have a `return;` statement to indicate no value is returned.

#### Additional Example: Reusing Logic

```java
int multiply (int a, int b) {
  return a * b;
}

int square (int x) {
  return multiply (x * x); // Reuses multiply() logic
}
```

### Method Types - Instance & Static Methods

- Methods in Java can be of two types:
  - Instance Methods
  - Static Methods
- A class can contain:
  - Only instance methods
  - Only static methods
  - Both instance and static methods

#### Instance Methods

- Instance methods are associated with an instance of a class (i.e. an object).
- They represent the behavior of objects and are accessed via object reference.

#### Syntax

```java
// Accessing an instance method
objectReference.methodName();
```

- Instance methods:
  - Are invoked to perform actions on behalf of the object.
  - Typically affect the state of the object by manipulating instance variables.
  - Can call other instance methods within the same class, which may also affect the object's state.
- Example

```java
class MyClass {
  int count;

  void increment() {
    count++;
  }

  void display() {
    System.out.println("Count: " + count);
  }
}

// Usage
MyClass obj = new MyClass();
obj.increment();
obj.display(); // Output: Count: 1
```

#### Static Methods

- Static methods are declared using the `static` keyword.
- The absence of the `static` keyword implies the method is an instance method.

##### Key Characteristics

1. Class-Level Methods

- Static methods are associated with the `class`, not an instance.
- They do not depend on an object's state.

2. Access Restrictions

- Static methods cannot directly access instance variables or instace methods within the same `class`.
- Attemptying to directly access an instance varaible or invoke an instance method from a static method will result in compiler error.

3. Utility Method:

- Static methods are often used as utility methods.
- They typically take input parameters, perform an action, and return a result without depending on instance-specific data.
- Example:

```java
static double sum(double x, double y) {
  return x + y;
}
```

- Static methods can access:
  - Static variables (class-level variables shared across all objects)
  - Other static methods within the same class
- Syntax:

```java
// Accessing a static method
className.methodName();
```

- Example:

```java
class MathUtils {
  static double sum(double x, double y) {
    return x + y;
  }
}

// usage
double result = MathUtils.sum(5.5, 4.5); // output: 10.0
```

#### Relationship Between Instance and Static Methods

1. Static Method Access:

- Static methods cannot directly access instance variables or instance method because they are specific to a particular object.

2. Instance Method Access:

- Instance methods can directly access:
  - Static variables
  - Static methods
- This is because static members are global to the class.

#### Special Notes

- The main method is an example of a static method.
- Static methods are often preferred for tasks un-related to an object's state, such as mathematical operations, data formatting, etc.
- To call an instance method from a static method (like the main method), you must first create an instance of the `class`.
- Example:

```java
class MyClass {
  void instanceMethod() {
    System.out.println("Instance method called!");
  }

  public static void main(String[] args) {
    // create an object to access the instance method
    MyClass obj = new MyClass();
    obj.instanceMethod(); // Output: Instance method called!
  }
}
```

- Static variables:
  - Can be accessed by both instance and static methods
  - Are shared across all objects of the class

#### Summary

| Feature     | Instance Methods                       | Static Methods                 |
| ----------- | -------------------------------------- | ------------------------------ |
| Association | Instance (object-specific)             | Class (global to the class)    |
| Keyword     | No `static` keyword                    | Declared with `static` keyword |
| Access      | Can access static and instance members | Can access only static members |
| Invocation  | Via an object                          | Via the class name             |
| Purpose     | Manipulate object-specific state       | Perform utility tasks          |

### Summary on Accessibility of Members from Static & Instance Methods

- Accessibility from static methods:
  - Cannot directly access instance variables/methods defined in the same class as the static method.
  - Can directly access static variables/methods defined in the same class.
  - Can access anything via an object reference. So, from a static method by using an object reference, we can access instance variables/mehtods.
- Accessibility from instance methods:
  - Can access anything from an instance method.
  - So, we can even access static variables/methods defined in the same class as the instance method.

### Assignment 03 - Currency Converter - Invoking Methods of an Object

### How Data is Passed to Methods in Java

- So far, we have covered how methods are defined and how they can be invoked.
- We have also seen that data can be passed to methods during invocation.
- The way this data is passed however, can vary across programming languages.
- To understand this, let's look at a simple example.

```java
void updateId(int newId) {
  newId = 1001;
}
```

- In this example, we have a method called `updateId()` which accepts a single parameter `newId` of type `int`.
- The method re-assigns `newId` to 1001.
- Now, suppose we invoke the `updateId()` method with a variable `id`, initialized to 1000.

```java
void updateId(int newId) {
  newId = 1001;
}

int id = 1000;
updateId(id);
System.out.println(id);
```

- The question is: if we print the variable `id` after invoking `updateId()`, will it display 1000 or 1001? Since `updateId()` modifies its input parameter, you would expect it to be 1001, right?
- In Java, it would remain 1000, whereas, in some other programming languages, it might update to 1001.
- This happens because in Java, primitive data types are passed by value.
- Now, let's consider what happens when we pass an object reference instead of a primitive.

```java
void updateId(Student s1) {
  s1.id = 1001;
}
```

- This `updateId()` method now takes an object reference as its parameter, specifically a `Student` object.
- In this case, the `id` variable from the previous example has been moved to the `Student` class.
- Let's see the invocation:

```java
void updateId(Student s1) {
  s1.id = 1001;
}

Student s = new Student();
s.id = 1000;
updateId(s);
System.out.println(s.id);
```

- Here, we create an instance of the `Student` class, assign `id = 1000`, and then pass the `Student` object `s` to the `updateId()` method.
- The question now is: will the value of `id` in the `Student` object change to 1001 after `updateId(s)` is invoked?
- In Java, it will change to 1001 because we are passing a reference to the object, not the object itself.

#### Key Differences Between Primitives and Object References

- When a primitive is passed to a method, Java creates a copy of the value. Changes to the parameter inside the method do not affect the original variable in the calling environment.
- When an object reference is passed, Java passes the memory address of the object. Changes to the object's state inside the method affect the original object in the calling environment.
- To summarize:
  - In Java, primitive data types are passed by value, meaning the method gets a copy of the value.
  - Object references are also passed by value, but the value being passed is the memory address of the object. Thus, the method can modify the state of the object, but not the reference itself.

#### Pass by Value and Its Implications

##### Primitives in Memory

- Let's first understand how primitive variables are stored in memory. Consider the following:

```java
int id = 1000;
```

- The variable `id` consists of:
  - The logical name (`id`)
  - The memory address where the value is stored
  - The value of the variable (`1000`)
- The compiler assigns a memory address to the variable and stores the value at that address. At runtime, the memory address holds the value, not the variable name.

##### Object References in Memory

- Now, consider the case of an object reference. When you create a `Student` object:

```java
Student s = new Student();
```

- Here, `s` holds a reference to the `Student` object. In memory:
  - `s` holds the memory address of the object.
  - The object itself is stored at a different memory location.
  - The object's data (like `id`) is stored at the object's memory address.
- So, `s` contains the memory address of the object, not the object itself.

#### Pass by Value in Java

- Java uses the pass-by-value mechanism when passing data to methods. This means that:
  - If the argument is a primitive, a copy of the primitive value is passed.
  - If the argument is an object reference, a copy of the reference (i.e. the memory address) is passed.

#### Pass by Value - Primitives

- Let's look at how primitives are passed by value. Consider the following code:

```java
void updateId(int newId) {
  newId = 1001;
}

int id = 1000;
updateId(id);
```

- The variable `id` is initialized with the value 1000.
- The `updateId()` method is invoked, passing `id` as an argument.
- Inside the method, a copy of the value `1000` is assigned to `newId`.
- `newId` is updated to `1001`, but this change only affects `newId`, not the original `id`.
- After the method completes, the value of `id` in the calling environment remains 1000.
- Thus, passing primitives by value ensures that changes to the parameter do not affect the original argument.

#### Pass by Value - Object References

- When an object reference is passed, Java still uses pass-by-value, but it is important to understand that the value passed is the memory address of the object, not the object itself.
- Consider the following:

```java
void updateId(Student s1) {
  s1.id = 1001;
}

Student s = new Student();
s.id = 1000;
updateId(s);
```

- A new `Student` object is created, and its `id` field is initialized to 1000.
- When `updateId(s)` is invoked, the memory address of the `Student` object is passed to the method.
- Inside the method, `s1` references the same `Student` object as `s`. The `id` field of the object is updated to 1001.
- Because both `s` and `s1` reference the same object, the change is reflected in the calling environment, so `s.id` becomes 1001.

#### Re-assignment of Object References

- What happens if you re-assign the method parameter to a new object? For example:

```java
void updateId(Student s1) {
  s1 = new Student();
  s1.id = 1001;
}
```

- In this case:
  - The `Student` object is first passed to the method, and `s1` references it.
  - Then, `s1` is re-assigned to a new `Student` object with `id = 1001`.
  - The original `Student` object (referenced by `s`) remains unchanged, as `s1` now points to a new object.

#### Passing Data

- Passing data to a method behaves similarly to variable assignements. For instance:

```java
int id = 1000;
int newId = id; // variable assignment
newId = 1001; // New value assigned to newId, but id remains 1000
```

- Similarly, for object references:

```java
Student s = new Student();
s.id = 1000;
Student s1 = s; // variable assignment
s1.id = 1001; // both s and s1 reference the same object, so s.id = 1001
```

#### Conclusion

- Java uses pass0by-value for both primitives and object references.
- When passing primitives, only the value is passed, and the changes to the parameter do not affect the original variable.
- When passing object references, the reference (memory address) is pased by value, so changes to the object's state inside the method are reflected in the calling environment. However, re-assigning the reference inside the method does not affect the original reference in the calling environment.
- Understanding this mechanism is crucial for grasping how Java handles method arguments and how variables are affected by method calls.

### Method Overloading

- **Method Overloading** allows maintaining multiple versions of a method within the same class.
- Methods with the **same name** but **different parameter lists** are considered overloaded methods.
- It can serve as:
  - A **requirement** in certain scenarios.
  - A **convenience** for clients (method invokers).

#### Key Rules for Method Overloading

- Methods must have:
  - Same name
  - Different Parameter List
- Changing only the return type does not qualify as overloading.
- Both instance methods and static methods can be overloaded.

#### Examples of Valid Overloaded Methods

```java
void updateProfile(int newId) {}
void updateProfile(int newId, char gender) {}
void updateProfile(char gender, int newId) {}
void updateProfile(short newId) {}
```

- Parameter Order
  - In the second and third examples, the order of parameters differs (`int, char` vs. `char, int`).
- Parameter Types
  - The fourth example uses `short`, while the first uses `int`. Even though both are integer types, they are distinct, making the overload valid.

#### Method Invocation and Resolution

- When invoking an overloaded method, the compiler determines the most appropriate version based on the arguments provided.
- Example 01:
  - Method invoked: The second method (`int, char`)

```java
updateProfile(1000, 'F');
```

- Example 02:
  - Method invoked: The first method (`int`)
  - Reason: The `1000` literal is an `int`, which matched the parameter exactly.

```java
updateProfile(1000);
```

- Example 03 (Using `byte`):
  - Method invoked: The fourth method (`short`)
  - Reason:
    - The compiler first looks for an exact match (a method with a `byte` parameter).
    - If none exists, it selects the next compatible and most specific type, which in this case is `short`.

```java
byte b = 50;
updateProfile(b);
```

#### Method Binding

- Method binding is the process by which:
  - The compiler determines which method to invoke during compilation.
  - The JVM uses this information at runtime to ensure the correct overloaded method is executed.

#### Invalid Method Overloading Examples

- Changing only the return types
  - Error: Duplicate Method
  - Reason: Changing the return type alone does not create a valid overload.

```java
// original method
void updateProfile(int newId) {}

// invalid overload
boolean updateProfile(int newId) {}
```

- Changing only the parameter name:
  - Error: Duplicate method
  - Reason: Changing the parameter naem (`newId` vs `id`) does not make the methods distinct.

```java
// original method
void updateProfile(int newId) {}

// invalid overload
boolean updateProfile(int id) {}
```

- Mixing Static and Instance Contexts
  - Error: Duplicate method
  - Reason: Static vs. Instance context does not qualify as overloading.

```java
// original method
void updateProfile(int newId) {}

// invalid overload
static void updateProfile(int newId) {}
```

#### Summary of Valid Overloading Requirements

- The method name must remain the same.
- The parameter list must differ in at least one of the following ways:
  - Number of parameters
  - Types of parameters
  - Order of parameter types

### Methods - varargs

- Prior to Java 5, methods could only accept a fixed number of arguments, matching the method's parameter count.
- Java 5 introduced `varargs` (variable-length arguments) to allow methods to accept a variable number of arguments.

#### Key Characteristics:

- A `varargs` parameter allows passing 0, 1, or multiple arguments to a method using a single parameter.
- The `varargs` parameter:
  - Must be the last parameter in the method.
  - Can be the only parameter in the method.
- Syntax: The parameter type is followed by three dots (`...`).
  - Example: `void foo(boolean flag, int... items) {}`

#### How it works:

- During invocation, the arguments passed to the `varargs` parameter can be:
  - An array: `foo(true, new int[] {1, 2, 3})`
  - A comma-separated list: `foo(true, 1, 2, 3)`
- The compiler converts the arguments into an array, meaning within the method, the `varargs` parameter is treated as a normal array.
- Examples of invocation:
  - `foo(true, 1, 2, 3)` -> compiler converts arguments into an `int[]`
  - `foo(true)` -> compiler passes an empty array.

#### Advantages of `varargs`:

- Cleaner and more flexible syntax:
  - You can pass a sequence of values as comma-separated arguments.
  - If there are no values to pass, nothing needs to be explicitly provided.
- Simplifies method invocation compared to using explicit arrays:
  - No need to create or pass `null`/empty arrays manually.
- Works well for methods accepting both few or many arguments.

#### Restrictions

- A method cannot have more than one `varargs` parameter.
- The `varargs` parameter must always be the last parameter in the method.
- A method signature using a `varargs` parameter is considered equivalent to using an array.
- Example:

```java
// Both of these are basically the same
void foo(boolean flag, int... items) {}
void foo(boolean flag, int[] items) {} // Invalid overload - since they both are the same
```

#### Printing using varargs

- `printf()` method was introduced in Java 5 and it is used to print formatted text.
- It is similar to `println()` and `print()`.
- First parameter of `printf()` is the text to be printed, while the second is a `varargs` parameter.
- Type of the second parameter is an `Object` - a class in Java.
  - Syntax: `System.out.printf(String format, Object... args)`
  - Example:
  ```java
  System.out.printf("DOB: %d/%d/%d", 1, 1, 1978);
  ```
  - In this example the first argument is text to be printed while, 2nd, 3rd, and 4th arguments correspond to the `varargs` parameter.
  - The `%d` serve as placeholders which are replaced by the `varargs` values (1, 1, 1978) during runtime.

#### Integration with `main()` method

- The main method can also use `varargs`

```java
public static void main(String... args) {}
```

- This works the same as `String[] args`.

#### Behavior in Overloaded Methods:

- If a method is overloaded, and one version uses `varargs`, the `varargs` method is matched last during invocation.

```java
void foo(int a) {}
void foo(int... items) {}
```

- A call like `foo(10)` matches the first method (exact match) before considering the `varargs` version.

#### Conclusion

- The `varargs` feature in Java 5 provides a simplifies and flexible way to handle variable length arguments, making method invocation more intuitive and versatile.
- It combines the power of arrays with cleaner syntax, enhancing usability while adhering to a few basic rules.

### Brief Summary on varargs Parameter

- We can declare a method with a `varargs` parameter if the method's last parameter (or the only parameter) is an array, but we want to provide the invoker of the method with a flexible way of invoking it, such as:
  - by passing an array,
  - providing comma-separated values, or
  - passing nothing at all
- So, if one invoker of this method has a large array to pass, then teh array can be passed directly.
- Similarly, if another invoker has just few values to pass, then they can be passed simply as a comma-separated values instead of creating an array for those value and passing the array.
- Essentially, `varargs` parameter provides a flexible way of invoking a method and applies to only those methods whose last parameter is an array.

### Constructors

- A constructor is a special block of code within a class, primarily used to initialize the state of an object by setting instance variables.
- While we have been creating objects using statements like `Student s = new Student();`, the compiler implicitly provided a constructor in the absence of a user-defined one.
- A constructor handles object creation and state initialization, streamlining the process compared to manually setting state using object references.

#### Key Features of Constructors

1. Syntax

- A constructor has the same name as the class.
- It has no return type, not even `void`.
- It can have parameters, including `varargs`.

2. Differences from Methods:

- While similar to methods, a construcotr is invoked during object creation and does not have a return type.
- Syntax-wise, it resembles a method but, focuses on initializing objects.

3. Example:

```java
class Student {
  int id;

  // constructor
  Student(int newId) {
    id = newId;
  }
}
```

- The constructor `Student(int newId)` initializes `id` field with the value passed during object creation.

4. Object Creation and Constructor Invocation:

```java
Student s = new Student(1001);
```

- Steps:
  - Allocates memory for a reference variable (`Student s`)
  - Allocates memory for a new `Student` object (`new Student()`)
  - Invokes the constructor (`Student()`), which initializes the `id` field to `1001`.

#### Default (No-Args) Constructor

- If no constructor is explicitly defined in a class, the compiler provides a default constructor:
  - A no-args constructor, which has no parameters.
  - Used to create objects without initializing specific state.
- Example:

```java
class Student {
    int id;
}

// Compiler automatically adds a no-args constructor
Student s = new Student(); // Valid
```

- If a class has any user-friendly constructor (with or without parameters), the compiler does not insert a default constructor. To use a no-args constructor in such cases, you must define it manually.

#### Constructor with Parameters

- A parameterized constructor allows initializing object state at the time of creation.
- Example:

```java
class Student {
  int id;

  // Parameterized constructor
  Student(int newId) {
    id = newId;
  }
}

// Usage
Student s = new Student(1001); // Initialized id to 1001
```

#### Empty `return` Statements in Constructors

- Constructors can include an empty `return` statement to exit early.
- If a return statement is followed by other code, it leads to a compilation error due to unreachable code.
- Example:

```java
class Student {
  Student(int id) {
    if (id < 0) {
      System.out.println("Invalid ID");
      return; // Exit early
    }
    this.id = id; // Executed only if the condition is false
  }
}
```

#### Important Notes on Constructors

1. Behavior:

- A constructor can invoke methods to perform additional initialization tasks.
- Typically used to initialize state but, can include other options as needed.

2. Restrictions:

- Constructors cannot have a return type.
- If a class has no constructors, the compiler inserts a no-args constructor.
- If any constructor is defined (with or without parameters), no default constructor is added.

3. Invoking Methods:

- From a constructor, you can call other methods for additional processing.

#### Summary

- A constructor is integral to object creation, handling initialization efficiently.
- It reduces the manual effort of setting object state using methods or field references.
- Constructors enhance code readability, maintainability, and proper encapsulation.

### Constructor Overloading

- We know that a constructor helps in constructing objects, and it can also help in initializing state of those object.
- In the last lesson, we re-factored our `Student` class to define a parameterized constructor, which helped with creating `Student` objects and also, initializing their state.
- In `Student` class, we defined a single constructor but, a `class` can also have multiple constructors.
- If there are multiple constructors, they would all have the same constructor name since constructors are named after their `class`.
- So, what we have is one or more constructors with same name, but different parameters, and that's nothing but, constructor overloading.
- So, we have overloaded constructors, and it is similar to method overloading where we have multiple methods in the same class having the same name, but different parameter lists.
- Providing such overloaded constructors make it convenient for clients to construct objects.
- So, let's go ahead and learn about constructor overloading.
- Constructor overloading, as mentioned previously, is the same as method overloading.
- So, we have the same overloading rules as methods.
- That is, the constructor must have different parameter list, otherwise we would have duplicate constructors and would get a compilation error.
- Objects can be created using any of the overloaded constructors.
- Why do we need overloaded constructors?
- The reason is convenience.
- They make it convenient for clients to construct objects.
- That is, the help in having simpler object creation statements.
- Let's look at an example from the Java library.

```java
FileOutputStream(String name, boolean append);
FileOutputStream(String name);
FileOutputStream(File file);
FileOutputStream(File file, boolean append);
FileOutputStream(FileDescriptor fdObj);
```

- This is from a `class` called as `FileOutputStream`, which we will discuss later.
- This `class` is helpful if you want to write some data to a particular file on the disk.
- As we can see, this `class` has 5 overloaded constructors, and they have different parameters.
- Now, let's consider the 4th constructor, which has 2 parameters.
- `File` here is simply another class in the Java library, and let's not worry about it, we will look at it later, but it simply represents the file into which we want to write our data.
- The second parameter is to indicate whether we want to append data to the file or override the file.
- So, if the file already exists on the disk and you simple want to append data to it i.e. you want to write some data at the end of the file, then you would pass `true` for the second parameter.
- But, if you want to override the contents of the file, then would pass `false`.
- NOTE: If the file does not exist on the disk, then this constructor would create a new file.
- So, if there is a file called text.txt and you want to simply overwrite its contents, then you would create a `FileOutputStream` object like so:

```java
new FileOutputStream(new File("text.txt"), false);
```

- As you can see, in the first argument we are creating a `File` object corresponding to text.txt, and then we are passing `false` for the second argument.
- Now, instead of doing this, we can actually use the second constructor, which is provided only for overwriting.
- So, if we use the second constructor, we would create our `FileOutputStream` object like so:

```java
new FileOutputStream("text.txt");
```

- As you can see, it is much simpler and we just pass the file name.
- So, we don't have to create the `File` object, and there is no boolean argument that we need to pass.
- However, the 2nd constructor internally invokes the 4th constructor and passses the `File` object for the `file` parameter and passes a `false` for the `append` parameter.
- So, the 2nd constructor is simply delegating to the 4th constructor.
- So, the library designers have provided the 2nd constructor so that we can easily create our objects.
- Similarly, if we want to append data, we can invoke the first constructor and pass it through for the second parameter.
- First parameter is for the file name, and using this constructor is convenient than using the 4th one as we don't have to create a `File` object.
- The first constructor also internally delegates to the 4th one.
- So, sometimes we can have this sort of overloaded constructor where there is a primary constructor like the 4th one, and others simply delegate to it.
- However, we can also have overloaded constructors where there is no such delegation and the constructors are completely independent of each other.
- There is a `class` called `TreeMap` in the Java library, which has such overloaded constructors that are independent from each other.
- However, even in `TreeMap`'s case, the constructors still provide the convenience factor i.e. without them, extra code would have to be written to construct `TreeMap` objects.
- `TreeMap` will be discussed later in the collections framework section, and it is a `class` in the Java library.
- Constructors are also associated with certain capability i.e. they help in constructing objects that have certain capability.
- For instance, the 2nd constructor helps in creating objects that can help in overriding file content.
- Similarly, first constructor can be used to construct objects that can help with appending data to the end of the files.
- So, each constructor is helping in constructing objects with certain capability or property.
- For the second constructor, the capability is overwriting and for the first constructor, the capability is appending, but that need not be the case all the time i.e. objects created from the different overloaded constructors can have the same capability too, however, that is not very commom but, that is possible.
- For instance, let's say the program only has partial data available i.e. it has only values for some of the instance variables, in that case, we may have a constructor only for those variables, and for the remaining variables, we get default values.
- But, if we have all of the data, then we can have a constructor that takes all of the values, and that would be the primary constructor.
- When you want to invoke the primary constructor from another overloaded constructor, we use `this()` invocation statement and we pass in all the values required by the primary constructor within the parentheses, just like we would pass arguments when calling a method.
- NOTE: When you are delegating the task from one constructor to the primary constructor, the values that are missing must be provided from the constructor that is calling the primary constructor, and those values are essentially default values for the fields.
- There are certain rules that we need to remember when it comes to the `this()` invocation statement:

  - Within a constructor, the `this()` invocation statement has to be the first statement.
  - If we have any other statement before the `this()` invocation statement, we get a compilation error.
  - You cannot have more than one `this()` invocation statement in a constructor.
  - There cannot be a recursive invocation i.e. you cannot invoke the same constructor.
  - Example 01 - A constructor calling itself using `this()` invocation statement:

  ```java
  public class Student {
    int id;
    String name;
    double gpa;

    // this is calling itself using the `this()` invocation statement
    // i.e. recursive invocation
    // this is invalid
    Student(int newId, String newName) {
      this(1001, "John");
    }

    Student(int newId, String newName, double newGpa) {
      id = newId;
      name = newName;
      gpa = newGpa;
    }
  }
  ```

  - Example 02 - First constructor calling the second one, and second constructor calling the first one:

  ```java
  public class Student {
    int id;
    String name;
    double gpa;

   // this constructor is calling the primary constructor using `this()`
    Student(int newId, String newName) {
      this(1001, "John", 3.5);
    }

    // this constructor is calling the other constructor using `this()`
    Student(int newId, String newName, double newGpa) {
      this(1001, "John");
    }
  }
  ```

  - In this example, they both are calling each other and this is called as **indirect recursive invocation** and this is invalid as well.
  - When passing arguments to another constructor while invoking `this()`, we cannot use instance variable, it has to be a local variable.
  - Recall that parameters are also local variable, so those are the ones we can pass when using `this()` invocation statement. We cannot use instance variables.
  - So, in the example above, when invoking `this()` we can pass `newId` but, not `id`.
  - The reason for this is that `id` is not initialized when invoking `this()` invocation statement. The variable which is initialized at that point is `id`.
  - So, the control from secondary constructor is getting passed to the primary constructor using the `this()` invocation statement.
  - In the primary constructor, before `id = newId` is executed, the constructor of the superclass is invoked.

    - There is something called as superclass in Java which also has a constructor.
    - We will learn about it when we learn about a concept called as inheritance, which is a very important OOP concept.
    - When we are dealing with inheritance, we have this notion of superclass and subclass.
    - So, `Student` is like a subclass and there is a superclass, which is like a parent class.
    - So, when the control reaches to the line of `this(newId, newName)` in the primary constructor, the control moves into the superclass' constructor.
    - At that instance, all of the instance in the superclass and the entire superclass constructor will be executed.
    - The the control comes back to the subclass, then the rest of the lines of code are executed and the instance variables get their defaults.
    - So, there is an implicit call to the superclass constructor.
    - You might ask, where is the superclass? It is implicit.
    - So, if we just execute the code below:

    ```java
    public class Student {
      int id;
      String name;
      double gpa;

      Student(int newId, String newName) {
        // using the instance variable `id` here instead of local variable `newId`
        // invalid
        this(id, "John", 3.5); // Error: cannot reference id before supertype constructor has been called
      }

      Student(int newId, String newName, double newGpa) {
        id = newId;
        name = newName;
        gpa = newGpa;
      }
    }
    ```

    - We get the error which says "cannot reference id before supertype constructor has been called"
    - So, supertype constructor has not been called at this point: `this(id, "John", 3.5)`, it will be called in the primary constructor, so when the control comes to the primary constructor, supertype will be invoked.
    - Supertype is nothing but the superclass or the parent class.
    - So, there is a parent or a superclass involved here and it is being used implicitly, and that class is called as the `Object` class.
    - The name of the class itself is `Object` and we will look at while learning about inheritance.

### Constructor Overloading - Alternate Way of Delegating

- In the previous lesson, we learned about delegating from a constructor which has fewer number of parameters to the one which has more number of parameters - more common way of delegation.
- In this lesson, we will learn how to do the reverse i.e. delegating from constructor which has more number of parameters to a constructor which has fewer number of parameters.
- Example:

```java
public class Student {
  int id;
  String name;
  double gpa;

  Student(int newId, String newName) {
    id = newId;
    name = newName;
  }

  Student(int newId, String newName, double newGpa) {
    this(newId, newName); // delegating to the constructor with fewer parameters
    gpa = newGpa;
  }
}
```

- This lesson is just for you to know that this is possible.

### Minor Note on Method Invocation & Implicit Narrowing Conversion

- We know that in the following statements, an int literal is being assigned to `b` and `s`.
- Since `int` is a larger data type, there is an implicit narrowing conversion [1] that is happening, i.e., from `int` to `byte` and `int` to `short`.
- Such implicit narrowing conversion is not possible with method (or constructor) invocation.

```java
byte b = 65;
short s = 65;
```

- If we consider the following class, the overloaded methods `go()` and the constructor have only `byte` or `short` parameters.
- We have compile-time errors in the statements when we are passing `int` literals.
- So, there is no implicit narrowing conversion that is happening, like in the case of above assignments [2].
- Java designers have decided to go against implicit narrowing conversion in method (or constructor) invocations as that would add additional complexity when resolving overloaded methods.

```java
public class Test {
  Test (byte a, byte b) {}

  static int go(byte a, byte b) {
    return a + b;
  }

  static int go(short a, short b) {
    return a - b;
  }

  public static void main(String[] args) {
    byte b1 = 65, b2 = 65;
    System.out.println(go(b1, b2)); // prints 65
    System.out.println(go(65, 65)); // compile-time error
    Test t1 = new Test(b1, b2); // fine
    Test t2 = new Test(65, 65); // compile-time error
  }
}
```

- References:
  - [1](https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html#jls-5.2)
  - [2](https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html#jls-5.3)

### `this` Reference

```java
public class Student {
  int id;
  String name;
  double gpa;

  Student(int newId, String newName, double newGpa) {
    id = newId;
    name = newName;
    gpa = newGpa;
  }
}
```

- When we first defined the parameterized constructor, we mentioned that we were going to come back to it and change the constructor parameter names, and it is time to do that.
- It is sort of odd to have these kinds of names like `newId`, `newName`, and `newGpa`.
- It is kind of difficult to come up with these names because they had to be different from the instance variable names.
- This is because these parameter names are being used to intiialize the instance variables.
- Therefore, we had to come up with names that are different from the instance variable names, which can be a bit challenging.
- However, in reality, we can use the same names as the instance variable names.
- So, let's go ahead and do that and see what happens and in the process, we will learn about a new keyword.

```java
public class Student {
  int id;
  String name;
  double gpa;

  // Using the same name as instance variables for the parameters
  Student(int id, String name, double gpa) {
    id = id;
    name = name;
    gpa = gpa;
  }

  public static void main(String[] args) {
    Student student1 = new Student(1000, "John", 3.8);
    Student student2 = new Student(1001, "Anita", 4.0);

    System.out.println("Name of Student 1: " + student1.name);
    System.out.println("Name of Student 2: " + student2.name);
  }
}
```

- Now if we run this code, we get `null` as the name of the students.
- So, what is happening here?
- In the constructor, the line of code `id = id` is referring the `id` from its parameters.
- So, the `id` on the left hand side (LHS) of the `=` is not referencing to the instance variable `id`.
- Because of that, all of the variables in the constructor are not getting initialized.
- Therefore, we are getting `null` when we are trying to print the names of the students.
- The reason for that is because, the parameters are local variables, and they have the same name as the instance variables.
- Recall that method parameters (or constructor parameters) are also local variables.
- What is happening is that we are using the same name as the instance variable names.
- So, if local variable names have the same names as the instance variable names then we say that those local variables are **hiding** or **shadowing the instance variables (or static variables)**.
- Generally, you will see them hiding the instance variables.
- When we say that they are hiding the instance variables, what it means is, if we use that variable name within that constructor then it would reference the local variable rather than the instance variable (or static variable) declared at the class level.
- So, local variables are hiding or shadowing class level variables.
- That's the reason why, `id = id` is referencing local variables.
- How can we access the instance variables?
- For that we use something called as `this` reference.
- Because it is a reference, we can use the dot operator to access the instance variables, like so:

```java
public class Student {
  int id;
  String name;
  double gpa;

  // Using the same name as instance variables for the parameters
  Student(int id, String name, double gpa) {
    // Using `this` reference with dot operator to access instance variables
    this.id = id;
    this.name = name;
    this.gpa = gpa;
  }

  public static void main(String[] args) {
    Student student1 = new Student(1000, "John", 3.8);
    Student student2 = new Student(1001, "Anita", 4.0);

    System.out.println("Name of Student 1: " + student1.name);
    System.out.println("Name of Student 2: " + student2.name);
  }
}
```

- With this, the instance variables will be initialized.

> [!NOTE]
>
> `this` reference and `this()` invocation statement are two different things.
>
> `this()` is an invocation statement with which we are calling an overloaded constructor.
>
> `this` is a reference variable (object reference) with which we reference to the current object.

- Now the question is, what is `this` referencing? It is referencing the current object.
- We know about object referencing.
- In this line of code: `Student student1 = new Student(1001, "John", 3.8)`, the variable `student1` is referencing the object on the right hand side (RHS) of the `=`.
- And within the student object itself, let's say we want to reference the object itself i.e. the current object, then we would use the `this` reference.
- For example, if you want to reference an object inside an instance method, then you can do that by using the `this` reference because the `this` keyword is referencing the current object.
- The same works for constructor.
- Hence, to access the instance variables inside the constructor, we have to use the `this` reference.
- So, before using the `this` keyword, the local variable in the constructor was getting initialized by itself, which is meaningless.
- NOTE: We only need to use the `this` keyword if the local variable is hiding an instance variable, and we want to refer to the instance variable. If there is no hiding or shadowing, we do not need to use the `this` keyword to access the instance variable.
- Example: the `tuitionFees` and `internationalFees` are instance variables but, they are not hidden by local variables and thus, we do not need to use the `this` reference.

```java
public class Student {
  int id;
  String name;
  double gpa;
  boolean international;

  // Using the same name as instance variables for the parameters
  Student(int id, String name, double gpa, boolean international) {
    // Using `this` reference with dot operator to access instance variables
    this.id = id;
    this.name = name;
    this.gpa = gpa;
    this.international = international;

    // tuitionFees and internationalFees are not hidden by local variable so, no need to use `this` reference.
    if (international) {
      tuitionFees = tuitionFees + internationalFees;
    }
  }

  public static void main(String[] args) {
    Student student1 = new Student(1000, "John", 3.8, false);
    Student student2 = new Student(1001, "Anita", 4.0, true);

    System.out.println("Name of Student 1: " + student1.name);
    System.out.println("Name of Student 2: " + student2.name);
  }
}
```

- Note that the same applies for static variables, if they are hidden and you need to access them. However, this is not very common but, it is possible.
- Now if you compile and run the code above, this time it will print all the names.
- So, the instance variables got initialized this time.
- Also, because `this` is just a reference to the current object, you can also use it access instance methods also. However, typically you wouldn't do that, you can directly access the instance methods from constructor or from inside another instance method.
- Aside from constructor, the `this` reference can also be used in methods as well.

```java
public class Student {
  int id;
  String name;
  double gpa;
  boolean international;

  // Using the same name as instance variables for the parameters
  Student(int id, String name, double gpa, boolean international) {
    // Using `this` reference with dot operator to access instance variables
    this.id = id;
    this.name = name;
    this.gpa = gpa;
    this.international = international;

    // tuitionFees and internationalFees are not hidden by local variable so, no need to use `this` reference.
    if (international) {
      tuitionFees = tuitionFees + internationalFees;
    }
  }

  // Using `this` reference in a method
  boolean updateProfile(String name) {
    this.name = name;
    return true;
  }

  public static void main(String[] args) {
    Student student1 = new Student(1000, "Joan", 3.8, false);
    Student student2 = new Student(1001, "Anita", 4.0, true);

    System.out.println("Name of Student 1: " + student1.name);
    System.out.println("Name of Student 2: " + student2.name);

    student1.updateProfile("John");
    System.out.println("\nUpdated name of Student 1: " + student1.name);
  }
}
```

- Note that `this` is actually an instance variable so, it is allowing us to access instance variables and instance methods.
- But, `this` cannot be used within a static method.
- Since, `main()` is a static method, if we use `this` in the `main()` method, we will get an error because from static methods we cannot access instance variables and `this` is an instance variable.

```java
public class Student {
  int id;
  String name;
  double gpa;
  boolean international;

  // Using the same name as instance variables for the parameters
  Student(int id, String name, double gpa, boolean international) {
    // Using `this` reference with dot operator to access instance variables
    this.id = id;
    this.name = name;
    this.gpa = gpa;
    this.international = international;

    // tuitionFees and internationalFees are not hidden by local variable so, no need to use `this` reference.
    if (international) {
      tuitionFees = tuitionFees + internationalFees;
    }
  }

  // Using `this` reference in a method
  boolean updateProfile(String name) {
    this.name = name;
    return true;
  }

  public static void main(String[] args) {
    Student student1 = new Student(1000, "Joan", 3.8, false);
    Student student2 = new Student(1001, "Anita", 4.0, true);

    System.out.println("Name of Student 1: " + student1.name);
    System.out.println("Name of Student 2: " + student2.name);

    student1.updateProfile("John");
    System.out.println("\nUpdated name of Student 1: " + student1.name);

    // ERROR: Cannot access `this` from a static method, and `main()` is a static method
    System.out.println("Name of Student 2: " + this.name); // error
  }
}
```

### Reinitializing Object References

```java
  public static void main(String[] args) {
    Student student1 = new Student(1000, "Joan", "Male", 18, 223_456_7890L, 3.8,
        'B');

    Student student2 = new Student(1001, "Raj", "Male", 21, 223_456_9999L, 3.4,
        'M', true);

    Student student3 = new Student(1002, "Anita", "Female", 20, 223_456_8888L,
        4.0, 'M', true);

    System.out.println("\nStudent.studentCount: " + Student.studentCount);

    System.out.println("\nName of Student 1: " + student1.name);
    System.out.println("Name of Student 2: " + student2.name);
    System.out.println("Name of Student 3: " + student3.name);

    student1.updateProfile("John");
    System.out.println("\nUpdated name of Student 1: " + student1.name);

    Student student4 = student1;
    System.out.println("Name of student 4: " + student4.name);

    student4.updateProfile("Mike");
    System.out.println("Name of student 1: " + student1.name);

    student4 = student2;
    System.out.println("Name of student 4: " + student4.name);

    student2 = student1;
    System.out.println("Name of student 4: " + student4.name);
    System.out.println("Name of student 2: " + student2.name);

    student4 = new Student();
    student4.updateProfile("Alex");
    System.out.println("Name of student 4: " + student4.name);
    System.out.println("Name of student 2: " + student2.name);
    System.out.println("Name of student 1: " + student1.name);
  }
```

- When working with object references in Java, understanding how re-assignments affect the connection between references and objects is crucial.
- Initial Object Creation
  - `Student student1` is created with initial values.
    - It points to a `Student` object with the name "Joan"
    - Memory reference: let's call it `ObjectA`.
  - `Student student2` is created with initial values.
    - It points to a `Student` object with the name "Raj"
    - Memory reference: let's call it `ObjectB`.
  - `Student student3` is created with initial values.
    - It points to a `Student` object with the name "Anita"
    - Memory reference: let's call it `ObjectC`.
  - Output:
    - The names of all three students and the total student count are printed.
- Updating an Object's State
  - `student1.updateProfile("John")` updates `ObjectA`
    - The name in `ObjectA` changes from "Joan" to "John"
    - `student1` continues to point to `ObjectA`
  - Output: The updated name "John" is printed
- Assigning `student1` to `student4`
  - `Student student4 = student1`
    - `student4` now references the same object (`ObjectA`) as `student1`
  - Output: The name of `student4` ("John") is printed
- Modifying the Object via `student4`
  - `student4.updateProfile("Mike")` updates `ObjectA`.
    - The name in `ObjectA` changes from "John" to "Mike"
    - Both `student1` and `student4` point to `ObjectA`, so the change is reflected in both.
  - Output: The name of `student1` ("Mike") is printed.
- Reassigning `student4` to `student2`
  - `student4 = student2;`
    - `student4` now references `ObjectB` (the same object as `student2`), which has the name "Raj"
    - `student1` remains pointing to `ObjectA`.
  - Output: The name of `student4` ("Raj") is printed
- Reassigning `student2` to `student1`
  - `student2 = student1;`
    - `student2` now references `ObjectA` (the same object as `student1`)
    - `student4` still points to `ObjectB` and is unaffected by this reassignment.
  - Output:
    - The name of `student4` ("Raj") is printed
    - The name of `student2` ("Mike") is printed
- Creating a New Object and Reassigning `student4`
  - `student4 = new Student();`
    - A new `Student` object (`ObjectD`) is created.
    - `student4` now references `ObjectD`
  - `student4.updatedProfile("Alex")` updates `ObjectD`
    - The name in `ObjectD` changes to "Alex".
  - Output:
    - The name of `student4` ("Alex") is printed.
    - The names of `student2` ("Mike") and `student1` ("Mike") are unaffected, as they reference `ObjectA`.
- Key Takeaways
  - References and Objects
    - A reference variable holds the memory address of an object.
    - Multiple references can point to the same object, causing changes made via one reference to be visible through others.
  - Reassignments:
    - Reassigning a reference variable makes it point to a different object.
    - The original object remains unchanged unless it is still referenced by another variable.
  - Creating New Objects
    - A new object occupies a distinct memory location.
    - Reassigning a reference to a new object breaks its link with the previous object.
  - Memory Visualization
    - Understanding which object each reference variable points to is crucial for predicting how the code behaves.
  - This flow demonstrates the dynamic relationship between references and objects, which is vital for effectively managing state in Java programs.

### Minor Note on Executing StudentTest and A Java 11 Feature

- We will get the following error when executing `StudentTest` in the last lesson if we execute the program like this in the terminal: `java StudentTest.java`
- ![image](https://github.com/user-attachments/assets/5bd9dea9-1fd2-48f0-8764-58283cfa5922)
- Here `java` was used instead of `javac`. So, it should be: `javac StudentTest.java` for compilation and `java StudentTest` for execution.
- The above issue seems to be due to un-intentional execution of `java StudentTest.java`.
- However, from Java 11, this particular command will still work and will both compile the code and will execute it in one step.
- Compilation will happen in memory and so, it will not generate a `.class` file like the way we get when we explicitly compile the file using `javac` command.
- `java StudentTest.java` only works if the class does not use any other class.
- In this case, `StudentTest` is using `Student` and so it will not work, as seen above.
- This new feature just helps in avoiding a separate compilation step and hence saves little bit of time.

### Coding Exercise 02 - Implementing Instructor Class - Manipulating Arrays with Object References

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
