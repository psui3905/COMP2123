## Week6 Hashing
- Hash Functions & Hash Tables
- Common Hash Codes
- Collision Handling
    - Separate Chaining
    - Linear Probing
    - Cuckoo Hashing
- Eviction cycles detection


### Hash Functions & Hash Tables
**Hash Function:** mapping keys of a given type to integer in a fixed interval [0, N-1]
- N: the size of implemented ADT to store the entries
    - N >> n, n, numbers of items / entries we want to store

**Requirement for h:**
> h is a mathematical function (always gives same answer for any particular x)
> h is fairly efficient to compute

**Hash Tables:** a kind of data structure for a given key type __K__ consist of:
- Hash function h: K -> [0, N-1]
- Array (called table) of size N
- Ideally, item (x,o) is stored at A[h(x)], **h(x):** hash value of x by implemeting hash function __h__

**Detail of Hash Function**:
A hash function h is usually the composition of two Functions:
- **Hash code**:
    - h1: keys -> integers
- **Compression function**:
    - h2: Compress integers -> in range [0, N-1]
> h(x) = h2(h1(x))

### Common Hash Codes
Hash function used by Java:
- The key is transformed into a 32-bit value using the developer-defined hashCode() method.
- The 32-bit value is then transformed by a second hash function
- The corresponding entry of the hash table contains a reference to a linked list or null, if the key does not yet exist in the hash table. If there are collisions (several keys with the same offset), the keys together with their values are simply collected in a singly linked list.

![Running time](https://github.com/psui3905/COMP2123/blob/master/week6/hash.png)

Hash function in Python:
- Hash function (__hash()_) are used to compare dictionary keys during a dictionary lookup quickly.

Example: hash function for string
```Python
def hash(string):
    x = string[0] << 7
    for chr in string[1:]:
        x = ((1000003 * x) ^ chr) & (1<<32)
    return x
```

### Collision Handling

Collisions occur when two or more elements are hashed to the same location in our array(map).

#### Separate Chaining (similar to java hash structure)
- Let each cell in the table point to a linked list holding the entries that map there
- Separate chaining is simple, but requires additional memory outside the table
![Running time](https://github.com/psui3905/COMP2123/blob/master/week6/hashing.png)
- **Load factor**: n/N, usually written as alpha
    - n: number of keys we want to map into our hash Table
    - The expected time for hash table operations is **O(1+alpha)** when
collisions are handled with separate chaining.
- Performance: O(n)
    - worst case: all items collode into a single chain


#### Liner probing
- __Open addressing:__ the colliding item is placed in a different cell of the table (**implemented by Python**)
-  Handles collisions by placing the colliding item in the next (circularly) available cell
- Colliding items lump together,causing future collisions to cause a longer sequence of probes

![Running time](https://github.com/psui3905/COMP2123/blob/master/week6/hashing2.png)

**DEFUNCT**: To handle insertions and deletions, we introduce a special object, called DEFUNCT, which replaces deleted elements.

Performance: O(n) for get(), put(), and remove() in the worst cause

#### Cuckoo hashing
- Cuckoo hashing achieves worst-case **O(1)** time for lookups and removals, and expected **O(1)** time for insertions.
- In practice Cuckoo hashing is __20-30%__ slower than **linear probing** but
is still often used due to its worst case guarantees on lookups and its
ability to handle removal more gracefully.

> Use two lookup, T1 and T2, each of size N
> Use two hash functions, h1 and h2, for T1 and T2 respectively
![Running time](https://github.com/psui3905/COMP2123/blob/master/week6/put.png)

Detect eviction cycles: see slides Page 44
