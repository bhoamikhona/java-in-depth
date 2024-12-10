# Section 04: Method Building Blocks: Operators & Control Flow Statements

**About:** This section will provide a comprehensive understanding of operators, control flow, variable scope, and recursion. These concepts are foundational for building complex software with efficient, clear, and logical code.

## Table of Content

- [Section 04: Method Building Blocks: Operators \& Control Flow Statements](#section-04-method-building-blocks-operators--control-flow-statements)
  - [Table of Content](#table-of-content)
  - [Agenda](#agenda)
  - [Lessons Learned](#lessons-learned)
    - [Operators](#operators)
    - [Arithmetic Operators](#arithmetic-operators)
      - [Understanding How `++` and `--` Works with Arrays](#understanding-how--and----works-with-arrays)
    - [Aritmetic Operation Precedence \& Promotion Rules](#aritmetic-operation-precedence--promotion-rules)
      - [Operator Precedence](#operator-precedence)
      - [Operand Promotion](#operand-promotion)
      - [Same-Type Operations](#same-type-operations)
      - [Mixed-Type Operations](#mixed-type-operations)
    - [Minor Clarification on Arithmetic Operator Precedence Rule](#minor-clarification-on-arithmetic-operator-precedence-rule)
    - [Quiz 04 - Arithmetic Operators](#quiz-04---arithmetic-operators)
    - [Note on Student Class](#note-on-student-class)
    - [Comparison Operators](#comparison-operators)
    - [Logical Operators with Operator Precedence](#logical-operators-with-operator-precedence)
      - [Short Circuit](#short-circuit)
    - [Car Price Estimator - Coding Exercise for Comparison \& Logical Operators Overview](#car-price-estimator---coding-exercise-for-comparison--logical-operators-overview)
    - [Coding Exercise 04 - Car Price Estimator - Putting Comparison \& Logical Operators in Action](#coding-exercise-04---car-price-estimator---putting-comparison--logical-operators-in-action)
    - [Car Price Estimator - Exercise Solution Review](#car-price-estimator---exercise-solution-review)
    - [Bitwise Operators](#bitwise-operators)
      - [Bitwise AND (`&`)](#bitwise-and-)
      - [Bitwise OR (`|`)](#bitwise-or-)
      - [Bitwise XOR (`^`)](#bitwise-xor-)
      - [Bitwise NOT (`~`)](#bitwise-not-)
      - [Non Short Circuit Operators](#non-short-circuit-operators)
      - [Compound Bitwise Assignment](#compound-bitwise-assignment)
    - [Quick Note on Bitwise Operators with Boolean Operands](#quick-note-on-bitwise-operators-with-boolean-operands)
    - [Bit Shift Operators](#bit-shift-operators)
      - [Left Shift Operator (`<<`)](#left-shift-operator-)
      - [Unsigned Right-Shift Operator (`>>>`)](#unsigned-right-shift-operator-)
      - [Signed Right Shift Operator (`>>`)](#signed-right-shift-operator-)
      - [Applications](#applications)
      - [Compound Bit Shift Assignment](#compound-bit-shift-assignment)
    - [Quiz 05 - Bitwise \& Bit Shift Operators](#quiz-05---bitwise--bit-shift-operators)
    - [Control Flow - `if` Statement](#control-flow---if-statement)
    - [Switch Statement - Introduction](#switch-statement---introduction)
    - [Switch Restrictions](#switch-restrictions)
      - [Selector Expression Type Restrictions](#selector-expression-type-restrictions)
      - [Case Label Restrictions](#case-label-restrictions)
      - [Efficiency of Switch](#efficiency-of-switch)
      - [Limitations of Switch](#limitations-of-switch)
  - [Author](#author)

## Agenda

- Introduction to Operators:
  - Explore various operators, including:
    - Arithmetic
    - Comparison
    - Logical
    - Bitwise
    - Bit Shift
  - Operators play a crucial role in performing calculations and they are essential in software applications.
- Control Flow Statements
  - They control the flow of a program by determining which parts of the code to execute based on conditions.
  - Examples:
    - If-statements
    - Switch statements
    - For and while loops
  - Loops:
    - For and while are critical in iterating over data or executing tasks repeatedly.
      - Break statement: Exits the loop or control structure immediately.
      - Continue statement: Skips the current iteration and proceeds to the next one.
  - Control flow statements are fundamental in building business logic and are widely used in all software systems.
- Variable Scope
  - Define the scope of a variable i.e. where it is visible or accessible in a program.
  - Explore the rules and boundaries that determine a variable's usability.
- Recursion
  - Introduction to recursion as a programming technique.
  - Definition: A method where a function calls itself to solve smaller instances of the same problem.
  - It leads to compact, elegant, and sometimes more readable code.
  - Ideal for problems like factorial calculation, Fibonacci sequences, or traversing hierarchical data structures.

## Lessons Learned

### Operators

- What is an operator?
  - An operator is simply a symbol which performs an operation on its operands and produces a result.
- Operator Types
  - Assignment
    - The assignment operator simply assigns the value on its right to the variable on its left.
  - Arithmetic
  - Comparison
  - Logical
  - Bitwise
  - Bit Shift
  - `instanceof`
    - This operator will be discussed later, after introducing OOP concepts like inheritance and polymorphism.
- Unary, Binary, and Ternary Operators
  - An operator can operate on one or two or three operands.
  - Unary
    - If it operates on only one operand then it is called as a unary operator.
    - In certain types of unary operations, a prefix notation is used i.e. the operator appears before the operand hence, it is called a prefix notation. Example: `-x`
    - There are also unary operations where the operator appears after the operand, and it is called as postfix notation. Example: `x++`
  - Binary
    - If the operator, operates on two operands then it is called as binary operator.
    - In binary operator, the operator appears in between the two operands i.e. an in-fix notation is used. Example: `x + 3`
  - Ternary
    - If the operator, operates on three operands, then it is called as ternary operator.
    - While unary and binary operators can be represented by different kinds of symbols like `+`, `-`, `&`, etc., a ternary operator always uses only two symbols: `?` and `:`.
    - Syntax: `operand ? operand : operand`
    - Example: `(x > 3) ? x : 0`
    - It is also an in-fix notation, just like the binary operators since the operators appears in between the operands.
    - Here, the first symbol of the operator is `?`, while the second symbol is `:`.
    - So, there are two symbols that make up the ternary operator.
    - In this example, `x > 3` is the first operand, while the variable `x` and `0` are the second and third operands respectively.
    - `x > 3` is a condition being tested and if the result is true then the expression returns `x`, which is the second operand. Otherwise, it returns `0`, which is the third operand.
    - `>` is a comparison operator, which we will discuss in one of subsequent lessons.
    - We will discuss the ternary operator while discussing the control flow statements, as it can be used as an alternative to one of them.

### Arithmetic Operators

- Java supports 5 arithmetic operations:
  - Addition: `+`
    - A unary plus, example: `int i = +5` is used to indicate that a number is positive.
    - A binary plus, example `int y = 2 + 3` is used for addition.
    - If one of the operands in the binary plus is a string then, it is used as a string concatenation operator.
  - Subtraction: `-`
    - A unary minus, example: `int i = -2` can be used to indicate that the number or the expression is negative.
  - Multiplication: `*`
  - Division: `/`
  - Modulus: `%`
- These arithmetic operations are onl applicable to numeric primitive data types.
- Shorthand Operators
  - Increment/Decrement
    - Applies to addition and subtraction
    - `++` (increment) or `--` (decrement)
    - They are used for incrementing/decrementing a variable's value by 1.
    - `x++` is identical to `x = x + 1`
    - `x--` is identical to `x = x - 1`
  - Compound Arithmetic Assignment Operators
    - Applies to all arithmetic operators
      - `+=`
      - `-=`
      - `*=`
      - `/=`
      - `%=`
    - Example: `x += 5` is equivalent to `x = x + 5`
  - Pre and Post Operators
    - Let's consider a variable `x` which is initialized to the value `5` i.e. `x = 5`.
    - Post increment operator would look like this: `x++`
    - This would increment `x` to `6`.
    - Pre increment operator looks like this: `++x`, where `++` is followed by the variable. This would also increment `x` to `6`.
    - Essentially, both are incrementing `x` by 1.
    - So, what is pre and post then?
    - For that we need to consider either an assignment or a declaration statement.
    - Consider this delcaration statement: `int y = x++;`
    - This statement would first assign the current value of `x` to `y`, and then increment the value of `x`.
    - Here the value of `x` will be 6 and the value of `y` will be `5`.
    - Essentially, it is identical to these two statements, in that order: `int y = x` and `x = x + 1`.
    - Now, let's consider this statement to understand pre increment operation: `int y = ++x;`
    - This would first increment `x` and then assign the resulting value to `y` i.e. `x` is first incremented to `6` and the value `6` is assigned to `y`.
    - So, both `x` and `y` would be 6 after this statement is executed.
    - It is identical to these two statements, in that order: `x = x + 1` and `int y = x`.
    - Comparing the two, just the order of both operations is swapped.
    - So, pre implies that increment will happen first and then the assignment.
    - Post implies that assignment will happen first and then the increment.
    - Pre and Post decrement will also work in the same way, except that it will decrease the value by 1, instead of increasing it.
    - Example: `int y = x--` Here `y` is equal to `5` and `x` is equal to `4`.
    - Example: `int y = --x` Here `y` is equal to `4` and `x` is equal to `4`.

#### Understanding How `++` and `--` Works with Arrays

- The `++` and `--` operator, when used in conjunction with arrays, determines which index is accessed or modified and whether the index value changes before or after the operation.
- Behavior of `++` and `--` with arrays:
  - `++` increases the value of the index
  - `--` decreases the value of the index
  - Can be applied as pre or post operators
- Pre-Increment/Decrement (`++index`/`--index`)
  - The index is modified before accessing the array.
  - Example:
  ```java
  array[++index] = value; // Increment index, then assign
  array[--index] = value; // Decrement index, then assign
  ```
- Post-Increment/Decrement(`index++`/`index--`)
  - The current value of the index is used first, and then the modification happens after the operation.
  - Example:
  ```java
  array[index++] = value; // Assign, then increment index
  array[index--] = value; // Assign, then decrement index
  ```
- Example for `++`:

```java
int index = 0;
int[] array = new int[3];
array[index++] = 10; // Uses index 0, then increments to 1
array[index++] = 20; // Uses index 1, then increments to 2
array[index++] = 30; // Uses index 2, then increments to 3
// Final array: [10, 20, 30]
```

- Example for `--`:

```java
int index = 2;
int[] array = new int[3];
array[index--] = 30; // Uses index 2, then decrements to 1
array[index--] = 20; // Uses index 1, then decrements to 0
array[index--] = 10; // Uses index 0, then decrements to -1
// Final array: [10, 20, 30]
```

- Key notes:
  - Pre (`++index`, `--index`): Modify index before array access.
  - Post (`index++`, `index--`): Modify index after array access.
  - Ensure index remains within valid array bounds to avoid exceptions.

### Aritmetic Operation Precedence & Promotion Rules

#### Operator Precedence

- Arithmetic Operations in Java follow PEMDAS-LR.
- PEMDAS-LR rule guides the correct sequence for solving a mathematical expression.
- It prioritizes operations within parentheses first, followed by exponents or powers.
- Then, it proceeds with multiplication or division (from left to right), and finally, addition or subtraction (from left to right).

#### Operand Promotion

- Operands smaller than `int` viz `byte`, `short`, or `char` are first promoted to `int`.

#### Same-Type Operations

- If both operands are `int`, `long`, `float`, or `double`, then operations are carried in that type and evaluated to a value of that type.

#### Mixed-Type Operations

- If operands belong to different types, then smaller type is promoted to larger type.
- Order of promotion: `int` -> `long` -> `float`, -> `double`
- Note that if you have `long` and `float operands, `long`is promoted to`float`even though`long`is 64 bit and`float` is 32 bit.
- Type of final result will be of the largest data type in the expression.

### Minor Clarification on Arithmetic Operator Precedence Rule

- This is a minor clarification on Operator Precedence rules that were discussed in the beginning of the previous lesson.
- We had the following two rules that help with implicit grouping of operators and operands.
- Once grouped, the evaluation of sub-expressions happen from left-to-right.
- Below is an explanation of grouping and evaluation process with the same example `5 + 9 - 3 + 2 * 5` from the lesson.
- Rule 01: Multiplicative operators (\*, /, %) have higher precendence over additive operators (+, -)
- Rule 02: Operators with same precedence are groupd left-to-right.
- By applying rule 1, our expression becomes `5 + 9 - 3 + (2 * 5)`. Here 2 \* 5 is only grouped, but not yet evaluated to 10.
- Next by applying rule 2, our expression `5 + 9 - 3 + (2 * 5)` becomes `((5 + 9) - 3) + (2 * 5)` as remaining expression is left with only additive operators.
- Finally, our expression will be evaluated from left-to-right. That is evaluation happens in following sequence:
- `(5 + 9)` is evaluated first resulting in `(14 - 3) + (2 * 5)`.
- Next, `(14 - 3)`, which is the left operand of `+` is evaluated resulting in `11 + (2 * 5)`.
- Next, the right operand of `+` is evaluated resulting in `11 + 10`.
- Finally, since both operands of `+` are evaluated, `+` operator will be applied resulting in `21` as the final value.
- As another example, let's consider the following statement where we are invoking methods `foo()` & `bar()` and the values returned are added.
- Since we have only a single `+` operator, we just evaluate from left-to-right, i.e., we first evaluate left operand (invoking `foo()`) and then the right operand would be evaluated (invoking `bar()`).
- Finally, the returned values are added.
- In general, for any arithmetic operator, the operands are first evaluated completely (left followed by right) before the operator is applied: `int val = foo() + bar();`

### Quiz 04 - Arithmetic Operators

### Note on Student Class

### Comparison Operators

- THere are six comparison operators (also known as relational operators), and they are very straightforward:
  - `>` - only applicable to numeric primitive data types
  - `<` - only applicable to numeric primitive data types
  - `>=` - only applicable to numeric primitive data types
  - `<=` - only applicable to numeric primitive data types
  - `==` - applicable to all primitive data types and to object references
  - `!=` - applicable to all primitive data types and to object references
- A comparison operator is used for comparing one operand with another operand.
- A comparison operation evaluates to a `boolean` value i.e. `true` or `false`.
- This means that, they are used for condition, and conditions are useful in control flow statements like `if` statement.
- When comparing two object references using equality operators i.e. `==` and `!=` then it is called identity comparison.
- Equality operators are also great for `null` checks. Example:

```java
static boolean update(Student s, String name) {

  /*
   * We are checking for `null` here because if the object is empty and
   * we try to access its `name` property then it will throw a
   * NullPointerException.
   *
   * So, equality operators can be used for checking `null` values.
   *
   * Also, since we are checking for a value of a parameter, such checking
   * is called parameter validation.
   */
  if (s == null) {
    return false;
  }

  s.name = name;
  return true;
}
```

### Logical Operators with Operator Precedence

- There are 3 logical operators and they have something to do with creating logic:
  - AND: `&&`
    - This is a binary operator.
    - Returns true only if both the operands are true, otherwise returns false.
  - OR: `||`
    - This is a binary operator.
    - Returns true if at least one of the operands is true, otherwise returns false.
  - NOT: `!`
    - This is a unary operator.
    - This simply returns the inverse of its operand i.e. if the operand is true, it returns false and if the operand if false, it returns true.
    - It is also referred to as logical complement operator.
- Logical operators help to check multiple conditions at once, for example, in an `if` statement. This helps reduce the number of nested `if` statements.
- Example:

```java
// nested if statements:
if (age > 35) {
  if (salary > 90_000) {
    // approve loan
  }
}

// using logical operators
if (age > 35 && salary > 90_000) {
  // approve loan
}
```

- Essentially what we have here, with these logcial operations is Boolean Algebra.
- In Boolean Algebra, AND oepration is referred to as conjunction, OR is referred to as disjunction, and NOT as negation.
- We can refer to all these expressions with local operations as just Boolean expressions.
- ![truth-table](https://github.com/user-attachments/assets/2fe005ec-cee9-4b9d-8d1a-a46aea1cba9a)
- The above image is of something called Truth Table (as referred in Boolean Algebra).
- So, logical operators take boolean operands and evaluate to a boolean value.
- If the operands are something other than boolean then we get a compiler error.
- Control statements are where we see logical operations being commonly used.

#### Short Circuit

- Short Circuit AND:
  - With regards to AND operator, if the first operand is false, then the entire expression results to false. It short circuits and doesn't even bother checking the second operand.
  - So, the second operand is conditionally evaluated, rather than always.
  - For this reason, AND operator is also referred to as Conditional-AND operator.
  - That is, the evaluation of the second operand is conditionally dependent on evaluation of left operand.
- Short Circuit OR:
  - With regards to OR operator, if the first operand is true, the entire expression results to true, regardless of what the second operand is.
  - So, the OR operator short circuits if the first operand is true.
  - So, OR is also a short circuit operator, and it is also referred to as Conditional-OR.
- Short circuit is featured in Java for optimization because sometimes only one operand is evaluated and that improves performs.
- Among the two short-circuit operators, the short-circuit nature of AND operator is also extremely useful in preventing the `NullPointerException`.
- We know that a `NullPointerException` is generated at runtime when an object reference is `null` and we try to access one of its members (methods or variables) using the dot operator.
- For example, consider this:

```java
if (s.age > 21) {
  // code
}
```

- `s` is referencing some object.
- Now, if `s` happens to be `null` then we know that we will get a `NullPointerException` at runtime.
- To prevent it, we can add a null check, like so:

```java
if (s.age > 21) {
  // code
}

if (s != null && s.age > 21) {
  // code
}
```

- So, we first check if `s` is not equal to `null`.
- If that is true, only then our condition of `s.age > 21` will be evaluated.
- If `s` is `null`, then the first condition of the AND operator will be false and due to its short-circuit nature, the AND operator will not evaluate the second condition, thereby preventing the `NullPointerException`.
- Logical Operator Chaining, example:

```java
if (age > 35 && salary > 90000 || !hasBadCredit) {
  // code
}
```

- Operator Precedence of Logical Operators: ! > && > ||
- Operator Precedence across logical, comparison and arithmetic:
  - ! > arithmetic > comparison > &&, ||
- ![operator-precedence](https://github.com/user-attachments/assets/c7112a9a-c660-46ce-8aca-1316197cf04d)
- Always use parentheses to make it clear and for readability purposes.

### Car Price Estimator - Coding Exercise for Comparison & Logical Operators Overview

### Coding Exercise 04 - Car Price Estimator - Putting Comparison & Logical Operators in Action

### Car Price Estimator - Exercise Solution Review

### Bitwise Operators

- Bitwise operators work with individual bits of operands.
- Operands can be either integer primtiives or boolean.
- Boolean as an operand is very rarely used.
- When we were discussing about arithmetic operators, we said something about the operand promotion rule, where operand smaller than `int` are automatically promoted to `int`. That rule also applies here, for bitwise oeprators.
- NOTE: We said that bitwise operators work at bit level but, then we also said that the operands can be integers so, what does that mean?
- That means that the bitwise operators would actually consider the binary representation of integer operands and then operate on them at bit level.
- Bitwise operators are heavily used in embedded system applications, where there are limited amount of resources, for example, very limited memory.
- In such cases, things have to be manipulated very efficiently, and bitwise operators can play a vital role here.
- They are also typically used in hash tables, which is a fundamental data structure, like an array.
- Bitwise operators are also heavily used in data compression and data encryption fields.
- Generally speaking, there is a good chance that you may never use bitwise operators unless you are doing some really low-level programming where performance is critical and things have to be managed efficiently.
- However, it is always a good idea to learn about them, just in case.
- There 4 bitwise operators:
  - `&` Bitwise AND
  - `|` Bitwise OR
  - `^` Bitwise XOR (exclusive OR)
  - `~` Bitwise NOT
- Now let's look at each of them.

#### Bitwise AND (`&`)

- Bitwise AND operator (`&`) will return 1 if both input bits are 1, otherwise it will return 0.
- Consider this Example:

```java
x = 1;
y = 3;
```

- Applying Bitwise AND on `x` and `y` would return an integer value of 1.

```java
x = 1;
y = 3;

System.out.println(x & y); // 1
```

- To understand how it works, consider the binary representations of `x` and `y`:
- ![bitwise-4](https://github.com/user-attachments/assets/7f6218a1-bfb5-48ed-9eda-027275ccebe1)
- As you can see, only the last bit of both numbers is 1, and so in the output, only the last bit would be 1, the rest would be 0.
- So, the result is the decimal value 1.

> [!NOTE]
>
> If the operands are booleans instead of integers then all bitwise oeprators would treat the boolean value `true` as `1` and `false` as `0`.

#### Bitwise OR (`|`)

- Bitwise OR would return 1 if at least one of the input bits is 1.

```java
x = 1;
y = 3;

System.out.println(x | y); // 3
```

- Binary representation:
- ![bitwise-5](https://github.com/user-attachments/assets/9b7caa47-c3d1-48ac-a79b-f4a29b60777e)
- As you can see, we have 1 in the output if one of the input bits is 1.
- So, the result is the decimal value 3.

#### Bitwise XOR (`^`)

- Bitwise XOR returns 1 if and only if one of the inputs is 1, but not both.

```java
x = 1;
y = 3;

System.out.println(x ^ y); // 2
```

- Binary representation:
- ![bitwise-6](https://github.com/user-attachments/assets/3e2e0942-b4da-4488-a454-f414a310f140)
- As you can see, we have 1 in the output if and only if one of the inputs is 1.
- But, we get a 0 if either both are 1 or both are 0.
- So, the final result is the decimal value 2.

#### Bitwise NOT (`~`)

- Bitwise NOT is a unary operator.
- It simply inverts the bits of its operand.
- Consider this example:

```java
x = 1;

System.out.println(~x); // -2
```

- Binary represenation:
- ![bitwise-7](https://github.com/user-attachments/assets/ae20316a-4884-43a3-841a-b70edf4bfc00)
- As you can see, all the 0s are made 1s, and the last bit 1 is made 0.
- The corresponding decimal number is integer -2.

#### Non Short Circuit Operators

- Bitwise operators do not short circuit and therefore, they are referred to as non-short-circuit operators.
- This means that these operators force JVM to always check both the operands.

#### Compound Bitwise Assignment

- Bitwise can also be compounded:
  - `&=`
  - `|=`
  - `^=`
- Example:

```java
opearand1 = operand1 & operand2; // expanded form
operand1 &= operand2; // compounded form

// example:
boolean b = true;
b &= false; // b = b & false --> b = true & false --> b = false
```

- Similarly, we have compounded bitwise OR operator and bitwise compound XOR operator:

```java
operand1 |= operand2; // bitwise compound OR operator
operand1 ^= operand2; // bitwise compound XOR operator
```

> [!NOTE]
>
> Bitwise only works on integer and boolean data types. It does not work on float/double or object references.

- If you apply bitwise operators on `char` then it is first converted to `int` and then the binary representation of `int` value is used for bitwise operation.

### Quick Note on Bitwise Operators with Boolean Operands

- In the last lesson, we mainly discussed about bitwise operators applied on integer primitives as they are most commonly used as operands.
- We said using bitwise operators with boolean operands is very rare and did not discuss it.
- However, there are a couple of things that need to be highlighted about applying bitwise on boolean operands:
  - Among bitwise operators, only `&`, `|`, and `^` can be used with boolean operands. Bitwise NOT (`~`) will not even compile with boolean. If we need such beahvior then we would use logical NOT (`!`) operator.
  - Also, strictly speaking, to be consisten with the Java language specification (JLS), the operators `&`, `|`, and `^` when applied on boolean operands are referred to as logical operators and not bitwise. In other words, the operators `&`, `|` and `^` are referref to as bitwise ONLY when they are applied on integer operands and this is the common scenario as we discussed. Also, keep in mind that the logical operators `&&` and `||` have the short-circuit property due to which JLS refers to them as conditional AND and conditional OR respectively. With `&` and `|`, as discussed in the lesson, they do not have the short-circuit property i.e. they always force JVM to evaluate both operands.

### Bit Shift Operators

- Like bitwise operators, bit shift operators also work with individual bits of its operands.
- As the name implies, bit shift operators, simply shift bits.
- That is, their operands must be integers and if you consider their binary representation then the bitshift operators can shift the bits in either left or right direction.
- Here are the 3 bit shift operators:
  - `<<` Left Shift
  - `>>>` Unsigned Right Shift
  - `>>` Signed Right Shift
- Now let's look at each of these operators.

#### Left Shift Operator (`<<`)

- ![bitshift-1](https://github.com/user-attachments/assets/4fda5bb1-8e6a-4766-9bae-bce79df0a4b3)
- Left shift operator is a binary operator and it left shifts, left operand by the number of bits specified on the right.
- Look at the example in the image above.
- Let's consider the value 6 along with its binary representation in full 32 bits.
- Now let's say we want to left-shift 6 by 1. Here is the syntax: `6 << 1`
- As you can see, all the bits are shifted by 1 position to the left.
- After performing left shift, the resulting binary number corresponds to the decimal 12.
- As bits get shifted left-wards, we need to fill the newly generated empty slots.
- With left-shift operators, 0s are inserted in those empty slots.
- Applying left-shift operator is the same as multiplying by powers of 2.
- For example, if you left-shift 6 by 1, then it is same as multiplying 6 by 2<sup>1</sup>, which will result in 12.
- Similarly, if we left-shift 6 by 3, then it is same as 6 &times; 2<sup>3</sup>, which is 6 &times; 8, which is 48.

#### Unsigned Right-Shift Operator (`>>>`)

- ![bitshift-2](https://github.com/user-attachments/assets/0937b856-0d03-4ae0-9728-14ad122a8301)
- Unsigned right shift operator does the exact opposite of left shift operator i.e. it right shifts the left operand by the number of bits specified on the right.
- Due to right-shifting, the higher order bit positions, which are on the left side, are empty now; and they would get filled by 0s.
- Look at the example in the image above.
- Let's consider the value 12 along with its binary representation.
- Now, let's say that we want to right-shift 12 by 1. Here is the syntax: `12 >>> 1`.
- You can see that all bits are shifted by 1 position towards right (in the image above).
- After performing right shift, the resulting binary number corresponds to the decimal value 6.
- Applying right shift operator is same as division by powers of 2.
- For example, if you right shift 12 by 1, then it is same as dividing 12 by 2<sup>1</sup>, which is 12/2, which is 6.
- So, the left shift corresponds to the multiplication by powers of 2, and unsigned right shift corresponds to the division by powers of 2.

#### Signed Right Shift Operator (`>>`)

- ![bitshift-3](https://github.com/user-attachments/assets/a3460d4b-2b3a-431f-bb63-1add035c2343)
- The signed right shift operator is same as the unsigned right shift operator but, it is signed so, the higher order bits are now padded with MSB (most significant bit) instead of 0s.
- Basically, the sign is preserved.
- Look at the example in the image above.
- We have a very large negative number.
- Let's say we want to right shift it by 4.
- So, we can see the digits are shifted right by 4 positions.
- Since the MSB is 1, the higher order bit positions are now filled with 1.
- Since the sign is preserved, the resulting number is still negative.
- In general, for all bit shift operators, regardless of whether it is left shift or right shift, always remember that the left operand indicates the number to be shifted while the right operand tells by how many bits the left operand should be shifted.

#### Applications

- ![bitshift-4](https://github.com/user-attachments/assets/933e26a0-9308-44c6-b0c7-8225ac18c4ab)
- Where are these bit shift operators used?
- One area is during compilation process.
- Compilers, as part of optimization, may replace multiplication and division with appropriate bit shift operations which are much more faster.
- Like in the case of bitwise operators, bit shift operators are also used in Java's hashmap data structure, which is an implementation of hash table.
- Both hash map and hash table will be discussed later in the course.
- Bit shift operators, like bitwise operators are also heavily used in embedded programming.
- They are also used in game programming, where performance is critical.
- They are also used in systems that do not have floating point support in hardware.
- Link to an interesting discussion on applications of bit shift operators: [Reference](https://stackoverflow.com/questions/520625/have-you-ever-had-to-use-bit-shifting-in-real-projects)

#### Compound Bit Shift Assignment

- ![bitshift-5](https://github.com/user-attachments/assets/e68f1026-4914-4fdb-9229-30a11e1be489)
- Like Arithmetic and Bitwise operators, Bit Shift operators can also be expressed using the compound assignment notation.
- In the image above you can see both, the expanded form and also the shorter/compounded notation.

### Quiz 05 - Bitwise & Bit Shift Operators

### Control Flow - `if` Statement

- A control flow statement affects the flow of control in a program, and it does so by using one or more boolean conditions.
- If a particular boolean condition is true then it may execute a particular set of statements, and if the condition is false, then it may execute a different set of statements.
- `if` statement
- `if` - `else if` - `else` statement
- `if` - `else` statement
- nested `if` statements
- If you are returning a value individually, in either `if` or `else if` or `else` block, make sure that there are `return` statements for all of those options. The compiler will check for it and if you have a missing `return` statement, you will get an error.

> [!NOTE]
>
> Java does not have the notion of truthy or falsy values like JavaScript does.
>
> So, the condition in the `if` block or `else if` block must be boolean.

### Switch Statement - Introduction

- Switch statement can be used as an alternative to an if-statement if the conditions involved are much more simpler.
- For example, if the conditions involved include a single variable and only an equality operation, then a switch statement can be used instead of if-statement.
- In such simple conditional checks, it is preferable to use switch statement instead of if-statement because it can be much more readable, concise, and efficient since it is designed to be more efficient.
- Switch statement has been around from Java 1 onwards, and its syntax has been constant up until Java 13.
- But, there are some limitations with the basic syntax and hence, in Java 14, the language designers have extended the syntax to include something called as arrow labels, and they also introduced a new feature called as switch expressions.
- Keep in mind that switch statement and switch expression are two different things, and in this lesson we are going to look at switch statement.
- Note that switch expression is simply an expression, which means that it would evaluate to a value and hence, it can be used in an assignment statement or even as part of a return statement.
- After Java 14, the syntax has been further extended in Java 21 to include something called as pattern matching.
- So, there are a series of enhancements in the syntax and maybe there will be more in the future but, the basic syntax has been there from Java 1 onwards, which is more than two decades.
- ![switch-statement](https://github.com/user-attachments/assets/a492332a-ebbe-489d-8220-e25f1d2b61e0)
- The switch statement starts with a keyword called `switch`, followed by parentheses, followed by switch body - which starts and ends with curly braces. Switch body is called as switch block.
- In the parentheses we will have an expression and it is called as the selector expression.
- In the `if` statement, we have conditions in the parentheses but, in the selector expression we will not have conditions represented in the exact same way.
- The conditions in the switch statement are represented by selector expression along with case statements.
- The case statement starts with the keyword `case`, followed by case label, followed by colon, followed by 0 or more code statements corresponding to that particular case.
- The code statements corresponding to the case, together is called case block.
- In the switch statement, we also have something called as the default statement and it is optional. We can use it like the else block in if-else statement.
- We can only have one default statement.
- The default block need not be the last block, it can be followed by other case statements, although that is not a common convention. Typically, you will the default statement as the last one.
- The fall through mechanism - this condition occus when there is no break statement in switch statement and causes the execution of all the cases until either a break statement is reached or the switch statement is completely executed.
- To address the issue of fall through mechanism, we use the break statement which breaks out of the enclosing switch statement.
- In comparison to if-else, in switch statement, the advantage is that the intent is very clear - that we are using a single variable, and trying to check if its value is one of the case labels.
- The code also looks more compact and readable in most cases - in switch statement.

### Switch Restrictions

- There are certain restrictions on the selector expression type as well as on the case labels so, let's go ahead and look at what those are.

#### Selector Expression Type Restrictions

- ![switch-restrictions-1](https://github.com/user-attachments/assets/684cf8f4-4ec5-442c-b9ac-43827ed4c4db)
- Integer Types Only
  - The selector expression (the value inside the parentheses in `switch`) must evaluate to one of these integer types:
    - `byte`
    - `short`
    - `char`
    - `int`

> [!NOTE]
>
> `long` is excluded for performance reasons - it uses more memory and CPU cycles.

- Exclusions
  - Floating-point types (`float`, `double`): Not supported because they represent approximate values, which can lead to rounding errors. `switch` requires precise values for comparisons.
  - Boolean: Not supported because `boolean` values are better handled with `if` statements or the ternary operator.
- Wrapper Types
  - Boxex primitives (wrapper classes) for integer types are supported:
    - `Byte`
    - `Short`
    - `Character`
    - `Integer`
  - These are supported due to Java's autoboxing featuer, which allows primitives and their wrapper objects to be used interchangeably.
- Strings
  - From Java 7 onwards, `switch` supports `String`.
- Enums
  - Enums are supported, representing a fixed set of values known as **enum constants**.
  - Internally, enums are compiled into a regular class.
- Pattern Matching
  - From Java 21 onwards, any object reference can be used as a selector expression.
  - A `null` selector expression is also permitted starting with Java 21.
  - Pattern Matching expands the functionality of `switch` to include advanced features like type checks and deconstruction, which we will explore later.

#### Case Label Restrictions

- ![switch-restrictions-2](https://github.com/user-attachments/assets/d390279c-91f2-4e98-ad8d-6907a2555b50)
- Range Restriction
  - The value of a case label must fall within the range of the selector expression's type.
  - Example: If the selector expression is of type `int`, the case label must also fall within the range of `int`.
- Constant Expression
  - Case labels must be a constant expressions, meaning their values are determined at compile time.
  - This allowes for optimizations like the creation of **jump tables** (a jump table is essentially an array of addresses, where the index corresponds to the case value), enabling constant-time execution O(1).
- Unique Lables
  - Case labels must be unique within a `switch` block. Duplicates are not allowed.
- Null Case
  - Until Java 20, case labels could not be `null`.
  - From Java 21 onwards, `null` is a valid case label.
- Patterns
  - Java 21 onwards, case labels can use patterns for more advanced matching.
- Final Variables
  - To use a variable as a case label, it must be declared as `final` and initialized.
  - Example:
  ```java
  final int TEMP = 100;
  switch(value) {
    case TEMP:
      // code
  }
  ```
- Allowed Case Label Types
  - Integer literals (`byte`, `short`, `char`, `int`)
  - String literals
  - Enum constants
  - Final variables of permissible types (not enums).

> [!NOTE]
>
> Enum constants and constant variables are distinct concepts.

#### Efficiency of Switch

- Contiguous Case Labels
  - If case labels are contiguous (e.g. 1, 2, 3), the `switch` statement can use a jump table (a jump table is essentially an array of addresses, where the index corresponds to the case value) for constant-time execution (O(1)).
- Gaps in Case Lables
  - If case labels are sparse or have gaps, the implementation may use a binary search tree or other efficient structures, leading to logarithmic time complexity (O(log n)).

> [!NOTE]
>
> The actual implementation of optimizations may vary by JVM.

#### Limitations of Switch

- `switch` is designed for scenarios involving single-variable comparisons with equality operations.
- It is not suitable for complex conditions involving multiple variables or operators.

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
