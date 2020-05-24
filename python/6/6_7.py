prompt = "\nTell me somthing, and I will repeat it it to you:"

prompt += "\nEnter 'quit' to end the program."
active = True
while active:
    message = input(prompt)

    if message == 'quit':
        active = False
