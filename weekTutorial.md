# Computation Efficiency
The major focus of week 1 is the part of design principle in algorithm design 
 - **(Asymptotic growth notation)**
 - Time complexity (e.g. linear vs quadratic)
 - Reading and writing pseudocode

# Worst-Case Running time
In general, we will think about the worst-case analysis of an algorithm's running time.

- we will look for a bound on the largest possible running time of algorithm could have over all input size N

So, how should we turn the fuzzy notion of an "efficient" algoritm into something more concrete?

# Polynomial Time as a Definition of Efficiency

> An algorithm is efficient if it has a polynormial running time

- Definition of a polynomial running time algorithm (see lecture slides page 6)
    -  On an input instance of size n, its running time is bounded by **_cN^d_** primitive computational steps.
    - In any case, if this running-time bound holds, for some c and d, then we say that the algorithm has a polynomial running time -- **_[Algorithm Design - John Kleinberg]_**
    > There are absolute constants c > 0 and d > 0

    > n - the natural size of the input parameter
    

# Asymptotic growth notation :star:
### Asymptotic Upper Bound (The Worst running time) 
> T(n) = O(f (n)) if there exist constants c > 0 and n0 ≥ 0 so that for all n ≥ n0, we have T(n) ≤ c · f (n). 
> - For sufficiently large n, the function T(n) is bounded above by a constant multiple of f(n)
   - Demo 
### Asymptotic Lower Bound (The Best running time)
> T(n) = omega(f (n))) if there exist constants c >0 and n0 ≥ 0 so that for all n ≥ n0, we have T(n) ≥ c · f (n). 
> - c must be fixed,independent of n
> - For arbitrarily large input sizes n, the function T(n) is at least a constant multiple of some specific function f (n).
### Asymptotic Tight Bound 
> We say that T(n) = theta(f(n)) if T(n) = O(f(n)) and T(n) = omega(f(n))
> - If we can show that a running time T(n) is both O(f (n)) and also omega(f (n)), then T(n) grows exactly like f (n) to within a constant factor.
* Sometimes one can also obtain an asymptotically tight bound directly by computing a limit as n goes to infinity. Essentially, if the ratio of functions f (n) and g(n) converges to a positive constant as n goes to infinity, then f (n) = theta(g(n)).
    - demo 
## Growth Property
Transitivity:
- If f = O(g) and g = O(h) then f = O(h) 
- If f = omega(g) and g = omega(h) then f = omega(h) 
- If f = theta(g) and g = theta(h) then f = theta(h)

Sums of functions:
- If f = O(g) and g = O(h) then f+g = O(h) 
- If f = omega(h) then f+g = omega(h)

## Pseudocode Formating
There's no fixed format for pseudocode , it is a guideline only.

Each line of pseudocode should be clear enough that someone who has not taken the course (but with programming experience) would be able to implement the algorithm as you describe it.

```pseudocode
Example:

Algorithm 2 subsequence_WithMaxSum_1(A)
1: n <- Size of A
2: answer <- (0, 0)
3: for i = 0,...., n - 1 do
4:    for j = i,...., n - 1 do
5:       if evaluate(A,i,j) > evaluate(A,answer[0],answer[1]) then
6:         answer <- (i, j)
7: return answer

```
## Lecture Question

Motivation:
- we have information about the daily fluctuation of a stock price
- we want to evaluate our best possible single-trade outcome

Input:
- an array with n integer values A[0],A[1], ...,A[n − 1]

Task:
- find indices 0 <= i <= j < n maximizing
A[i] + A[i + 1] + · · · + A[j]

#### Naive approach :pear:
```python
def naive(A):
  def evaluate(a,b)
     return A[a] + ... + A[b]

  n <- size of A
  answer <- (0,0)
  for i = 0,..., n-1 do
    for j = i,..., n-1 do
      if evaluate(i,j) > evaluate(answer[0],answer[1])
         answer <- (i,j)
  return answer
```
#### Pre-processing :squirrel: :mortar_board:

```python
def preprocessing(A):
  def evaluate(a,b)
      return B[a] - B[b+1]

  n <- size of A
  B <- array of size n+1
  for i = 0,..., n-1 do
     B[i] <- A[i] + ... A[n-1]  # (O(N))
  B[n] <- 0
  answer <- (0,0)
  
  for i = 0,..., n-1 do
    for j = i,..., n-1 do
      if evaluate(i,j) > evaluate(answer[0],answer[1])
         answer <- (i,j)
  return answer
```
