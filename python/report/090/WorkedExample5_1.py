from random import randint

def main() :
    print("암호의 글자수를 입력해주세요(정수로만) :", end="")
    userinput = int(input())
    result = makePassword(userinput)
    print(result)

def makePassword(length) :
    password = ""
   
    for i in range(length - 2) :
        password = password + randomCharacter("abcdefghijklmnopqrstuvwxyz")
 
    randomDigit = randomCharacter("0123456789")
    password = insertAtRandom(password, randomDigit)
 
    randomSymbol = randomCharacter("+-*/?!@#$%&")
    password = insertAtRandom(password, randomSymbol)
 
    return password


def randomCharacter(characters) :
   n = len(characters)
   r = randint(0, n - 1)
   return characters[r] 

def insertAtRandom(string, toInsert) :   
    n = len(string)
    r = randint(0, n)
    result = ""

    for i in range(r) :
        result = result + string[i]
    result = result + toInsert
    for i in range(r, n) :
        result = result + string[i]
   
    return result

main()