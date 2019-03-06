# Abstarat Data type (ADT)

* Lists
    - (Static)Array-based List
    - Dynamic Array-based List
    - Positional List
        - Single Linked List
        - Double Linked List
* Stack & Queue

### Pseduocode

> Pseduocode is not a specific programming language, it's a simple way of describing
> a set of **_instuctions_** that does not have to use specific syntax. It's a high-level description of a computer program or other algorithm.

Each line of pseudocode should be clear enough that someone who has not taken the course (but with programming experience) would be able to implement the algorithm as you describe it.

* Example: (More Pseduocode tail, please refer to slides Page 13 )

```Python
    def gcd(a, b)
        if b = 0 then
            return a
        else
            return gcd(b, a mod b)
```
### Summary of Static / Dynamic Array-based List
* (Static)Array-based List
    - Limitation: can represent lists up to the capacity of the array (n vs N)
        - N: size of the Array
        - n: size we need to load our list


* Dynamic Array-based List
    - The size of the array changes dynamically throughout execution
    - The original idea how Java ArrayList class and Python list type are implemented

### Time / Space Complexity of different Lists' basic methods

* Time Complexity

| ADT                      | set(i,e) | get(i)   | add(i, e)| remove(i)|
| ------------------------ |:--------:| :-------:| :-------:| --------:|
| Array-based List         | O(1)     | O(1)     | O(n)     | O(n)     |
| Dynamic Array-based List | O(1)     | O(1)     | O(n)     | O(n)     |

| ADT                      | first()  | insertFirst(e)| removeFirst()| add(i,e) | remove(i)|
| ------------------------ |:--------:| :------------:| :-----------:| :-------:| --------:|
| Single Linked List       | O(1)     | O(1)          | O(1)         | O(n)     | O(n)     |

| ADT                      | first()  | last()  | before(p)  | after(p)  | insertBefore(p,e)  | insertAfter(p,e)  | remove(p)  |
| ------------------------ |:--------:| :------:| :---------:| :--------:| :-----------------:| :----------------:| ----------:|
| Double Linked List       | O(1)     | O(1)    | O(1)       | O(1)      | O(1)               | O(1)              | O(1)       |

Notes: p -- the input node, e -- input element, i -- index


### Queue & Double-ended queue

* Queue implementation based on Array
    - Enqueue
    ```Python
        def enqueue(element)
            if size() = N - 1 then
                return "queue full"
            else
                last <- (first + size) mod N
                Q[last] <- element
                size <- size +1
    ```

    - Dequeue
    ```Python
        def dequeue()
            if isEmpty() then
                return "queue empty"
            else
                element <- Q[first]
                first <- (first +1) mod N
                size <- size - 1
                return element

    ```
* Double-ended Queue
    - A linear structure that allows insertions and deletions at both ends
    - More detail see slides Page 33
