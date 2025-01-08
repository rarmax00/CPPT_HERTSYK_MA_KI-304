# main.py

from computers.base import Computer
from computers.derived import Laptop

def main():
    """
    Точка входу в програму.
    """
    # Створення об'єкта базового класу Computer
    desktop = Computer(brand="Dell", processor="Intel Core i7", ram=16)
    print("Інформація про настільний комп'ютер:")
    print(desktop.display_info())

    # Створення об'єкта похідного класу Laptop
    laptop = Laptop(brand="HP", processor="AMD Ryzen 5", ram=8, battery_life=10)
    print("\nІнформація про ноутбук:")
    print(laptop.display_info())

if __name__ == "__main__":
    main()

