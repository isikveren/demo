responses = {}
#设置一个标志，指出调查是否继续

polling_active = True

while polling_active:
    #提示输入被调查者的名字和回答
    name = input("\nWhat's your name?")
    response = input("Which montain would you like to climb someday? ")

    #将答卷存储在字典中
    responses[name] = response
    #看是否有人要参与调查
    repeat = input("Would you like to let another person respong?(yes/no)")
    if repeat == 'no':
        polling_active = False    

#调查结束，显示结果

print("\n--- Poll Result ---")

for name,response in responses.items():
    print(name + " want to climb "+ response +'.\n')
