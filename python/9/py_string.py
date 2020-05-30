file_path = 'G:/kaoyan/code/Demo/python/9/pi_digits.txt'
with open(file_path) as file_object:
    lines = file_object.readline()

pi_string = ''
for line in lines:
    pi_string += line.rstrip()

print(pi_string)
print(len(pi_string))