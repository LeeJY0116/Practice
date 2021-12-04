inputword = input("단어를 입력하세요.")


for j in range(len(inputword)):
  for i in range(len(inputword) - j ):
    print(inputword[i:i + j + 1])