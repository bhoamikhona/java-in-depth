# Section 02: Java - A High Level Overview

## Table of Content

- [Section 02: Java - A High Level Overview](#section-02-java---a-high-level-overview)
  - [Table of Content](#table-of-content)
  - [Agenda](#agenda)
  - [Lessons Learned](#lessons-learned)
    - [What is Java and Who is Using it?](#what-is-java-and-who-is-using-it)
    - [Story Behind Java's Creation - A Brief History](#story-behind-javas-creation---a-brief-history)
    - [Compilation](#compilation)
    - [Platform Dependency](#platform-dependency)
    - [Interpreter](#interpreter)
      - [CPU's Fetch-and-Execute Cycle](#cpus-fetch-and-execute-cycle)
      - [Interpreter's Fetch-and-Execute Cycle](#interpreters-fetch-and-execute-cycle)
      - [Pros \& Cons of Interpreter](#pros--cons-of-interpreter)
        - [Pros](#pros)
        - [Cons](#cons)
    - [Platform Independence in Java](#platform-independence-in-java)
  - [Author](#author)

## Agenda

- This section nicely builds on each topic to give you a solid, high-level understanding of Java.
- At the end of the section, we will also run our first Java program.
- We begin the section by broadly defining what Java is.
- We will then discuss the motivation behind creating Java.
- This should help us understand why certain features that are unique to Java were introduced, and one of them is Platform Independence.
- But, before learning about it, we first need to understand what platform dependency is.
- In the process, we will also learn about what compilation is, which should be very useful for complete beginners.
- To understand platform independence, we also need to learn about interpretation as it helps achieves platform independence. So, we will also discuss about interpreters.
- Then we discuss about how Java achieves platform independence.
- We also take a look at JVM, which is kind of soul of Java platform.
- JVM is a very important topic and we also have a separate section dedicated to it.
- Java software family involves multiple platforms for developing applications for different types of devices like web servers, desktops, and mobile devies.
- Java SE is one of the platforms, and is also a core platform within the Java family.
- This course is about Java SE platform.
- So, we will install Java SE and the entire installation proces will be demonstrated step-by-step.
- Finally, we will code our first Java program and compile and execute it.

## Lessons Learned

### What is Java and Who is Using it?

- Java can be broadly defined as a general purpose, object oriented, platform independent, concurrent programming language that runs very fast.
- General purpose implies that it is not constrained to one particular domain and can be used to develop wide variety of applications.
- Java is an object oriented programming language which helps model real world scenarios in a more natural way.
- Java's mantra is "Write Once, Run Anywhere (WORA)" i.e. you can write a program once you must be able to run it on any platform regardless of the operating system and architecture. This is referred to as platform independence. It is one of the key benefits of Java.
- Java supports concurrent programming, which is nothing but multi-threading and this enables programs to perform multiple activities at around the same time.
- Java is also very fast.
- It is almost indistinguishable from C and C++.
- These are some of the core attributes of Java and they make Java a very solid, reliable, and complete programming language.
- It is one of the most widely used programming languages.
- Java was also built on few additional principles so, let's take a look at some of them.
- Java was invented in the mid-90s and most programmers during early-90s were using C and C++.
- So, Java's designers wanted to keep the syntax familiar and hence, it is similar to C and C++.
- Simplicity was one of the most important goals for Java's designers.
- So, in comparison to C and C++, they wanted to be it to be easy to use.
- For this reason, Java doesn't have many features which make C and C++ complex, confusing and unsafe.
- One example is related to memory management.
- In C and C++, programmers directly manipulate memory to free up space.
- If this is not properly done, it can result in programs getting crashed.
- In contrast, Java is simple and safer as it provides automatic memory management using a feature called garbage collection.
- This relieves programmers from directly manipulating memory which in turn makes programming task easier.
- Garbage collection will be discussed in detail in the JVM internals section.
- Java is also secure and this is very important as Java programs can be downloaded from across the network and the downloaded programs should not cause any harm to the user's computer.
- So, we looked at some of the key features of Java however, there are few other nice things that Java has to offer.
- One of them is that Java comes with a rich library, which includes extensive pre-defined functionality and this library is the Java API.
- This helps developers to focus on writing new logic without having to re-invent the wheel i.e. they can simply make use of the pre-defined functionality, which is written by experts and is already being used by millions of programmers.
- Java is also free, which is great for everyone.
- Java was initially developed to run inside embedded systems and later within web browsers in the form of Java program called applets.
- However, it soon evolved as a popular language for developing large-scale web applications, standalone desktop applications, and mobile applications.
- Java provides separate dedicated platforms just for these different types of applications.
- Google, Amazon, LinkedIn, Apple, Netflix, eBay - all of these companies use Java.
- Example: Gmail is mostly written in Java.
- Java was also used by NASA for their Mars Rover project called Spirit. It seems one of the reasons they picked Java is due to its platform independence capability.
- This also tells us that Java is truly a general purpose programming language i.e. it is not constrained to only commercial space.
- Also, when it comes to open source libraries, probably most number of open source libraries are implemented in Java.
- Example open source libraries: Hadoop, Apache Solr, Mahout
- Companies like eBay and Apple use Apache Solr for providing search capability within their websites.

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

### Platform Dependency

- Now that we have a basic understanding of what compilation is, let's take a look at what platform dependency is.
- We will also do a short demo of platform dependency.
- Let's first consider that we have a windows machine and let's also assume that we have written a C program called `Hello.c`.
- To compile the program, we can use a compiler called GCC, and this would be the command, `gcc -o Hello Hello.c` where `Hello.c` is the file containing the C program, while `-o` is an option that tells compiler to name the output file as `Hello`, which will have a `.exe` extension on Windows.
- So, on compiling `Hello.c` we get an executable file called `Hello.exe` which includes the machine code.
- Here compilation step is also doing something called <ins>linking</ins>.
- Generally, any software comprises of many source code files, and each source code file is compiled into a separate file called the object file, which has an extension `.o` or `.obj`.
- For example, in this case it could be `Hello.o`.
- These object files are then grouped or linked to form a final executable file.
- This linking in many cases is done by the compiler itself.
- However, it can also be done manually by programmers themselves using another program called a <ins>linker</ins>.
- In this example, compiler does the linking and is generating an executable called `Hello.exe` which is finally executed by just typing in `Hello` at the command line.
- Similarly, we can also compile the same `Hello.c` program on a Linux machine using the same command as on Windows.
- this would also produce an executable, but in Linux the executable will be named as `Hello.out`.
- So, the extension is `out` here rather than `exe`, which can then be executed by typing `./Hello`.
- So, what we have here is both the executables being successfully executed on the machines on which those executables are generated.
- ![platform-dependency-0](https://github.com/user-attachments/assets/9bbe260b-3cb8-4346-bd3c-d368ccb9e248)
- But this wouldn't be possible:
- `Hello` executable generated on Windows machine cannot be executed on Linux, and that is an example of platform dependency.
- ![platform-dependency-1](https://github.com/user-attachments/assets/a6b47f58-ef29-43fa-82b7-3ff551712e7d)
- So, `Hello.exe` can be run only on Windows operating system.
- To run it on Linux, we would have to recompile `Hello.c` program on Linux.
- Similarly, the `Hello` executable generated on Linux cannot be executed on a Windows machine.
- You would have to recompile on Windows.
- ![platform-dependency-2](https://github.com/user-attachments/assets/01591849-1731-4fac-a7e9-9d0f00e7f27d)
- So, the generated executable is specific to the operating system.
- So, platform dependency has to do with operating system and one main reason is due to the format of the executable file generated.
- Windows uses a format called "PE" which stands for "Portable Executable", while Linux uses a format called "ELF" which stands for "Executable and Linkable Format".
- In case you are interested about these formats, you can read more about them on Google.
- Just search for portable executable or ELF, and you can read more about them.
- Another reason for dependency on operating system is when the program makes system calls.
- System calls are useful for performing operations like file opening, directory creation, or even printing to console or the terminal.
- System calls are routed to the operating systems kernal.
- Platform dependency can also be due to hardware.
- For instance, machine code generated for a program on an x86 processor would be different from the machine code generated for the same program on an ARM processor.
- So, the machine on which an executable is executed should be similar to the machine on which it has been generated.
- Otherwise it has to be recompiled using an appropriate compiler.
- So, both operating system, as well as hardware play a part in platform dependency.
- Next, we will see how an interpreter can help resolve the platform dependency issue.

### Interpreter

- We have seen how software developed using compiled languages like C is not platform independent.
- Now let's look at interpreters, which address the platform dependency issue but, have some other limitations.
- It is an interesting lesson because many engineers do not understand how interpreters work.
- So, let's go ahead and get a good high-level understanding of how interpreters work.
- ![interpreter-1](https://github.com/user-attachments/assets/531a59bd-bee4-478a-980d-09fd31af056e)
- We know that in a compiled language, machine code is first generated by the compiler and the generated code is in separately executed by the CPU.
- ![interpreter-2](https://github.com/user-attachments/assets/89df947a-ccfd-4c62-b2ed-c4f7ab15212f)
- An interpreted language works differently.
- In an interpreted language, we have an interpreter, which is a program that directly executes the source code.
- ![interpreter-3](https://github.com/user-attachments/assets/3b4ff9a7-0452-48d8-aff1-c9cbb00333a8)
- That is, there is no separate compilation and execution step like in the case of a compiled language.
- As you can see in the diagram above, input to the interpreter is the source code and output is the result of execution of that source code.
- So, you can see the similarity between an interpreter and CPU.
- ![interpreter-4](https://github.com/user-attachments/assets/65ebf3b2-164e-4a21-95e2-46fabd271054)
- A CPU turns machine code into results while an interpreter turns source code into results.
- So, machine code serves as the instruction set for the CPU, while source code serves as the instruction set for the interpreter.
- Just note that interpreter is also a program and it needs to be run.
- So, CPU executes the interpreter and interpreter in-turn executes the source code.
- So, interpreter is nothing but a virtual machine that simulates a CPU.
- Just the way, a CPU executes machine language instructions using the <ins>fetch-and-execute cycle</ins>, an interpreter also executes instructions in the source code in a similar fetch-and-execute cycle.
- Let's now look at how a computer's fetch-and-execute cycle works.

#### CPU's Fetch-and-Execute Cycle

- ![fetch-and-execute-1](https://github.com/user-attachments/assets/232dd84b-f3cb-4553-a831-499cc739ce09)
- Fetch-and-execute cycle is the most fundamental operation of a computer and every programmer MUST know it.
- In case you are not familiar with it, this brief discussion should be helpful.
- Here we have a CPU, Memory, and a Hard Disk with the program to be executed.
- ![fetch-and-execute-2](https://github.com/user-attachments/assets/90b48d02-fce0-4855-9696-e29bfebe0b82)
- When the program is executed or started, the program first gets loaded into memory.
- We know that a program is a machine code and is basically a sequence of instructions where each instruction is simply a sequence of 0s and 1s.
- Next, CPU fetches an instruction from the memory and it then executes it.
- In the process it may also fetch any data needed to execute the instruction.
- ![fetch-and-execute-4](https://github.com/user-attachments/assets/2b64222e-e3c2-4c4b-a7d8-8efcecf6ebaa)
- Any data generated by the execution of the instruction will be written back to the memory.
- ![fetch-and-execute-5](https://github.com/user-attachments/assets/43d06040-8387-4d6e-b55f-0c3c63aac2fb)
- CPU then fetches the next instruction and executes it.
- So, this cycle continues until all of the instructions in the program are executed.
- That's basically the CPU's fetch-and-execute lifecycle.
- Now let's look at interpreter fetch-and-execute cycle.

#### Interpreter's Fetch-and-Execute Cycle

- Like a CPU, interpreter also fetches its instructions from the memory.
- However, in interpreter's case, the instruction is basically a statement in the source code.
- It then understands what is necessary to carry out that statement; and these two steps are also done by the compiler.
- Next step would be to execute the program statement and here is the interesting thing, interpreter maintains a library of compiled machine code and it just executes the appropriate compiled machine code that corresponds to the program statement.
- So, the interpreter is not generating machine code, it simply uses its own compiled machine code to accomplish what the source code directs.
- Let's actually look at an example.
- ![execution-step-example-1](https://github.com/user-attachments/assets/7fa768a3-0a2d-41e5-ba4e-81317910fc60)
- Here we have an add statement in the source code and the interpreter executes a corresponding compiled code from its library, which is the machine code version of this block of code that we see.
- The code is fetching the two numbers to add from the memory, then it is performing the actual addition and is finally storing the output back in the memory.
- So once again, interpreter is not generating machine code, it just uses its library of pre-compiled machine code.
- One main advantage of interpreter is platform independence.
- ![interpreter-platform-independence-1](https://github.com/user-attachments/assets/f0d86090-582e-4bd8-80ba-9cc9b37aa392)
- As you can see in the illustration above, the same source code can be executed on any of the platforms.
- Only requirement is to install an interpreter specific to the platform.
- Recall that with a compiled language, we could not achieve platform independence.
- That was because instead of source code, we were using machine code, which was platform dependent i.e. the machine code includes attributes specific to the platform on which it was generated.
- So, the target platform on which the machine code is to be executed could have different set of attributes and thus the machine code would fail to execute.
- But with an interpreted language, we are executing source code, which is identical regardless of the platform on which it is written i.e. it is platform independent.
- It is just that the interpreter on the target platform ensures that the platform independent source code is executed without any issues.
- What we mean by that is, as mentioned eariler, interpreter has library of machine code and this machine code is specific to the target platform.
- For instance, interpreter installed on Windows will have machine code instructions for that Windows machine itself.
- ![interpreter-platform-independence-2](https://github.com/user-attachments/assets/36aacbb8-a05b-4c0f-a616-91626d51dc46)
- So, it simply executes those instructions corresponding to the statements in source code and hence, there wouldn't be any issues.
- Also note that a statement in a programming language like Java would be a single line of code that ends in a semicolon e.g. `i = i + 1;`

#### Pros & Cons of Interpreter

##### Pros

- One advantage of an interpreter includes platform independence, as we have just seen.
- Next, there is no compilation step i.e. a program execution can start immediately.
- One main advantage of not having a compilation step is that would enable easier updates.
- For example, in some of our projects, we might have have instances where we have to fix bugs in the JS code on production servers.
- JS was an interpreter language (NOTE: today it is an Just-in-Time compiled language) (here we are talking about when it used to be an interpreter language) so, we could easily make the required code changes directly on the production servers, which could save us a lot of time.
- Now, had it been a compiled language, we would have to make the changes externally, compile the code, and then deploy the compiled code onto production servers, which would consume a lot of valuable time.

##### Cons

- In terms of limitations, interpretation is orders of magnitude slower than compiled code.
- There are a couple of reasons for this.
- One is due to costly memory access operations.
- For example, this is the library code fromt he add instruction example that we saw earlier:
- ![execution-step-example-2](https://github.com/user-attachments/assets/403142b9-6fd4-4433-befe-0ac72a88d5bf)
- As you can see, there are several costly memory access operations.
- In a compiled language, it would haveen taken care of in registers, which could result in code that runs very fast, probably even a 100 times faster.
- Second reason for slowness is program has to be re-interpreted every single time it runs.
- Another limitation is that interpreter is loaded into memory along with the source code. So, you have an extra program that is getting loaded into the memory.
  - It might not be a big deal but, ti is just something we need to know.
- So, as we can see, though interpreters solve the platform independence issue, they do have other limitations like slow execution speed.
- We will next see how Java takes care of the speed issue without compromising on platform independence.

### Platform Independence in Java

- Now let's see how Java achieves platform independence but, without affecting execution speed.
- ![platform-independence-java-1](https://github.com/user-attachments/assets/702d23fa-b954-4221-a860-d04127a1ce46)
- We discussed about compilation and interpretation, which offer contrasting benefits and limitations.
- We have seen that with compilation we get fast execution speed but, without the benefit of platform independence.
- We have also seen that with interpretation, we get the benefit of platform independence but, with much slower execution speed.
- With Java, we get the best of both worlds i.e. Java uses compilation to achieve fast execution speed and it also uses interpretation to achieve platform independence.
- So, let's see how that is accomplished in Java.
- We have Java source code, which is first compiled by the Java compiler into something called Java bytecode.
- ![platform-independence-java-2](https://github.com/user-attachments/assets/8adb4ef9-d7b9-4a08-9457-cbb6116a704a)
- So, it is not the machine code that typical compilers generate, but it is an intermediate format called as the Java bytecode.
- Then the compiled Java bytecode can be interpreted on any platform that has a Java interpreter installed.
- ![platform-independence-java-3](https://github.com/user-attachments/assets/1662e908-0480-464d-bd28-b3129dd06cb0)
- Earlier, we saw that an interpreter, interprets source code directly.
- ![platform-independence-java-4](https://github.com/user-attachments/assets/6feb0366-ab80-4d6a-844a-c6dca0ba4495)
- But here in Java world, the Java interpreter is interpreting the Java bytecode rather than the source code.
- So, Java bytecode is an intermediate format generated from the source code.
- Interpreting this compiled Java bytecode as opposed to interpreting source code directly is what makes executing Java programs much faster.
- So, executing Java bytecode is much faster.
- This Java interpreter is nothing but JVM, which stands for Java Virtual Machine i.e. a virtual machine that can execute Java programs, which include the Java bytecode.
- ![platform-independence-java-5](https://github.com/user-attachments/assets/7589c12e-e635-4b08-86b4-78bebd0c3cf1)
- So, as JVM is interpreting Java bytecode, we can think of Java as an interpreted language.
- ![platform-independence-java-6](https://github.com/user-attachments/assets/3d2c8b1f-51c9-4519-854d-b6e87df336ab)
- Also, just like any interpreter, JVM is platform specific, and that helps in achieving platform independence.
- So, we learned earlier that platform-dependent interpreters help achieve platform independence.
- ![platform-independence-java-7](https://github.com/user-attachments/assets/1425556f-ca7f-4cbd-887c-a1fb4f668ce9)
- Similarly, with Java, platform dependent JVM would help achieve platform independence.
- ![platform-independence-java-8](https://github.com/user-attachments/assets/08b266a1-fa58-43f1-ad4a-08ab9fbd807c)
- It is just that JVM would interpret Java bytecode rather than source code directly. That's the main difference.
- So, Java bytecode is platform independent while JVM is platform dependent, just like source code is platform independent, whereas an interpreter is platform dependent.
- So, you can see the similarity there.
- Now, let's also look at the commands used for compilation and execution in Java.
- At the end of this lesson, we will also execute these commands on the terminal to compile and execute a Java program.
- ![platform-independence-java-9](https://github.com/user-attachments/assets/02a6d946-bcad-468d-a8d6-3e3f29e72df2)
- So, let's assume we have a Java program called `Hello.java`, which includes the source code.
- So, the extension of the file is `.java` and `Hello.java` can then be compiled to generate a file called `Hello.class`, which includes the Java bytecode.
- To compile, we use the command `javac Hello.java`
- `javac` is the Java compiler.
- Also, it does not matter whether we are compiling on Windows or Linux, the file generated would be `Hello.class`.
- `Hello.class` can then be executed on any platform that has a JVM installed.
- To execute the class file, we use the command `java Hello`.
- Here `java` is the Java interpreter and it is the same command regardless of the platform.
- This command, `java Hello`, creates an instance of JVM.
- So, JVM is just a software and it creates an instance of JVM i.e. the operating system loads the JVM into memory as soon as we execute this command, and then the JVM executes `Hello.class`.
- In other words, JVM interprets the Java bytecode present in `Hello.class` and as mentioned earlier, we will soon look at it in action.
- Now coming back to execution speed, as mentioned earlier, interpreting Java bytecode is much faster than interpreting source code.
- That's because Java bytecode is compact in comparison to source code and is designed specifically to be interpreted by JVM, while the source code is designed to be read and written by humans i.e. developers.
- Moreover, it is already compiled, which means that things like syntax checking, which happens when interpreting source code is already done.
- So, that save us time.
- Also, the Java bytecode is up to a certain extent optimized with certain operations, which would make it run faster.
- Next, to further speed up execution, JVM also performs additional optimization through a process called just-in-time compilation, which will be discussed in one of the subsequent lessons.
- But this particular optimization will be done at execution time by the JVM so, it is not done by the compiler and it plays a very critical role in making Java programs run faster.
- Finally, note that the Java bytecode's compact form also enables in quick transfer of bytecodes across networks.
- Recall that Java was originally designed to work in a networked environment where transferring compiled Java programs, which are nothing but the Java bytecode across different devices was one of the goals.
- So, that's about it.
- We have now seen how Java bytecode and JVM were used to achieve platform independence without compromising on speed.

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
