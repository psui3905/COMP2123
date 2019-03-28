# Week5 Priority Queues
## Content
- Understand of basic method & operations of Priority Queue
- Sorting methd:
    - __**SELECTION Sort**__
    - __**INSERTION Sort**__
- __**Heap**__ Data structure
    - Upheap
    - Downheap
    - Heap Sort

![Running time](https://github.com/psui3905/COMP2123/blob/master/week5/queue.png)
### Sequenced-based Priority Queues

![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/queue2.png)

- Priority queue sorting
    ``` python
    def priority_queue_sorting(A):
        pq <- new PriorityQueue
        n <- size(A)

        for i in [0, n) do
            pq.insert(A[i])

        for i in [0, n) do
            A[i] = pq.remove_min()
    ```
    Complexity analysis: either insert() and remove_min() operation done n times. Hence either Sequenced-based will implementation take $$O(n^2)$$
