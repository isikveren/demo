def make_pizza(*toppings):
    print("\nMake a pizza with the following toppings:")
    for topping in toppings:
        print('-' + topping)

make_pizza('pepperoni')
make_pizza('mushrooms', 'green peppers', 'extra cheese')