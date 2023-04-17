## 1st Day.

 Firstoff all I'm starting with arrays in arrays it will take almost 7 to 8 days to complete the all the concepts in arrays and also **solving the problems is very important and crucial in DSA guys**
## what is mean by an array ?

- Array is a linear data sturucture and also a data type , **which is used to store the values in sequence manner is called an array**

let us consider a example, we have 100 students of data like Roll number , name and section etc..,   
- Can we store all students data in a single variable like Roll number, name or section **plzz think for some time** 
-  It is not possible to store 100 students of data in a single variable that's only we are using **Arrays to store the data in sequence manner**
-let's see one example:-
```java

int array[] = {1,2,3,4,5}; 

```
## How many ways to intialize a array in java.

- There are 2 ways to initialize an array in java

1. Static assignment.

2. Dynamic assignment.


```java
// Static assignment.

//Data_type  name_of_array followed by squarebrackets = inside flower brackets you want write what type of data you wanna store.
int array[] = {1,2,3,4,5};

```


```java

// Dynamic assignment.

//Data_type name of array followed by squarebrackets = by using new keyword followed by Data_type followed by squarebrackets.
//Note: you want to declare the size of an array inside square brackets in dynamic as well as static also . In static methods don't require the size of an array.

// In dynamic assignment when ever we are using new keyword in java then it will automatically creates a object of that type here array is also a object in java.

int array [] = new int[5];

//here 5 is the size of an array .

```

## How to access elements in an array ?
- For Static and dynamic arrays we can **access data form an array with zero indexed based**.

```java

// we have array like this.

int arr[] = {1,2,3,4,5};

System.out.println(arr[0]);
```

```
Output :- 1

```
## For Dynamic arrays how to take input form the user.

```java

//in main method

Scanner sc = new Scanner(System.in);  //scanner object is used to take the input form the user.

int arr[] = new int[5]; //here i'm considering size of an array is 5

for(int i=0;i< arr.length;i++)
{
    arr[i] = sc.nextInt();
}

//This is the way to take the values at runtime for dynamic arrays.

```

## How to access the values form an Array ?

```java
        // Accessing elements in an arrays.

        //First Method By using for loops 

        int arr[] = {1,2,3,4,5};

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       System.out.println(); 

        //second method by using for each method 

        for(int i : arr)
        {
            System.out.print(i+ " ");
        }
        System.out.println();

        //Third method using .tostring method.

        System.out.println(Arrays.toString(arr));

  ```

  ## Output :-

```

1 2 3 4 5 
1 2 3 4 5 
[1, 2, 3, 4, 5]

```

## Multidimensionl Arrays.

## How many types to initialize multidimensional arrays in java ?

```java

int array[][] = new int [n][m];

```

- here you need to consider **n = number of Rows and m = number of Columns.**

|| column 1 | column 2 | column 3 |
|-|---------|-----------|-------------|
| Row 1| arr[0][0]|arr[0][1]|arr[0][2]|
| Row 2 | arr[1][0]|arr[1][1]|arr[1][2]|
| Row 3 | arr[2][0]|arr[2][1]|arr[2][3]|

- All types of **Arrays are starts with zero indexed based** plz remind, that's why only the we are **starting form the zero and ending at (length or size)-1.** 
- In the above table **arr[0][0]** means The element is present at **First Row First Column**

## How to initialize static assignment in multidimensional arrays ?

```java

int arr[3][5] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

```

- In table it may look like this 

||Column 1|Column 2|Column 3|Column 4|Column 5|
|-|-------|--------|--------|--------|--------|
|Row 1|arr[0][0]=1|arr[0][1]=2|arr[0][2]=3|arr[0][3]=4|arr[0][4]=5|
|Row 2|arr[1][0]=6|arr[1][1]=7|arr[1][2]=8|arr[1][3]=9|arr[1][4]=10|
|Row 3|arr[2][0]=11|arr[2][1]=12|arr[2][2]=13|arr[2][3]=14|arr[2][4]=15|

## How to take input form the user in multidimensional arrays?

```java
// In Main method 

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();  // where n is the the length of rows and columns 
int arr[][] = int [n][n]; // we are considering this matrix is a nXn matrix.

for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        arr[i][j] = sc.nextInt(); // taking input form the user by using scanner object , that value storing into a i,j at a particular index. 
    }
}

```


## How to access elements in multidimensional arrays ?

```java
// In main method 
int arr[2][2] = {{1,2},{3,4}}

for(int i=0;i<arr.length;i++)//This loop used to access the Rows.
{
    for(int j=0;j<arr.length;j++)//This loop used to access the columns.
    {
        System.out.print(arr[i][j]+" "); //It will print the value with respect to the every index of i,j for a given range.

        //let us consider first element in a multidimensional array starts with arr[0][0] means here first row first column is the location of arr[0][0];
    }
    System.out.println();//for new line 
}
```



## After understandig all these things plzz try simple questions.

- ## Single Dimensional Array.

1 create a array of size 8 and take values form the user and print the all values in a single line with spaces 

## Example 
- Input :- 1 2 3 4 5 6 7 8
- Output :- 1 2 3 4 5 6 7 8

2 create a array of size 8 and take values form the user and print the all values in a reverse order in a single line with spaces

## Example 
- Input :- 1 2 3 4 5 6 7 8
- Output :- 8 7 6 5 4 3 2 1

3 create a array of size 5 and take values form the user and print the sum of all values in an array.

## Example 
- Input :- 1 2 3 4 5 
- Output :- 15

- Plzz slove as much as provlems you can slove in arrays and also we discuss lot's of problems on arrays in upcoming days .

- ## Multidimensional Array.


2 create a array of size 3 by 3 matrix and take values form the user and print the all values as you given in columnwise with spaces

## Example 
- Input :- 1 2 3
           4 5 6 
           7 8 9
- Output :- 1 2 3
            4 5 6 
            7 8 9


2 create a array of size nXn matrix and take values form the user and print the sum of elements in a diagonal order ?

## Example 
- Input :- 1 2 3 
           4 5 6 
           7 8 9

- Output :- 15

- **Hint** - if (i==j) then only we can excess the diagonal elements form left to right **Means 1+5+9 in this array** otherwise we have another condition to form right to left **Means 3+5+12 in this array** plz try it yourself by using tabular terminology in above.

- Plzz slove as much as provlems you can slove in arrays and also we discuss lot's of problems on multi dimensional arrays in upcoming days .


# Level -1  Problems in Arrays.

- Find a peak element which is not smaller than its neighbors    [solution](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Programming_Files/Arrays/Level_1/peakElement.java)

- Write a program to sort the given array              [solution](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Programming_Files/Arrays/Level_1/sortingIn_ascend.java)

1. Finding the unique element in a duplicates ?    [solution](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Programming_Files/Arrays/Level_1/duplicatesRemove.java)

2. Searching a element in an array for both linear and binary search ?  [solution](https://github.com/HumbleFool830/100-Day-s-of-DSA-challenge-/blob/main/Programming_Files/Arrays/Level_1/searchingElement.java)

3. Transpose of a 2d matrix ?   [solution]()

4. sloving 2 sum problems with given sum and also solving the number of pairs that are equal to a given sum ?    [solution]

