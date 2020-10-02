a = input("Enter Your Name : ")
print("Hello, ", a)
print()

b = input('Enter a String : ').split()
c = input('Enter a Letter that you want to count : ')
m = 0
for i in range(len(b)):
    for j in range(len(b[i])):
        if c == b[i][j]:
            m += 1
print(f'The letter {c} is in String for {m} times.')
