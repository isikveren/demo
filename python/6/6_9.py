prompt = "\nTell me somthing, and I will repeat it it to you:"

prompt += "\nEnter 'quit' to end the program."
message = int(input(prompt))
while message <=100:

    message += 1
    if message % 2 == 0:
        continue
    print(message)
    print('\t')