# Raindrops - Java
*By Golam Choudhury*

## Project Brief/Description
Create a method, named plingPlangPlong, that returns a specific String depending on the integer that is passed to it. 
More precisely, it depends on the factors of the integer. The three factors this method is concerned
with are 3, 5 & 7. The method initialises a StringBuilder which starts off with an empty String.

### Rules & Constraints
- A user passes an integer, n
- If 3 is a factor of n, the string builder will append "Pling"
- If 5 is a factor of n, the string builder will append "Plang"
- If 7 is a factor of n, the string builder will append "Plong"
- If neither 3, 5 or 7 are factors of n, the method will return n (as a String)

Examples inputs and outputs:

| **n** | **Multiple of 3** | **Multiple of 5** | **Multiple of 7** | **Output**      |
|-------|-------------------|-------------------|-------------------|-----------------|
|   0   |         ❌         |         ❌         |         ❌         |        0        |
|   3   |         ✔️         |         ❌         |         ❌         |      Pling      |
|   20  |         ❌         |         ✔️         |         ❌         |      Plang      |
|   14  |         ❌         |         ❌         |         ✔️         |      Plong      |
|  -30  |         ✔️         |         ✔️         |         ❌         |    PlingPlang   |
|   21  |         ✔️         |         ❌         |         ✔️         |    PlingPlong   |
|   35  |         ❌         |         ✔️         |         ✔️         |    PlangPlong   |
|  -210 |         ✔️         |         ✔️         |         ✔️         | PlingPlangPlong |
|   19  |         ❌         |         ❌         |         ❌         |        19       |
|   97  |         ❌         |         ❌         |         ❌         |        97       |

Examples in code:
```java
Raindrops raindrops = new Raindrops();

raindrops.plingPlangPlong(0); // returns "0"
        
raindrops.plingPlangPlong(5); // returns "Plang"

raindrops.plingPlangPlong(210); // returns "PlingPlangPlong"

raindrops.plingPlangPlong(-35); // returns "PlangPlong"
```

## Testing
This mini-project will employ a Test Driven Development (TDD) approach. This means that before development begins, a 
number of test cases are defined. Naturally, as there is no development code, all tests will fail, it is the role of the 
developer to write code in order to make the tests pass. 

Such an approach clearly defines the desired behaviour of the program at the start of the project. This leaves no room
for development of the code to stray from the initial requirements. 

The test cases will cover a range of potential inputs, including positive integers, negative integers and zero. 