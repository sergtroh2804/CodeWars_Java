package Kata_6kyu;

import java.awt.Point;
/*
Construct a Graph

Task

Given a list of points, construct a graph that includes all of those points and the position (0, 0).

Points will be java.awt.Point like so: new Point(1, -1).

A graph should be represented as a 2d array.
Example:

Input:
ConstructAGraph.build(new Point[] {new Point(2, 2), new Point(-2, -2)})

Output:
[
  [' ', ' ', '|', ' ', '*'],
  [' ', ' ', '|', ' ', ' '],
  ['-', '-', '+', '-', '-'],
  [' ', ' ', '|', ' ', ' '],
  ['*', ' ', '|', ' ', ' '],
]

Points on the graph are represented as '*', and the position (0, 0) is represented by a '+'.

All positions along the x axis should be '-', and all postions along the y axis should be '|'.
The rest of the positions should be spaces: ' '.

Also, if a point is on the x or y axis, the default char should be replaced with the point char: '*'.
Example:

Input:
ConstructAGraph.build(new Point[]{ new Point(0, 0), new Point(1, 4)});

Output:
[
  ['|', '*']
  ['|', ' '],
  ['|', ' '],
  ['|', ' '],
  ['*', '-']
]// ^
 //this is (0, 0)

Graphs should be as minimal as posible while still retaining a rectangular shape. They should be just large
enough to include all the points and the position (0, 0).

If no points are given, the graph should just include the position (0, 0). Points might have the same value sometimes.
More Examples:

Input:
ConstructAGraph.build(new Point[] {});

Output:
[['+']]

Input:
ConstructAGraph.build(new Point[] {new Point(1, 2), new Point(1, 2)});

Output:
[
  ['|', '*'],
  ['|', ' '],
  ['+', '-']
]

Input:
ConstructAGraph.build(new Point[] {new Point(0, 3)});

Output:
[
  ['*'],
  ['|'],
  ['|'],
  ['+']
]

Input:
ConstructAGraph.build(new Point[] {new Point(-2, -3), new Point(1, -3)});

Output:
[
  ['-', '-', '+', '-'],
  [' ', ' ', '|', ' '],
  [' ', ' ', '|', ' '],
  ['*', ' ', '|', '*']
]


https://www.codewars.com/kata/630649f46a30e8004b01b3a3/train/java
 */

public class Kata_6kyu_010 {
    public static char[][] build(Point[] points) {
        // Your code
        return new char[][]{{}};
    }
}
