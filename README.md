# Java Date and Time

The Calendar class is an abstract class that provides methods for converting between a specific instant 
in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating 
the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, **getDay**, which returns the day on that date.

### Example

**month = 8**

**day = 14**

**year = 2017**

The method should return **MONDAY** as the day on that date.

### Function description

findDay has the following parameters:
- int: month
- int day
- int: year

### Returns

- string: the day of the week in capital letters

### Input format

A single line of input containing the space separated month, day and year, respectively, in **MM DD YYYY** format.

### Constrains

- **2000 < year < 3000**

### Sample input

```
08 05 2015
```
### Sample output

```
WEDNESDAY
```
### Explanation

The day on August **5**th **2015** was WEDNESDAY.