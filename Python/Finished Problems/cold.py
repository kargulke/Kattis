loops = raw_input()
for loop in range(0, int(loops)):
    statement = raw_input()
    if(statement[:10]=="simon says"):
        spaces = 0
        while statement[10+spaces:10+spaces+1] == " ":
            spaces += 1
            print statement[10+spaces:10+spaces+1]
        print statement[10+spaces:]
    
    