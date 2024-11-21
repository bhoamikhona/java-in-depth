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

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
