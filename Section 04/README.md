# Section 04: Method Building Blocks: Operators & Control Flow Statements

**About:** This section will provide a comprehensive understanding of operators, control flow, variable scope, and recursion. These concepts are foundational for building complex software with efficient, clear, and logical code.

## Table of Content

- [Section 04: Method Building Blocks: Operators \& Control Flow Statements](#section-04-method-building-blocks-operators--control-flow-statements)
  - [Table of Content](#table-of-content)
  - [Agenda](#agenda)
  - [Lessons Learned](#lessons-learned)
    - [Operators](#operators)
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

## Author
