intone = float(input("정수를 입력하세요."))
inttwo = float(input("정수를 입력하세요."))



sumint = intone + inttwo
difint = intone - inttwo
proint = intone * inttwo 
avgint = (intone + inttwo) / 2
disint = intone - inttwo
maxint = max(intone, inttwo)
minint = min(intone, inttwo)

print("Sum : %12d" % sumint)
print("Difference : %5d" % difint)
print("Product : %9d" % proint)
print("Average : %8d" % avgint)
print("Maximum : %8d" % maxint)
print("Minimum : %8d" % minint)