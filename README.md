# Java If-Else

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.

### Task

Given an integer, **n**, perform the following conditional actions:
- If **n** is odd, print _Weird_
- If **n** is even and in the inclusive range of **2** to **5**, print _Not Weird_
- If **n** is even and in the inclusive range of **6** to **20**, print _Weird_
- If **n** is even and greater than **20**, print _Not Weird_

Complete the stub code provided in your editor to print whether or not **n** is weird.

### Input format

A single line containing a positive integer, **n**.

### Constrains

- 1 <= n <= 100

### Output Format

Print _Weird_ if the number is weird; otherwise, print _Not Weird_.

### Sample input 0

```
3
```

### Sample output 0

```
Weird
```

### Sample input 1

```
24
```

### Sample output 1

```
Not weird
```

### Explanation

Sample Case 0: **n = 3**
**n** is odd and odd numbers are weird, so we print _Weird_.

Sample Case 0: **n = 24**
**n** > **20** and **n** is even, so it isn't weird. Thus, we print _Not Weird_.