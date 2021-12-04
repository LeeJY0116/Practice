PENNIES_PER_DOLLAR = 100
PENNIES_PER_QUARTER = 25

userInput = input("지불할 금액을 입력해주세요 (1 = 1달러, 5 = 5달러, 등.) : ")
billValue = int(userInput)
userInput = input("제품의 가격이 몇 페니인지 입력해주세요 : ")
itemPrice = int(userInput)

changeDue = PENNIES_PER_DOLLAR * billValue - itemPrice
dollarCoins = changeDue // PENNIES_PER_DOLLAR
changeDue = changeDue % PENNIES_PER_DOLLAR
quarters = changeDue // PENNIES_PER_QUARTER

print("거스름돈 : %5d" % dollarCoins,"달러" + "%5d"% quarters,"쿼터")