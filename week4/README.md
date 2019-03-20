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

    transcript.put("Jimmy", 80);
    transcript.put("Ken", 100);
    ```
    Recommand ADT to try play around with: HashMap<k,v>, extra methods of SortedMap ADT

    ```java
    Map<String, Integer> transcript = new HashMap<String, Integer>();
    ```


### Binary Search Trees (BST)

A BST is a Binary tree storing keys (or key-value pairs) satisfying BST property.

![tree terminology](https://github.com/psui3905/COMP2123/blob/master/week4/BST.gif)

> For any node V in the tree and any node u in the left subtree of v and any node w in the right sybtree of v. **__key(u) < key(v) < key(w)__**

![tree terminology](https://github.com/psui3905/COMP2123/blob/master/week4/BST2.png)
