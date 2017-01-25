#by SerLonic

#create list
new_list = ['Kostya', 'Gordon', 'Mike']
new_list.insert(1, 'Neva') #add element to 1 index
new_list.append('Lina')#add elem to end list
new_list.insert(0, 'Halk')#add elem t0 begin list
i = 0
for elements in new_list: #for all elements in list
    print('Invite you: ' + new_list[i])
    i+=1
