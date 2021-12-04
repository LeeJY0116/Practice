STAMP_PRICE = 49

getDollar = input("지불할 달러를 입력해주세요 : ")
dollars = int(getDollar)

firstStamps = 100 * dollars // STAMP_PRICE
pennyStamps = 100 * dollars - firstStamps * STAMP_PRICE
print("일급우표 : %4d" % firstStamps,"장")
print("페니우표 : %4d" % pennyStamps,"장")