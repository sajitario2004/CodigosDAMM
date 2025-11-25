import threading 
import time

def suma(n1, n2):
    print(n1+n2)

sum1 = threading.Thread(target=suma, args=(8,2))
sum2 = threading.Thread(target=suma, args=(220000,100001), daemon=True)

sum2.start()
sum1.start()


