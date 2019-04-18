## Week 3 Greedy algorithms

> A greedy algorithms is an algorithm that follows the problem solving approach of making a locally optimal choice at each stage with the hope of finding a global optimum

__Common Probelms can be solved using agreedy approach__:

- Interval sheduling/partitioning
- Scheduling to minimize lateness
- **Shortest path**
- **Minimun spanning trees**



__How to design greedy algorithm:__

Step1: Understand problem

Step2: Start with simple algorithm

Step3: Test it correctness:

- Try some simple examples to get feel for algorithm
- If none of them break algorithm, see if there's underlying structural property we can use to prove correctness

Step4: Better understanding algorithm, and improve



#### Shortest path

> Problems: Given an edge weighted graph and two vertices $u$ and $v$, we want to find a path of minimum total weight between $u$ and $v$, where the weight of a path is the sum of the weights of its edges.

> **Applications:** Internet packet routing, flight reservations and driving directions

```pseudocode
Property: 
1. A subpath of a shortest path is itself a shortest path
2. There is a tree of shortest paths from a start vertex to all the 							 other vertices (shortest path tree)
```

![Screenshot 2019-04-17 17.03.40](/Users/pengweisui/Dropbox/屏幕截图/Screenshot 2019-04-17 17.03.40.png)

#### [Dijkstra](<https://en.wikipedia.org/wiki/Edsger_W._Dijkstra>)'s Algorithm 🧐

Maintain a set of explored nodes $S$ for which we have determined the shortest path distance $D(u) $from $s$ to $u$. ($s​$ is the starting vertex)

* Input: 
  * Graph __$G = (V, E)$__
  * Edges with non-negative weights
  * Start vertex $s$
* Output:
  * Distance from $s$ to all $v \in V$
  * Shortest path tree rooted at $s​$

* Initialize $S​$ = $\{s\}​$, D(s) = 0, D[$v​$] = infinite for all $v​$ (vertices) in $V - s​$

* Repeatedly choose unexplored node $v​$ which minimizes:

  > $D(v)$ = min{D[u] + $l_e$ }, for each $u \in S​$, 

  * $l_e$ is a single edge (neighbor edge) connected between $v$ and $u$ 

  * $v$ can be any vertices not explored before (not in $S$)

    

**Pseudocode**

```python
def Dijkstra(G = (V, E), w, s):
  # initialize algorithm
  D = [] # shortest Distance list from s to other vertices
  for v in V do
  	D[v] = sys.maxint #set D[v] to infinity
  D[s] = 0
  Q <- new priority queue for { (v, D[v]) : v in V}
  
  #iteratively add vertices to S
  while Q is not empty do
  	u <- Q.remove_min()
    	for z in G,neighbors(u) do
      	if (D[u] + w[u,z]) < D[z] then
        	D[z] <- D[u] + w[u, z]
          Q.update_priority(z, D[z])
          parent[z] <- u
  return D, parent
```

**Time Complexity**

Assume the graph is connected: $m >= n-1$ , the algorithm spends $O(m)$ time on everything except PQ operations 

* Priority queue opreation counts:
  * Insert: n
  * Decrease_key: m
  * remove_min: n
* Using normal heap $PQ$, Disjkstar runs in $O(m*logn)$ time
  * Using Fibonacci heaps, instead we get $O(m + nlogn)



### Minimum Spanning Tree

![Screenshot 2019-04-18 13.41.55](/Users/pengweisui/Desktop/COMP3027/Notes/week3/Screenshot 2019-04-18 13.41.55.png)

**MST Properties**

Assumption: All edge costs $c_e$ are distinct

* __Cut properties__: Let $S$ be any subset of nodes, and let $e$ be the min cost edge with exactly one endpoint in S. Then the MST contains $e$
* __Cycle Property__: Let C be any cycle, and let f be the max cost edge belonging to C. Then the MST does not contain f.

![Screenshot 2019-04-18 13.48.32](/Users/pengweisui/Desktop/COMP3027/Notes/week3/Screenshot 2019-04-18 13.48.32.png)

#### Terminology

Cutset — **A Cut in a subset of nodes in S**. The corresponding __cutset D__ is the subset of edges with exatly one endpoint in S.



### Find the **Minimum Spanning Tree** (MST):

> Prim's Algorithm

> Cut property — Let $S$ be any subset of nodes, and let $e$ be the min cost edge with exactly one endpoint in $S$. Then the MST contains $e ​$

```python
def prim(G = (V, E), c):
  u <- arbitrary vertex in V
  S <- { u } #let vertex u to be our strating vertex
  T <- NULL # That's our initlization of MST
  
  while len(S) < len(V) do
  	# u in S and v not in S
		(u, v) <- min cost edge with exactly one endpoint in S 
    add (u, v) to T
    add v to S
  return T
```

#### Time Complexity

Using heap implementation: $O(m logn)$

Using Fibonacci heap: O(m + nlogn)