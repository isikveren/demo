#创建一个表示汽车的类，存储有关汽车的信息，还有一个总汇这些信息的方法-get_descriptive_name

class Car():
    #一次模拟汽车的简单尝试

    def __init__(self,make,model,year):
        #初始化描述汽车的属性
        self.make = make
        self.model = model
        self.year = year
    def get_discriptive_name(self):
        #返回整洁的描述信息
        long_name = str(self.year) + ' '+self.make + ' '+self.model
        return long_name.title()

#创建实例
my_new_car = Car('audi','a4',2016)
print(my_new_car.get_discriptive_name())