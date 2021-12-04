def main() :
    print("높이가 9, 길이가 10이라면?")
    inheight = int(input("높이를 입력하세요 : "))
    inLength = int(input("길이를 입력하세요 : "))
    print("부피:", pyramidVolume(inheight, inLength))
    print("예상: 300")
    print("높이가 0, 길이가 10이라면?")
    inheight = int(input("높이를 입력하세요 : "))
    inLength = int(input("길이를 입력하세요 : "))
    print("부피:", pyramidVolume(inheight, inLength))
    print("예상: 0")

def pyramidVolume(height, baseLength) :
    baseArea = baseLength * baseLength
    return height * baseArea / 3

main()