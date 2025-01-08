# computers/derived.py

from .base import Computer

class Laptop(Computer):
    """
    Похідний клас, що описує ноутбук.
    """
    def __init__(self, brand, processor, ram, battery_life):
        """
        Ініціалізація параметрів ноутбука.

        :param brand: Бренд ноутбука (рядок)
        :param processor: Модель процесора (рядок)
        :param ram: Кількість оперативної пам'яті в ГБ (ціле число)
        :param battery_life: Час роботи батареї в годинах (ціле число)
        """
        super().__init__(brand, processor, ram)
        self.battery_life = battery_life

    def display_info(self):
        """
        Виводить інформацію про ноутбук, включаючи дані про батарею.
        """
        base_info = super().display_info()
        return f"{base_info}, Час роботи батареї: {self.battery_life} годин"

