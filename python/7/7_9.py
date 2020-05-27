#将需要打印的列表存储在一个列表中，打印后存储在另一个列表中
#不使用列表
#先创建一个列表，其中包含一些要打印的设计

unprinted_designs = ['iphone case','robot pendant','dodecahedron']
completed_models = []

#模拟打印每个设计，直到没有未打印的设计为止
#打印每个设计后，都将其移动到completed_models中

while unprinted_designs:
    current_design = unprinted_designs.pop()
    print("Print model :" + current_design)
    completed_models.append(current_design)

print(completed_models)