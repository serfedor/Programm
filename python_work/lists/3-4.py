#by SerLonic

#create new empty list
new_list = []
#invite element in list
new_list.append('Valentina')
new_list.append('Denis')
new_list.append('Kostya')
new_list.append('Arkadiy')

print(new_list)
i = 0
#while for all elements in list
for element in new_list:
    print('Dear ' + new_list[i] + ' I invite you.')
    i+=1
