import os
import struct
import sys
import math


def writeResTxt(fName, result):
    """
    Запис результату у текстовий файл.
    """
    with open(fName, 'w') as f:
        f.write(str(result))


def readResTxt(fName):
    """
    Читання результату з текстового файлу.
    """
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = float(f.read())
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result


def writeResBin(fName, result):
    """
    Запис результату у двійковий файл.
    """
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))


def readResBin(fName):
    """
    Читання результату з двійкового файлу.
    """
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result


def calculate(x):
    """
    Обчислення y = ctg(x) / sin(7x - 1).
    Використовує формулу ctg(x) = cos(x) / sin(x).
    """
    try:
        if math.sin(x) == 0 or math.sin(7 * x - 1) == 0:
            raise ValueError("Undefined value: division by zero.")
        y = (math.cos(x) / math.sin(x)) / math.sin(7 * x - 1)
    except ValueError as e:
        print(e)
        y = None
    return y


if __name__ == "__main__":
    try:
        # Введення значення x
        data = float(input("Enter x: "))

        # Обчислення y
        result = calculate(data)

        if result is not None:
            print(f"Result is: {result}")

            # Запис результатів у файли
            writeResTxt("textRes.txt", result)
            writeResBin("binRes.bin", result)

            # Читання результатів з файлів
            print("Result from binary file: {0}".format(readResBin("binRes.bin")))
            print("Result from text file: {0}".format(readResTxt("textRes.txt")))
        else:
            print("Calculation failed due to invalid input.")
    except ValueError:
        print("Invalid input. Please enter a valid number.")
        sys.exit(1)
    except FileNotFoundError as e:
        print(e)
        sys.exit(1)


