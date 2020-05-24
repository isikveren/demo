alian_0 = {'x_position':0,'y_position':25,'speed':'medium'}

print("Original x-position: " + str(alian_0['x_position']))

if alian_0['speed'] == 'slow':
    x_increment = 1
elif alian_0['speed'] == 'medium':
    x_increment = 2
else:
    #这个外星人的速度一定很快
    x_increment = 3
alian_0['x_position'] += x_increment
print("New x-position: "+ str(alian_0["x_position"]))

