infile1 = open("indata-10.txt", "r", encoding='utf-8')
infile2 = open("indata-16.txt", "r", encoding='utf-8')
outfile = open("indata-16.txt", "a", encoding='utf-8')


first = True
second = True


# 첫 번째 파일의 내용 읽기
for line in infile1 :
    # 구분자 출력하기
    if first == True :
        print("2021년 2학기 파이썬 1분반 퀴즈점수", file=outfile)
        first = False
    # 공백을 기준으로 split하여 프린트하기
    fields = line.split(" ")
    studentName = fields[0]       
    scores = float(fields[1])
    print(studentName, scores, file=outfile)
infile1.close()
# 두 번째 파일의 내용 읽은 후 위와 같이 출력하기
for line in infile2 :
    if second == True :
        print("2021년 2학기 파이썬 2분반 퀴즈점수", file=outfile)
        second = False
    fields = line.split(" ")
    studentName = fields[0]       
    scores = float(fields[1])
    print(studentName, scores, file=outfile)

# 2번째 파일의 내용 + 1번째 파일의 내용 + 2번째 파일의 내용과 같은 상태가 되어있으므로 맨 앞의 2번째 파일 내용 삭제하기
with open('indata-16.txt', 'rt', encoding='UTF8') as data:
    lines = data.readlines()
with open('indata-16.txt', 'w',encoding='utf-8') as fout:
    fout.writelines(lines[4:])

infile2.close()
        