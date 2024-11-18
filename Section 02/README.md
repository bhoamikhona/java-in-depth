# Section 02: Java - A High Level Overview

## Table of Content

- [Section 02: Java - A High Level Overview](#section-02-java---a-high-level-overview)
  - [Table of Content](#table-of-content)
  - [Agenda](#agenda)
  - [Lessons Learned](#lessons-learned)
    - [What is Java and Who is Using it?](#what-is-java-and-who-is-using-it)
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

## Author

- [@bhoamikhona](https://github.com/bhoamikhona)
