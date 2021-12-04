# 문자열에서 대문자만 출력

userinput = input("문장을 입력하세요.")

for sentence in userinput :
    if sentence.isupper() :
        print(sentence, end = "")
#for문을 사용하여 sentence변수가 userinput을 한글자씩 읽게 만듭니다.
#그 뒤에 if문과 isupper를 사용하여 sentence가 대문자라면 print 합니다.