print("Welcome to my Kairi quiz! We will test your knowlegde about the best cat in the world.")

playing = input("Do you want to play? ")

if playing.lower() != "yes":
    print("how rude. BYE.")
    quit()
else:
    print("Ok, lets start! :3")
score = 0
#1
one = input("What is Kairi's favorite animal?: ")

if one.lower() != "centipede":
    print("Wrong!")
else:
    print("Nice! That was an easy one.")
    score += 1

print("Next question:")
#2

two = input("What is Kairi's favorite food?: ")

if two.lower() != "squeezable":
    print("Wrong!")
else:
    print("Good Job! ")
    score += 1

print("Next question:")
#3
three = input("How old is kairi? ")

if three.lower() != "baby age":
    print("Wrong! The correct answer is baby age. Fake fan.")
else:
    print("Wow! You are a true fan <3")
    score += 1

print("You got a score of " + str(score) + "/3!")

if score == 3:
    print("Great job! You are a genius. (=^v^=)")
elif score >= 1:
    print("You can do better than that. Try again growls.")
if score == 0:
    print("WHAT IS WRONG WITH YOU? You are the fakest fan ever.")


print("Come back soon!")


