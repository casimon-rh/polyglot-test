#!/usr/local/bin/python3
def funn(n):
    c = 0
    for x in range(0, n * n * 2):
        b = n * (int(x / n) + 1)
        p = b - x
        q = x - b + n + 1
        if int(x / n) % 2 > 0:
            if q > c:
                print(q, end='')
            else:
                print(' ', end='')
        else:
            if p > c:
                print(p, end='')
            else:
                print(' ', end='')
        if (x + 1) % (n * 2) == 0:
            print('\n', end='')
            c = c + 1
if __name__ == "__main__":
    funn(5)
