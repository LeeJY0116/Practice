files = ["indata-10.txt", "indata-11.txt"]
count1 = 0
count2 = 0

infile1 = open(files[0], "r", encoding='UTF-8')
infile2 = open(files[1], "r", encoding='UTF-8')
outfile = open("outdata-10.txt", "w")

for line in infile1.readlines():
    count1 = count1 + 1
    outfile.write(line)

outfile.write("\n")

for line in infile2.readlines():
    count2 = count2 + 1
    outfile.write(line)

infile1.close()
infile2.close()
outfile.close()

print("------------------------------------")
print(">> {} 파일에서 복사한 줄 수 : {}".format(files[0],count1))
print(">> {} 파일에서 복사한 줄 수 : {}".format(files[1],count2))
print(">> 복사한 총 줄 수 : {}".format(count1 + count2))
print("------------------------------------")