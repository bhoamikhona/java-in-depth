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

## Author