from sys import argv                                                                            # 명령행 인자를 위해 sys모듈의 argv를 import해줍니다.
filenames = []                                                                                  # 파일의 이름들을 저장할 변수입니다.
for i in range(1,len(argv)):                                                                    # 0번 인덱스는 py파일이므로 1번인덱스부터 argv의 길이만큼 반복합니다.
    filenames.append(argv[i])                                                                   # argv가 갖고 있는 파일의 이름들을 filenames에 추가합니다.
with open('indata-30+{}.txt'.format(len(argv)-2), 'w', encoding='utf-8' ) as outfile :          # 사용 후 자동으로 close() 해주기 위해 with을 이용하여 open합니다. 
#포맷을 이용하여 outfile의 이름을 합치는 파일의 갯수에 따라 변경되게끔 했습니다.
    for file in filenames :                                                                     # filenames에 들어있는 파일 이름들을 하나씩 file 변수에 입력합니다.
        line = "---------------------------" + file + "----------------------------" + "\n"     # 어느 파일을 합쳤는지 보여줌과 동시에 구분선 역할을 하는 부분입니다.
        outfile.write(line)
        with open(file, encoding='utf-8') as infile :                                           # with open을 사용하여 file을 열고 infile이라는 이름으로 사용합니다.
            lines = infile.readlines()                                                          # infile을 readlines로 읽어서 lines 변수에 입력합니다. 
            for line in lines :
                line = line.rstrip('\n')                                                        # line에서 행 끝의 개행문자들을 삭제합니다.
                data = '{0}\n'.format(line)                                                     # data에 line의 내용과 개행문자를 저장합니다.
                outfile.write(data)                                                             # data를 outfile에 입력합니다.