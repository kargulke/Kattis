loop = int(raw_input())
for x in range(loop):
    string = raw_input()
    if(len(string) > 11):
        if(string[:11] == "simon says"):
            print string[11:]