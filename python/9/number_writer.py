import json


filename = 'numbers.json'
with open(filename) as file_object:
    number = json.load(file_object)

print(number)