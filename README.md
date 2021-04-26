# Java Stdin and Stdout I

Most HackerRank challenges require you to read input from _stdin_ (standard input) and write output to _stdout_ (standard output).

One popular way to read input from stdin is by using the _Scanner class_ and specifying the Input Stream as System.in.
For example:


```
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
```

The code above creates a Scanner object named **scanner** and uses it to read a String and an int.
It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String).
So, if our input is:


```
Hi 5
```

Our code will print

```
myString is: Hi
myInt is: 5
```

Alternatively, you can use the _BufferedReader class_.

### Task 

In this challenge, you must read **3** integers from stdin and then print them to stdout. 
Each integer must be printed on a new line.

### Input format

There are **3** lines of input, and each line contains a single integer.

### Sample input

```
42
100
125
```

### Sample output

```
42
100
125
```
