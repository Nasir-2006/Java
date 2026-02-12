# --------------------replacing space with some other characters-----------------
# name = input()
# print(name.replace(" ","..."))
# --------------------faces--------------
# def main():
#  name = input()
#  result = face(name)
#  print(result)
# def face(exp):
#     exp = exp.replace(":)","😊")
#     exp = exp.replace(":(","☹️")
#     return exp
# main()
# ----------------Einstein-----------------
# c = 300000000
# mass = int(input('m:'))
# res = mass * pow(c,2)
# print(f"E:{res}")
# ------------------Tip-------------------
def main():
    dollars = dollars_to_float(input("How much was the meal? "))
    percent = percent_to_float(input("What percentage would you like to tip? "))
    tip = dollars * percent
    print(f"Leave ${tip:.2f}")


def dollars_to_float(d):
    res = d.replace("$","")
    res2 = float(res)
    return res2

def percent_to_float(p):
    res3 = p.replace("%","")
    res4 = float(res3)
    last = res4 / 100
    return last
main()
