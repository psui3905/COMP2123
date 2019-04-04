
numbers = []
while True:
    print("we go again!")
    try:
        data = input("Watting for input:")
        nums = data.split()
        i = 0
        while i < len(nums):
            numbers.append(float(nums[i]))
            i+=1
    except EOFError:
        break;
