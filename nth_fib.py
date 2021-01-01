# Program to find the Nth Fibonacci number.
# Example: If n=6 then the fibonacci number is 5.
# This program is done using loops, recursive solution seems needlessly complicated.


def nthfib(n):
    if n == 1:
        print(f"The {n}st Fibonacci number is 0")
    elif n == 2:
        print(f"The {n}nd Fibonacci number is 1")
    else:
        a = 0
        b = 1
        c = 1
        counter = 2
        while counter < n:
            a = b
            b = c
            c = a + b
            counter += 1
        print(f"The {n}th Fibonacci number is {c}")


n = int(input("Enter the value of n \n"))
nthfib(n)
