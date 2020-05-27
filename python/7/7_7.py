def get_formatted_name(first_name,last_name):
    full_name = first_name + ' '+last_name
    return full_name.title()

musician = get_formatted_name('jimi','hendrix')

print(musician)

while True:
    print("\nPlease tell me your name:")
    print("(enter 'q' at anytime to quit)")

    f_name = input("First name:")
    if(f_name == 'q'):
        break
    l_name = input("Last name:")
    if(l_name == 'q'):
        break
    name = get_formatted_name(f_name,l_name)
    print("\nHello " + name + '!')