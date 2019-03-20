## Week4 Binary Search Trees
### Contents 
* Sorted Map ADT
* **__Binary Search Trees (BST) & Implementation__**
    * Performance of each operation
* Trinode Restructuring 
* **__AVL Tree__**
    * Performance


### Sorted Map ADT

Map is an abstract data type where a value is "mapped" to the collection.
- Need a key and a value to insert new mapping items
- Only need key to find mappings and remove mappings

![tree terminology](https://github.com/psui3905/COMP2123/blob/master/week4/map1.png)

> Notice: In java, Map<k,v> and SortedMap<k,v> are __Interface__. You need a concrete class to implement if you want to use Map<k,v> or Sortedmap<k,v>.
- TreeMap initialization example in java:

    ```java
    Map<String, Integer> transcript = new Treemap<String, Integer>();
    ```



