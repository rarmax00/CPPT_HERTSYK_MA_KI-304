import sys

# Введення розміру квадратної матриці
rows_num = int(input("Введіть розмір квадратної матриці: "))
if rows_num <= 0:
    print("Розмір матриці повинен бути додатнім числом!")
    sys.exit(1)

# Введення символу-заповнювача
filler = input("Введіть символ-заповнювач: ")
if len(filler) == 0:
    print("Не введено символ-заповнювач")
    sys.exit(1)
elif len(filler) > 1:
    print("Забагато символів-заповнювачів")
    sys.exit(1)

# Створення зубчастого масиву
lst = []

# Перша половина: кількість символів зростає
for i in range(rows_num // 2):  # До середини не включно
    row = filler * (i + 1)
    lst.append(row)
    print(' '.join(row))

# Друга половина: кількість символів зменшується
for i in range(rows_num // 2, rows_num):
    row = filler * (rows_num - i)
    lst.append(row)
    print(' '.join(row))

