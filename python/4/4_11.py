available_toppings = ['mushroom','olives','green pappers',
                     'pepperoni','pineapple','extra cheese']

resquested_toppings = ['mushroom','french fries','extra cheese']

for resquested_topping in resquested_toppings:
    if resquested_topping in available_toppings:
        print("Adding "+ resquested_topping + '.')
    else:
        print("Sorry ,we don't have "+ resquested_topping +'.')

print("\nFinishing making your pizza!")