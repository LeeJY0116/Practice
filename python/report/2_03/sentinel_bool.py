# 보초값으로 Bool 변수 사용하여 재작성하기

total = 0.0
count = 0
variable_bool = True

salary = 0.0

# Bool 변수를 True로 선언한 뒤, while문에서 Bool 변수를 보초값으로 넣으면 무한루프가 동작합니다.
while variable_bool:
    salary = float(input("Enter a salary or -1 to finish: "))
    if salary >= 0.0 :
        total = total + salary
        count = count + 1
    else :
        variable_bool = False
# if문에서 0보다 작은지 검사한 뒤, 0보다 작다면 else문으로 넘어와 Bool 변수를 False로 값을 변경하여 무한루프문에서 탈출합니다.

if count > 0 :
    average = total / count
    print("Average salary is", average)
else :
    print("No data was entered.")