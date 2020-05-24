#TODO在字典中存储字典

# 多个网站用户，每个网站都有自己独特的用户名，字典里用户名为键，

users = {
    'aeinstein':{
        'first':'albert',
        'last':'enstein',
        'location':'princeton',
    },

    'mcurie':{
        'first':'marie',
        'last':'curie',
        'location':'paris',
    },
}

print(['first'])

for username,user_info in users.items():
    print("\n Username:" + username)
    full_name = user_info['first'] + '\0'+ user_info['last']
    location = user_info['location']

    print("\nFull name :" + full_name.title())
    print("\tLocation: " + location.title())

