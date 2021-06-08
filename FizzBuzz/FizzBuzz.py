#Practicing coding use FizzBuzz in Python
#FizzBuzz is a program that counts from 1 to 100,
#replacing multiples of 3 with fizz and multiples of 5 with buzz

#first loop through 100
for fizzbuzz in range(100):

    # Number divisible by 15,
    #(divisible by both 3 & 5)
    #print FizzBuzz in place of the number

    if fizzbuzz % 15 == 0:
        print("FizzBuzz")
        continue

    #Number divisible by 3, print Fizz
    elif fizzbuzz % 3 == 0:
        print("Fizz")
        continue

    #number divisible by 5, print Buzz
    elif fizzbuzz % 5 == 0:
        print("Buzz")
        continue

    #print the other numbers
    print(fizzbuzz)
