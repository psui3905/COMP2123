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
    Complexity analysis: either insert() and remove_min() operation done n times. Hence either Sequenced-based will implementation take O(n^2).


- __**SELECTION**__ Sort
    ```python
    def slection_sort(A):
        n <- size(A)

        for i in range(0, n) do
            unsorted_element_index <- i
            minimum_unsorted_element <- A[unsorted_element_index]

            for j in [i, n) do
                if A[j] < minimum_unsorted_element do
                    minimum_unsorted_element <- A[j]
            swap A[j] with A[unsorted_element_index]
    ```
    ![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/selection1.png)
    ![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/selection2.png)
    ![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/selection3.png)
    ![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/selection4.png)
    ![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/selection5.png)

    - Inserting elements with n insert operations takes O(n) times
    - removing elements with n remove_min ops takes O(n^2)
