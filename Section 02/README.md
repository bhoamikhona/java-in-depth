# Section 02: Java - A High-Level Overview

**About:** This section nicely builds on each topic to give you a solid, high-level udnerstanding of Java. At the end of the section we will also run our first Java program. We begin the section by broadly defining what Java is. We then discuss the motivation behind creating Java which should help us understand why certain features that are unique to Java were introduced, and one of the features is plaform independence. We also learn about what compilation and interpretation and how it all helps achieve platform independence. We then look at JVM which is the soul of a Java platform. We will also learn about the entire Java family and take a closer look at Java SE.

## Table of Content

- [Section 02: Java - A High-Level Overview](#section-02-java---a-high-level-overview)
  - [Table of Content](#table-of-content)
  - [Lessons Learned](#lessons-learned)
    - [What is Java \& Who is Using it?](#what-is-java--who-is-using-it)
    - [Story Behind Java's Creation - A Brief History](#story-behind-javas-creation---a-brief-history)
    - [Compilation](#compilation)
  - [Author](#author)

## Lessons Learned

### What is Java & Who is Using it?

- Java can be broadly defined as a <ins>general purpose</ins>, <ins>object oriented</ins>, <ins>platform independent</ins>, <ins>concurrent</ins> programming language that runs very fast.
- General purpose implies that it is not constrained to one particular domain and can be used to develop wide variety of applications.
- Java is an object-oriented programming language which helps model real-world scenarios in a more natural way.
- Java's mantra is "Write once, Run anywhere" i.e. you write a program once and you must be able to run it on any platform regardless of the operating system and architecture. This is referred to as platform independence. It is one of the key benefits of Java.
- Java supports concurrent programming, which is nothing but multi-threading. This enables programs to perform multiple activities at around the same time.
- Java is also very fast and it is almost indistinguishable from C and C++.
- These are some of the core attributes of Java and they make Java a really solid, very reliable and complete programming language.
- Java was also built on few additional principles so, let's look at them.
- Java's syntax is purposely kept similar to C and C++.
- Simplicity was one of the most important goals for Java's designers. So, in comparison C and C++, Java is easy to use.
- One example is that in C and C++, programmers directly manipulate memory to free up space, and if it is not done properly it can result in programs getting crashed.
- In contrast, Java is simple and safer as it provides automatic memory management using a feature called garbage collection. This relieves programmers from directly manipulating memory, which in turn makes programming task easier.
- Java is also secure. This is important as Java programs can be downloaded from across the network and the downloaded programs should not cause any harm to the user's computer.
- Java comes with a rich library, which includes extensive pre-defined functionality and this library is the Java API.
- This helps developers to focus on writing new logic without having to re-invent the wheel.
- Java is free to use which is great for everyone including startups and individual programmers.
- Java was initially developed to run inside embedded systems and later within web browsers in the form of Java programs called applets.
- However, it soon evolved as popular language for developing large-scale web applications, standalone desktop applications, and mobile applications.
- Java provides separate dedicated platforms just for these different types of applications.
- Java is used by companies like Google, LinkedIn, Apple, Netflix, Amazon, eBay, and more.
- It was also used by NASA for their Mars Rover project called Spirit.
- Popular Open Source Java Libraries: Apache Solr, Hadoop, Mahout.

### Story Behind Java's Creation - A Brief History

- Before moving on, let's now spend some time understanding how Java came into existence.
- Compared to languages like C and C++, Java has some unique features and there's a certain motivation behind creating Java with those features.
- So, understanding the motivation will help us better appreciate the features that Java offers.
- So, let's go ahead and learn the story behind Java's creation.
- You must have heard of Sun Microsystems, which was a well-known Silicon Valley based company that got acquired by Oracle in 2010.
- In 1991, having been in business for almost a decade, selling unique space computers, Sun wanted to see what the next wave in computing was.
- So, they assembled a small team to brainstorm on this and they name the team as The Green Team.
- The Green Team's initial conclusion was that a network of hetergenous consumer devices communicating with each other could be one significant trend.
- These devices are small, they are reliable, distributed, real-time, embedded systems.
- Based on this initial conclusion, they decided to build a prototype as a part of new project called The Green Project.
- So, it is the Green team working the Green project.
- The vision for this project was to build an interactive wireless hand-held device which would communicate with home entertainment devices like TV and VCR; and the software that the Green team develops would be installed on all of these devices.
- The technology was expected to help in doing stuff like playing a certain TV channel or recording a particular favorite program, which is common these days but, not in early 90s.
- However, realizing that this vision was pretty challenging as it had some unique goals:
  - First goal is that the software should consume less memory as the target consumer devices are embedded devices which have limited resources like memory.
  - Next, the technology should allow these devices to communicate with each other and also pass around any software programs.
  - This leads us to the third and one of the most important goals, which is platform independence.
  - So, when these software programs are delivered from one device to another, they should run on the target device without any issues i.e. the hardware and operating system of the target devices should not cause any issues; and that's basically platform independence.
  - Similarly, when software programs are delivered to the target devices, they should not cause any harm to those devices.
  - So, security is critical.
  - Finally, the software should support multi-threading so that the devices can perform multiple activities at the same time.
  - For instance, if a program is being downloaded from another consumer device, then the current device might want to perform some other activity while the program is being downloaded.
- Initially, C++ was considered for this project, but it was rejected as it did not meet some of the project goals, which we just discussed, and platform independence was one of them.
- So, the team decided to create a brand new technology.
- Then one of the team members, James Gosling, created an entirely new language and named it <ins>Oak</ins>, after the tree outside his office.
- Oak was later re-named to Java due to trademark issues.
- So, Gosling is regarded as the Father of Java.
- Soon, The Green Team came up with a working demo and the interactive hand-held device was called <ins>Star Seven</ins>.
- It is interesting to note that this was way back in '92 and Star Seven already had a touch screen with feature similar to today's smartphones.
- Just Google for Gosling Star Seven and you should be able to find an old video of James Gosling demonstrating \*7.
- It is definitely worth watching.
- Sun targeted the cable TV industry to sell this product, but the technology was far too advanced for them, and hence, the project did not meet sucess.
- But, Sun soon realized that the newly popular world wide web was exactly identical to the Green project i.e. a network of heterogenous systems communicating with each other.
- Before Java came into existence, internet involved moving around only static HTML content, and some believe that by integrating Java they can make webpages more interactive.
- So, Sun developed a browser called HotJava and they showcased it at the SunWorld conference in 1995.
- The browser allowed Java programs called applets to be embedded in HTML pages and this would allow web applications to be interactive.
- But, for this to work, the client's browser should install Java, and the way it work is that an HTML page would include HTML tags corresponding to applets.
- The applets would actually reside on some remote server.
- When browser processes an HTML and when ti encounters these applet-related tags, it would then download the corresponding applets from the remote server and then execute them as it already had Java installed.
- Now like HTML content, same applet can run on heterogenous client platforms i.e. platform independence capability of HTML pages is still supported.
- Meaning that the applet might be on a Linux server and the client's browser might be on a Windows machine, but the downloaded applet from the Linux server would execute without any issues within the client's browser on the Windows machine.
- At the same conference, Netscape also announced their popular Netscape Navigator browser would include Java suport, and with that, the entire tech industry was very excited about the Java technology as this integration could be verybig for the future of internet.
- And soo, the first version of Java was released in January of 1996.
- So, that's brief history of Java.
- Always keep in mind that Java was mainly designed to work in a network environment consisting of heterogenous consumer devices.
- The environment had some unique goals and that led to the development of Java.
- Though it could not be adopted in the cable TV industry, it eventually found its success with the worldwide web; and especially, it soon evolved as a popular language for developing large scale web applications, standalone desktop applications, and mobile applications.

### Compilation

- We now know that platform independence is one of the key benefits of Java.
- But, before understanding hwo Java achieves platform independence, we need to first understand what platform dependency is.
- To understand platform dependency, we also need to know what compilation is.
- Compilation is a very fundamental concept in computer science, and if you are new to programming and not completely sure about what compilation is, then this short discussion on compilation should be very helpful.
- But if you are already familiar with programming and clearly understand what compilation is, then feel free to skip this lesson.
- Let's start with absolute basic concepts of a computer.
- Every computer has a fixed set of instructions that it understands and collectively they are referred to as <ins>the instruction set of a computer</ins>.
- So, the CPU would understand these instructions.
- A computer program is made up of some of these instructions.
- The instructions help a computer program to perform something meaningful.
- Each instruction tells the CPU to perform certain action, and each instruction is basically a sequence of 0s and 1s i.e. an instruction has a binary format.
- Such instructions that computer understands is called as <ins>Machine Language</ins> i.e. the language which a machine understands, just like the way we humans understand our languages.
- Machine language is also referred to as <ins>machine code</ins> and is sometimes also reffered to as <ins>native code</ins>.
- Here is an example of a machine instruction which performs addition operation: `000000 00001 00010 00110 00000 100000`
- The 6 digits on the right i.e. `100000` specify that it is an add operation.
- A computer program would involve many such instructions, and obviously, it would be very frustrating for someone to write and also read such instructions which have only 0s and 1s.
- So, it is very cumbersome and it has got to be simpler than that.
- So, computer scientists came up with another language called <ins>assembly language</ins> which was much more easier to read and write.
- Below is an example of adding two numbers in assembly language, which is much more expressive than machine code.

```x86asm
add $s0, $s1, $s2
```

- So, assembly language provides certain higher level notations for writing instructions, like add in this example.
- But computers understand only machine language.
- They do not understand assembly language.
- So, there is a program called <ins>assembler</ins> that translates assembly language instructions into machine language instructions which a computer can understand.
- Now, both machine language and assembly language are refferred to as low-level languages, and that's because they use low-level details of a computer.
- One example would be specifying the memory locaton where we are storing data.
- But, writing programs even in assembly language is still tedious, so programmers wanted programs to be expressed in a more easier way and they also wanted to hide low-level details.
- So in time, they came up with high-level languages.
- Some examples of high-level languages include FORTRAN, C, C++, Java, and C#.
- They use English-like words like `public`, `private`, mathematical notations like `+` and `-` and punctuations to write programs.
- So, they are much more easier to write and read, as we will see in this course.
- Below is an example Java program, and as you can see, it uses English words, math notations, and punctuation; and of course, they hide low-level details of the computer:

```java
public class Math {
  public static int sum(int x, int y) {
    return x + y;
  }
}
```

- So today, we mostly use only high-level languages.
- Assembly language is not very much used and is only used where performance is critical like in the case of operating systems of electronic devices.
- In terms of terminology, <ins>source code</ins> is the term that is use to refer to any code expressed in a programming language.
- So, source code is nothing but the programs that we write, like the Java program in the example above.
- Now, like in the case of assembly language, source code also cannot be understood by a computer, so we need to translate source code into machine into machine language and that's where compiler comes in.
- So, the translation from source code to machine code is done by this program called <ins>compiler</ins>.
- Machine code, which is the executable program, is then executed directly by CPU in a separate step.
- So, compilation and execution are two different steps.
- First, compilation is performed in order to translate source code into machine code, and then, separately, the machine code will be executed.
- So process is like this:
  - Source code ==> Compiler ==> Target language
- Note that here we are calling the translated languag as "target language" and not machine language.
- This is because in some cases it may be something else too.
- For example, in the case of C or C++, target language would be machine code.
- However, in Java's case, it is <ins>Java Bytecode</ins> - which will be discussed later.
- Sometimes target language can also be another programming language, for example ClojureScript is a language and it comes with a compiler which compiles ClojureScript programs into JavaScript, which is a different language.
- Such compilers are also referred to as <ins>source-to-source compilers</ins> or <ins>transcompilers</ins>.
- Source-to-source because it is converting one source code into another source code.
- There are some core operations that a compiler performs, and let's see what those are:
  - Verifying syntax and semantics of the source code is one of them.
  - This ensures that the source code complies with the rules of the programming language.
  - For example, a program is made up of statements, and in case of Java,every statement must end with a semicolon. That's a rule of Java programming language.
  - If a statement does not end with a semi-colon, then the compiler detects it as a syntactic error and reports it to the developer.
  - For example, here is a statement in Java that prints the text "hello!": `System.out.println("hello!");` and as you can see, the statement ends in a semi-colon.
  - If we omit the semicolon, then the compiler reports it as a syntax error.
  - Semantics is about meaning.
  - For example, in Java, we write our programs as classes; and a class can also have somehting called a subclass, which is just another class but, a specialized version of the original class.
  - But, if we declare the class with a keyword called `final`, then the compiler ensures that the class cannot have a subclass.
  - So, if we happen to define a subclass, then the compiler reports it as an error.
  - So, that's how the compiler is ensuring that the semantics associated with the `final` keyword is being respected i.e. it is not being violated.
  - Compilers also perform certain code optimizations for faster execution of the program. Certain compilers do that.
  - Finally, it generates machine code from the intermediate optimized code.
  - So, the optimization is done and then the machine code is generated from that.
- A compiler is a very complex program and these core operations are basic operations that any compiler supports.
- And as you will see in this course, a Java compiler perform tons of additional operations to ease the programmer's task.
- So, the compilation process can be slow due to the complexity in translation.
- However, once compiled, machine code execution will be very fast and the machine code can be executed any time and any number of times.
- But any change to the source code requires complete re-compilation.
- Next, we will look at platform dependency, which will also give you an idea on how a C program is compiled on Windows and Linux machines.
- We are not going to write any code for the discussion, but towards the end of the section, we will write, compile, and execute our first Java program.
- So, in this section, we will only write one program, but as the course progresses, starting from the next section, we will write lots of programs.

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
