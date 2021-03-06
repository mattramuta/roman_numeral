Roman numerals are a numeral system that originated in ancient Rome and remained the usual way of writing numbers throughout Europe well into the Late Middle Ages. Numbers in this system are represented by combinations of letters from the Latin alphabet. 

Lets create a method using TDD that takes an int and returns the roman numeral string, where the int is in the range of [1, 3999].

We can refer to https://en.wikipedia.org/wiki/Roman_numerals for the rules to convert

Symbol  Value
   I     1
   V     5
   X     10
   L     50
   C     100
   D     500
   M     1000
   

  1000's 100's 10's 1's
1   M    C     X    I
2   MM   CC    XX   II
3   MMM  CCC   XXX  III
4        CD    XL   IV
5        D     L    V
6        DC    LX   VI
7        DCC   LXX  VII
8        DCCC  LXXX VIII
9        CM    XC   IX
   

The numerals for 4 (IV) and 9 (IX) are written using "subtractive notation", where the first symbol (I) is subtracted from the larger one (V, or X), thus avoiding the clumsier (IIII, and VIIII). Subtractive notation is also used for 40 (XL) and 90 (XC), as well as 400 (CD) and 900 (CM). These are the only subtractive forms in standard use.



