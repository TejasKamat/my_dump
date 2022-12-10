import datetime
from pygame import mixer
import time

mixer.init()

def remind_water():
    inpw = input("Enter 'done' after drinking 1 glass of water (200ml): ")
    if inpw == 'done':
        with open("water.txt", "a") as water:
            water.write(f"\n\t{now}\t Drank water")
    else:
        print("Invalid input, Enter again!")
        remind_water()


def remind_eye():
    inpe = input("Enter 'eydone' after doing exercise of eyes (this will run after every 30 minutes): ")
    if inpe == 'eydone':
        with open("eyes.txt", "a") as eyes:
            eyes.write(f"\n\t{now}\t did eyes exercise")
    else:
        print("Invalid input, Enter again!")
        remind_eye()


def remind_physical():
    inpp = input("Enter 'exdone' after doing physical exercise (this will run after every 30 minutes: ")
    if inpp == 'exdone':
        with open("physical.txt", "a") as physical:
            physical.write(f"\n\t{now}\t did physical exercise")
    else:
        print("Invalid input, Enter again!")
        remind_physical()


while True:
    now = datetime.datetime.now()
    if 9 <= now.hour <= 17:
        if 26 == now.minute:
            remind_water()
        if 30 == now.minute:
            remind_eye()
        if 45 == now.minute:
            remind_physical()
    else:
        time.sleep(50)
        pass
