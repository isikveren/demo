aliens = []

for alien_number in range(30):
    new_alien = {'color':'green','points':5,'speed':'slow'}
    aliens.append(new_alien)


#显示前五个外星人

for alien in aliens[:5]:
    print(alien)
print("...")

#显示创立了多少个外星人

print("Total number of aliens: " + str(len(aliens)))