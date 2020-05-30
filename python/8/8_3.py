#oddometer_reading,属性，初始值为0
#read_odometer(),方法

#创建一个表示汽车的类，存储有关汽车的信息，还有一个总汇这种信息的方法-get_descriptive_name
class Car():
    #一次模拟汽车的简单尝试

    def __init__(self,make,model,year):
        #初始化描述汽车的属性
        self.make = make
        self.model = model
        self.year = year
        self.odometer_reading = 0
    def get_discriptive_name(self):
        #返回整洁的描述信息
        long_name = str(self.year) + ' '+self.make + ' '+self.model
        return long_name.title()
    
    def read_odometer(self):
        #打印一条指出汽车里程的消息
        print("This car has "+str(self.odometer_reading)+" miles on it.")

    def updated_odometer(self,mileage):
        #将里程表读数设为指定的值
        if mileage >=self.odometer_reading:
            self.odometer_reading = mileage
        else:
            print("You can't roll back an odometer!")

    def increment_odometer(self,miles):
        #将里程表读数增加指定的量
        self.odometer_reading +=miles


class ElectricCar(Car):
    #电动汽车独特之处
    def __init__(self,make,model,year):
        #初始化父类的属性
        super().__init__(make,model,year)

my_tesla = ElectricCar('tesla','model s',2016)
print(my_tesla.get_discriptive_name())   #TODO有点问题


