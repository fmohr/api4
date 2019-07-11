In the context of nodes and paths, we distinguish three classes:

* the problem-specific (domain) node label (N in the generics) is the class associated with a *node*. Having this model for nodes instead of paths is not a limitation, because N may contain all the history, effectively making the graph a tree and, hence, representing a path as well.
* the problem-specific (technical) path of nodes in the search graph
* the algorithm-specific representation of a path

The second and the third, however, can implement the same interface, because both are paths in the search graph, just with different implementations.