# for문을 사용하여 재작성하기

total = 0.0
count = 0

salary = 0.0

# 무한루프나 다름없는 매우 큰 숫자만큼 for문을 반복시킵니다.
for _ in range(999999) :
    salary = float(input("Enter a salary or -1 to finish: "))
    if salary >= 0.0 :
        total = total + salary
        count = count + 1
    else : 
        break
# if문에서 양수인지 음수인지 검사한 뒤, 음수라면 else문으로 넘어와 break문으로 무한루프에서 빠져나옵니다.

if count > 0 :
    average = total / count
    print("Average salary is", average)
else :
    print("No data was entered.")