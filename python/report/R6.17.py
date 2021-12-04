temp = []
i = 0
while i < len(values) :
    temp.insert(0,(values[0]))
    values.pop(0)
    values.append(temp[0])
    print(values)