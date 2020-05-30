#函数open(参数：要打开的文件名)

#关键词with 不需要访问文件后可将其关闭

#方法read() 读文件全部内容
file_path = 'G:/kaoyan/code/Demo/python/9/pi_digits.txt'
with open(file_path) as file_object:
    for line in file_object:
        print(line)
    #contents = file_object.read()
    #print(contents.rstrip())
    