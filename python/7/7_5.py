def gei_formatted_name(first_name,last_name):
    full_name = first_name + ' '+last_name
    return full_name.title()

musician = gei_formatted_name('jimi','hendrix')

print(musician)