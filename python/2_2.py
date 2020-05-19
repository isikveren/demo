motorcycles = []

motorcycles.append('yamaha')        #append() 列表添加元素
motorcycles.append('honda')
motorcycles.append('ducati')

motorcycles.insert(1,'suzuki')     #insert 插入元素

# del motorcycles[2]              #删除列表元素
print(motorcycles)

poped_motorcycle = motorcycles.pop(2)   #弹出指定位置的元素

print(poped_motorcycle)
print(motorcycles)

motorcycles.remove('ducati')
print(motorcycles)


