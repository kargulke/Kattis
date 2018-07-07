shift = int(raw_input());
array = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_."
while(shift!=0):
    phrase = raw_input()
    for x in range(len(phrase), 0, -1):
        num = ord(phrase[x-1])
        pos = 0
        if(num==95):
            pos = 27
        elif(num==46):
            pos = 28
        else:
            pos = num-65
            print pos
        print array[(pos+shift)%len(array)]
        
    shift = int(raw_input());