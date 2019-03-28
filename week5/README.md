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
    > red column -> minimum_unsorted_element
    > green column -> A[j]
    > yellow column -> sorted element (i)

    ![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/selection1.png)
    ![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/selection2.png)
    ![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/selection3.png)
    ![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/selection4.png)
    ![Sequenced-based queue](https://github.com/psui3905/COMP2123/blob/master/week5/selection5.png)

    - visual sorting demonstration https://visualgo.net/en/sorting

    - Inserting elements with n insert operations takes O(n) times
    - removing elements with n remove_min ops takes O(n^2)



- __**INSERTION**__ Sort


    ```python
     def insertion_sort(A):
         n <- size(A)
         mark A[0] as sorted

        for i in range(1, n) do
            x< - A[i] # 'extract' the element A[i]
            j <- i
            while j > 1 and x < A[j-1]
                A[j] <- A[j-1]
                j <-  j - 1
            insert x in position j

    ```
    - Inserting elements with n insert operations takes O(n^2) times
    - removing elements with n remove_min ops takes O(n)
