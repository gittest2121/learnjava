# Bitwise and Bit Shift Operators
* Operators that perform bitwise and bit shift operators on integral types
* Less commonly used
* Unary Operator (~) inverts the bit pattern
* Signed Left Shift Operator (<<) shifts a bit pattern to the left
* Signed Right Shift Operator (>>) shifts a bit pattern to the right
* The bit pattern is given by the left-hand operand, and the number of positions to shift by the right-hand operand.<br>
Easier representation:<br>
```
[Bit Pattern] [Operand] [Number of positions to shift]
```
* The unsigned right shift operator (>>>) shifts a zero into the leftmost position, while the leftmost position after (>>) depends on sign extension.
* *[See BitDemo example]*
