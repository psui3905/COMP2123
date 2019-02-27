# Computation Efficiency
The major focus of week 1 is the part of design principle in algorithm design 
 - **(Asymptotic growth notional)**
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
> T(n) = omega(f (n))) if there exist constants c >0 and n0 ≥ 0 so that for all n ≥ n0, we have T(n) ≥ c · f (n). 
> - c must be fixed,independent of n
> - For arbitrarily large input sizes n, the function T(n) is at least a constant multiple of some specific function f (n).
### Asymptotic Tight Bound 
> We say that T(n) = theta(f(n)) if T(n) = O(f(n)) and T(n) = theta(f(n))
> - If we can show that a running time T(n) is both O(f (n)) and also (f (n)), then T(n) grows exactly like f (n) to within a constant factor.
* Sometimes one can also obtain an asymptotically tight bound directly by computing a limit as n goes to infinity. Essentially, if the ratio of functions f (n) and g(n) converges to a positive constant as n goes to infinity, then f (n) = theta(g(n)).
    - demo 
## Growth Property
Transitivity:
- If f = O(g) and g = O(h) then f = O(h) 
- If f = omega(g) and g = omega(h) then f = omega(h) 
- If f = theta(g) and g = theta(h) then f = theta(h)

Sums of functions:
- If f = O(g) and g = O(h) then f+g = O(h) 
- If f = omega(h) then f+g = omega(h)