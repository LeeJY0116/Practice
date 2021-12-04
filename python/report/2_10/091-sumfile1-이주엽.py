infile1 = open("indata-10.txt", "r", encoding='UTF-8')
infile2 = open("indata-11.txt", "r", encoding='UTF-8')
outfile = open("outdata-10+11.txt", "w")


def main() :
    sumTxt()
    infile1.close()
    infile2.close()
    outfile.close()
def sumTxt() :
    lines = 0
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
    # 두 번째 파일의 내용 읽은 후 위와 같이 출력하기
    for line in infile2 :
        if second == True :
            print("2021년 2학기 파이썬 2분반 퀴즈점수", file=outfile)
            second = False
        fields = line.split(" ")
        studentName = fields[0]
        scores = float(fields[1])
        print(studentName, scores, file=outfile)
main()