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
## How many types to initialize multidimensional arrays in ?

```java

int array[][] = new int [n][m];

```

- here you need to consider n = number of columns and m = number of rows

|| column 1 | column 2 | column 3 |
|-|---------|-----------|-------------|
| Row 1| arr[0][0]|arr[0][1]|arr[0][2]|