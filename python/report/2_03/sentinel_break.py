# break문을 사용하여 재작성하기

total = 0.0
count = 0

salary = 0.0

while True:
#while True:로 무한루프문을 만든 뒤 음수를 입력받으면 break문으로 탈출하는 방법입니다.
    salary = float(input("Enter a salary or -1 to finish: "))
    if salary >= 0.0 :
        total = total + salary
        count = count + 1
    else :
        break
# if문에서 0보다 작은지 검사한 뒤, 0보다 작다면 else문으로 넘어와 break문을 실행시킴으로써 무한루프에서 탈출합니다.

if count > 0 :
    average = total / count
    print("Average salary is", average)
else :
    print("No data was entered.")