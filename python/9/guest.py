
file_path = 'guest.txt'

while True:
    user_1 = input("Please enter you name.")
    print("Hi!"+ user_1+", welcome!\n")
    reason = input("Why do you like programing?")
    with open(file_path,'a') as file_object:
        file_object.write(user_1.title()+"'s answer is '"+reason + "'.\n")
    message = input("Keep on? (yes/on)")
    if message == 'no':
        break


    