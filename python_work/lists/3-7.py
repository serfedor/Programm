#by SerLonic
new_list = [] #create list
new_list.append('Lina') #add element to list
new_list.append('Kris')
new_list.append('Logan')
new_list.append('Harrisson')
new_list.append('Jake') 

print('I invite only two person')
print('Sorry ' + new_list.pop())#remove 3 elements in end of list
print('Sorry ' + new_list.pop())
print('Sorry ' + new_list.pop())
print(new_list)#print list
del new_list[1]#delete two elements
del new_list[0]
print(new_list)#print empty list
