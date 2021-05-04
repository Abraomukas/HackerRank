# Java Datatypes

Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. 
For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
- A byte is an 8-bit signed integer.
- A short is a 16-bit signed integer.
- An int is a 32-bit signed integer.
- A long is a 64-bit signed integer.

Given an input integer, you must determine which primitive data types are capable of properly storing that input.
To get you started, a portion of the solution is provided for you in the editor.

[Reference](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

### Input format

The first line contains an integer, **_T_**, denoting the number of test cases.
Each test case, **_T_**, is comprised of a single line with an integer, **n**, which can be arbitrarily large or small.

### Output format

For each input variable **n** and appropriate primitive **_dataType_**, you must determine if the given primitives are capable of storing it. 
If yes, then print:

```
n can be filled in:
* dataType
```

If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).

**_byte_ < _short_ < _int_ < _long_**

If the number cannot be stored in one of the four aforementioned primitives, print the line:

```
n can't be fitted anywhere.
```

### Sample input

```
5
-150
150000
150000000
213333333333333333333333333333333333
-100000000000000  
```

### Sample output

```
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
```

### Explanation

**-150** can be stored in a short, an int, or a long.

**213333333333333333333333333333333333** is very large and is outside of the allowable range of values for the primitive data types discussed in this problem.